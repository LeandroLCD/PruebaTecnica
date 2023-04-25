package com.leandrolcd.pruebatecnica

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.leandrolcd.pruebatecnica.ui.activate.ActivationScreen
import com.leandrolcd.pruebatecnica.ui.start.StartScreen
import com.leandrolcd.pruebatecnica.ui.theme.PruebaTecnicaTheme
import com.leandrolcd.pruebatecnica.ui.utilities.Routes
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PruebaTecnicaTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    OnRegisterRoutes()
                }
            }
        }
    }
}
@Composable
fun OnRegisterRoutes() {
    val navigationController = rememberNavController()

    NavHost(navController = navigationController, startDestination = Routes.ScreenLoading.route) {
        composable(route = Routes.ScreenLoading.route) {
            StartScreen(navigationController)
        }
        composable(route = Routes.ScreenActivation.route) {
            ActivationScreen(navigationController)
        }
    }
}



@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    PruebaTecnicaTheme {
        Greeting("Android")
    }
}