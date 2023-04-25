package com.leandrolcd.pruebatecnica.ui.activate

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Edit
import androidx.compose.material.icons.outlined.Phone
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.onFocusEvent
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import com.airbnb.lottie.compose.*
import com.leandrolcd.pruebatecnica.R
import com.leandrolcd.pruebatecnica.ui.activate.state.ActivateUiState

@Composable
fun ActivationScreen( navHostController: NavHostController,viewModel: ActivateViewModel = hiltViewModel()) {
    viewModel.navHostController = navHostController
    when (val status = viewModel.uiStatus.value) {
        is ActivateUiState.Error -> ErrorScreen(status.message)
        ActivateUiState.Loaded -> {
            ActivateContent(viewModel)
        }
        ActivateUiState.Loading -> LoadingScreen()
        is ActivateUiState.Success -> {

        }
    }
}

@Composable
fun ActivateContent(viewModel: ActivateViewModel) {
    Box() {
        Column(Modifier.fillMaxSize()) {
            val host = viewModel.hostName.value
            val serial = viewModel.serial.value
            TextFields(
                label = "Nombre del Dispositivo",
                text = host,
                onValueChange = { viewModel.onFieldChange(it, serial) },
                icons = { Icons.Outlined.Phone}) {

            }
            TextFields(
                label = "Serial del Dispositivo",
                text = serial,
                onValueChange = { viewModel.onFieldChange(host, it) },
                icons = { Icons.Outlined.Edit}) {

            }
            Spacer(modifier = Modifier.weight(1f))
            val enabled = viewModel.isButtonEnabled.value
            OutlinedButton(onClick = { viewModel.activatePos(host,serial) },
                enabled = enabled,
                colors = ButtonDefaults.buttonColors(backgroundColor = Color.Magenta,
                disabledContentColor = Color.Gray)
                ) {
                Text(text = "Activar")
            }

        }
    }
}

@Composable
fun TextFields(
    modifier: Modifier = Modifier,
    label: String,
    text: String,
    onValueChange: (String) -> Unit,
    icons: @Composable () -> Unit,
    onComplete: () -> Unit
) {
    TextField(
        placeholder = { Text(text = label, color = Color.Black) }, value = text,
        onValueChange = { onValueChange(it) },
        leadingIcon = icons,
        singleLine = true,
        keyboardOptions = KeyboardOptions(
            keyboardType = KeyboardType.Email,
            imeAction = ImeAction.Next
        ),
        keyboardActions = KeyboardActions(onDone = {
            onComplete()
        }),
        colors = TextFieldDefaults.outlinedTextFieldColors(
            textColor = Color.Black,
            disabledLabelColor = Color.Gray,
            errorBorderColor = Color.Red,
            focusedBorderColor = Color.Magenta,
            unfocusedBorderColor = Color.Transparent
        ),
        shape = RoundedCornerShape(8.dp),
        modifier = modifier
            .padding(bottom = 12.dp)
            .onFocusEvent {
                onComplete()

            }


    )
}

@Composable
fun LoadingScreen() {
    val composition by rememberLottieComposition(spec = LottieCompositionSpec.RawRes(R.raw.loading))
    val progress by animateLottieCompositionAsState(
        composition,
        iterations = LottieConstants.IterateForever,
        isPlaying = true,
        restartOnPlay = true
    )
    Box(modifier = Modifier.fillMaxSize()) {
        LottieAnimation(
            composition = composition,
            progress = progress,
            modifier = Modifier.fillMaxSize()
        )

    }

}

@Composable
fun ErrorScreen(message: String) {

}
