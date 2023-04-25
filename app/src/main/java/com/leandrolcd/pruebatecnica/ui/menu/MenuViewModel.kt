package com.leandrolcd.pruebatecnica.ui.menu

import android.annotation.SuppressLint
import android.util.Log
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.leandrolcd.pruebatecnica.domain.usecase.MenuUseCase
import com.leandrolcd.pruebatecnica.ui.menu.models.Category
import com.leandrolcd.pruebatecnica.ui.menu.states.MenuUiState
import com.leandrolcd.pruebatecnica.ui.utilities.makeNetworkCallMenu
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.launch
import javax.inject.Inject
@HiltViewModel
class MenuViewModel @Inject constructor(
    private val menuUseCase: MenuUseCase,
    private val dispatcher: CoroutineDispatcher
) : ViewModel() {

    var uiState = mutableStateOf<MenuUiState>(MenuUiState.Loading)
        private set

    var menuList = mutableStateListOf<Category>()
        private set

    init {
        onLoadData()
    }

    @SuppressLint("SuspiciousIndentation")
    private fun onLoadData() {
        viewModelScope.launch {
            uiState.value = makeNetworkCallMenu(dispatcher) {
                val list = menuUseCase.invoke()
                Log.d("TAG", "onLoadData: $list")
                    menuList.addAll(list)
            }
        }
    }
}