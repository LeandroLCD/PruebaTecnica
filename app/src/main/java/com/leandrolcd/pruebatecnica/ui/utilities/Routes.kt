package com.leandrolcd.pruebatecnica.ui.utilities

sealed class Routes(val route:String){
    object ScreenLoading: Routes("LoadingScreen")

    object ScreenActivation: Routes("ActivationScreen")
    object ScreenMenu: Routes("MenuScreen")
}
