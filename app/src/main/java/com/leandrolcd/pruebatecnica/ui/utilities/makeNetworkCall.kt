package com.leandrolcd.pruebatecnica.ui.utilities

import com.leandrolcd.pruebatecnica.ui.activate.state.ActivateUiState
import com.leandrolcd.pruebatecnica.ui.menu.states.MenuUiState
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

suspend fun makeNetworkCallMenu(dispatcher: CoroutineDispatcher = Dispatchers.IO, call: suspend () -> Unit): MenuUiState {
    return withContext(dispatcher) {
        try {
            MenuUiState.Success(call())
        } catch (e: Exception){
            MenuUiState.Error(message = e.message.toString())
        }


    }
}
