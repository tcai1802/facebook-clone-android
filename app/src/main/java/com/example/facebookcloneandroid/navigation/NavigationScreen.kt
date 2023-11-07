package com.example.facebookcloneandroid.navigation

sealed class NavigationScreen(
    val route: String,
    val title: String  = "",
) {
    object Splash : NavigationScreen(route = "splash_screen")
    object DashBoard : NavigationScreen(route = "dashboard_screen")
    object Login : NavigationScreen(route = "login_screen")
    object ForgotPassword : NavigationScreen(route = "forgot_password", title = "Find Your Account")
    object OtpVerify : NavigationScreen(route = "otp_verify", title = "Find Your Account")
    object CreateNewPassword : NavigationScreen(route = "create_new_password", title = "Reset your password")
}