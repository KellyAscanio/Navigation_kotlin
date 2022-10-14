package com.example.navegacion.navegation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

import androidx.navigation.compose.rememberNavController
import com.example.navegacion.screens.PrimerScreen
import com.example.navegacion.screens.SecondScreen
import com.example.navegacion.screens.ThirdScreen

@Composable

fun AppNavigation(){
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = AppScreens.PrimerScreen.route

        ){
        composable(route= AppScreens.PrimerScreen.route){
            PrimerScreen(navController)
        }
        composable(route= AppScreens.SecondScreen.route){
            SecondScreen(navController)
        }
        composable(route= AppScreens.ThirdScreen.route){
            ThirdScreen(navController)
        }
    }
}