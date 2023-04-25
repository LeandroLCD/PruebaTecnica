package com.leandrolcd.pruebatecnica.ui.start

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.navigation.NavHostController
import com.leandrolcd.pruebatecnica.ui.activate.LoadingScreen
import com.leandrolcd.pruebatecnica.ui.utilities.Routes
import kotlinx.coroutines.delay

@Composable
fun StartScreen(navController: NavHostController) {
    LaunchedEffect(true){
        delay(2000)
        navController.popBackStack()
        navController.navigate(Routes.ScreenActivation.route)

    }

    LoadingScreen()

}
