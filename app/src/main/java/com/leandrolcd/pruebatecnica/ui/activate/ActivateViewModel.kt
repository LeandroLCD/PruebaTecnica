package com.leandrolcd.pruebatecnica.ui.activate

import android.util.Log
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.navigation.NavHostController
import com.leandrolcd.pruebatecnica.domain.usecase.ActivateUseCase
import com.leandrolcd.pruebatecnica.ui.activate.Models.DeviceInfo
import com.leandrolcd.pruebatecnica.ui.activate.state.ActivateUiState
import com.leandrolcd.pruebatecnica.ui.utilities.Routes
import com.leandrolcd.pruebatecnica.ui.utilities.makeNetworkCall
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ActivateViewModel @Inject constructor(
    private val activateUseCase: ActivateUseCase,
    private val dispatcher: CoroutineDispatcher
) : ViewModel() {

    companion object {
        const val ACT_PREFS = "activationsData"
    }


lateinit var navHostController: NavHostController


    var uiStatus = mutableStateOf<ActivateUiState>(ActivateUiState.Loaded)
        private set

    var hostName = mutableStateOf<String>("")
        private set

    var serial = mutableStateOf<String>("")
        private set

    var isButtonEnabled = mutableStateOf(false)
        private set

    init {
        serial.value = "35ab1234567890"
        hostName.value = "TerminalBarra1"
        isButtonEnabled.value = true
    }
    fun onFieldChange(host: String, _serial: String) {
        hostName.value = host
        serial.value = _serial
        isButtonEnabled.value = enabledButton(host, _serial)

    }

    private fun enabledButton(host: String, _serial: String): Boolean =
        host.isEmpty() && _serial.isEmpty()

    fun activatePos(hostName: String, serial: String) {
        viewModelScope.launch {
          uiStatus.value =  makeNetworkCall(dispatcher) {
                activateUseCase(DeviceInfo(hostName, serial))
            }
            if(uiStatus.value is ActivateUiState.Success){

            }
            Log.d("TAG", "activatePos: ${uiStatus.value}")

        }

    }

    fun checkedActivation(navHostController: NavHostController) {
        this@ActivateViewModel.navHostController = navHostController
        val activation = activateUseCase.getActivationData()
        Log.d("TAG", "checkedActivation: $activation")
        if (activation != null) {
            uiStatus.value = ActivateUiState.Success(activation)
            navHostController.popBackStack()
            navHostController.navigate(Routes.ScreenMenu.route)
        }
    }





}