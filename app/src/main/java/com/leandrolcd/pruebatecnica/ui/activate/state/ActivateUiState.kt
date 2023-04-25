package com.leandrolcd.pruebatecnica.ui.activate.state

sealed class ActivateUiState{

    object Loaded: ActivateUiState()

    object Loading: ActivateUiState()

    class Success(data: Any) : ActivateUiState()

    data class Error(val message: String) : ActivateUiState()

}
