package com.leandrolcd.pruebatecnica.ui.menu.states

import com.leandrolcd.pruebatecnica.ui.activate.state.ActivateUiState

sealed class MenuUiState(){

    object Loading: MenuUiState()

    class Success(data: Any) : MenuUiState()

    data class Error(val message: String) : MenuUiState()
}
