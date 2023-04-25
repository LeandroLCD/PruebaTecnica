package com.leandrolcd.pruebatecnica.ui.utilities

import com.leandrolcd.pruebatecnica.ui.activate.state.ActivateUiState
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

suspend fun makeNetworkCall(dispatcher: CoroutineDispatcher = Dispatchers.IO, call: suspend () -> Unit): ActivateUiState {
    return withContext(dispatcher) {
        try {
            ActivateUiState.Success(call())
        } catch (e: Exception){
            ActivateUiState.Error(message = e.message.toString())
        }


    }
}
