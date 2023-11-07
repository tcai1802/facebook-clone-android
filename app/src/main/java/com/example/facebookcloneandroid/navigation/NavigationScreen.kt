package com.example.facebookcloneandroid.navigation

sealed class NavigationScreen(
    val route: String,
    val objectName: String = "",
    val objectPath: String = "",
    val title: String  = "",
) {
    object Splash : NavigationScreen(route = "splash_screen")
    object DashBoard : NavigationScreen(route = "dashboard_screen")
    object Login : NavigationScreen(route = "login_screen")
    object ForgotPassword : NavigationScreen(route = "forgot_password", title = "Find Your Account")
}