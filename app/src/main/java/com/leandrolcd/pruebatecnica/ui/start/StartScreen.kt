package com.leandrolcd.pruebatecnica.ui.start

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import com.leandrolcd.pruebatecnica.ui.activate.ActivateViewModel
import com.leandrolcd.pruebatecnica.ui.activate.LoadingScreen
import com.leandrolcd.pruebatecnica.ui.utilities.Routes
import kotlinx.coroutines.delay



@Composable
fun StartScreen(navController: NavHostController, viewModel: ActivateViewModel = hiltViewModel()) {
    LaunchedEffect(true){
        viewModel.checkedActivation(navController)
        delay(2000)
        navController.popBackStack()
        navController.navigate(Routes.ScreenActivation.route)

    }

    LoadingScreen()

}
