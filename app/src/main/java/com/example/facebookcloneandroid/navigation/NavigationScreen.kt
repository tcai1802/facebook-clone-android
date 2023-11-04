package com.example.facebookcloneandroid.navigation

sealed class NavigationScreen(
    val route: String,
    val objectName: String = "",
    val objectPath: String = "",
) {
    object Splash : NavigationScreen(route = "splash_screen")
    object DashBoard : NavigationScreen(route = "dashboard_screen")
    object Login : NavigationScreen(route = "login_screen")
}