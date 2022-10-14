package com.example.navegacion.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.navegacion.navegation.AppScreens
@Composable
fun ThirdScreen(navController: NavController) {
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
        ThirdBodyContent(navController)
    }
}

@Composable
fun ThirdBodyContent(navController: NavController){
    Column(
        modifier= Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {

        Text(text = "Tercera Pantalla")
        Button(onClick = {
            navController.navigate(AppScreens.PrimerScreen.route)
        }) {
            Text(text = "Mostrar Primer Pantalla")
        }
        Button(onClick = {
            navController.navigate(AppScreens.SecondScreen.route)
        }) {
            Text(text = "Mostrar Segunda Pantalla")
        }

    }
}