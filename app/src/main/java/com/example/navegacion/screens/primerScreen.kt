package com.example.navegacion.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.navegacion.navegation.AppScreens

@Composable

fun PrimerScreen(navController: NavController) {
    Scaffold (
        topBar = {
        TopAppBar() {
            Icon(
                imageVector = Icons.Default.ArrowBack,
                contentDescription = "Arrow Back",
                modifier = Modifier.clickable {
                    navController.popBackStack()
                }
            )
            Spacer(modifier = Modifier.width(8.dp))
            Text(text = "Pantalla Anterior")

        }
    }){
        BodyContent(navController)
    }
}

@Composable
fun BodyContent(navController: NavController){
    Column(
        modifier= Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {

        Text(text = "Pantalla inicial")
        Button(onClick = {
            navController.navigate(AppScreens.ThirdScreen.route)
        }) {
            Text(text = "Mostrar")
        }
    }
}

