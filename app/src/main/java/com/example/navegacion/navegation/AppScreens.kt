package com.example.navegacion.navegation

sealed class AppScreens(val route: String){
    object PrimerScreen: AppScreens(route = "primerScreen")
    object SecondScreen: AppScreens(route = "secondScreen")
    object ThirdScreen: AppScreens(route = "thirdScreen")
}
