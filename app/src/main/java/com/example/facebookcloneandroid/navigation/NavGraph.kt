package com.example.facebookcloneandroid.navigation

import LoginScreen
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.facebookcloneandroid.ui.screens.dashboard.DashBoardScreen
import com.example.facebookcloneandroid.ui.screens.forgot_password.ForgotPasswordScreen
import com.example.facebookcloneandroid.ui.screens.otp_verify.CreateNewPasswordScreen
import com.example.facebookcloneandroid.ui.screens.otp_verify.OtpVerifyScreen
import com.example.facebookcloneandroid.ui.screens.splash.SplashScreen


@Composable
fun NavGraph(
    navController: NavHostController,
    modifier: Modifier
) {
    NavHost(
        navController = navController,
        startDestination = NavigationScreen.Splash.route
    ) {
        composable(
            route = NavigationScreen.Splash.route,
        ) {
            SplashScreen(
                changePage =  {
                    navController.navigate(NavigationScreen.Login.route)
                }
            )
        }
        composable(
            route = NavigationScreen.DashBoard.route,
        ) {
            DashBoardScreen()
        }
        composable(
            route = NavigationScreen.Login.route,
        ) {
            LoginScreen(
                onNavigate = { route -> navController.navigate(route) }
            )
        }
        composable(
            route = NavigationScreen.ForgotPassword.route,
        ) {
            ForgotPasswordScreen(
                onNavigate = { route -> navController.navigate(route) }
            )
        }
        composable(
            route = NavigationScreen.OtpVerify.route,
        ) {
            OtpVerifyScreen(
                onNavigate = { route -> navController.navigate(route) }
            )
        }
        composable(
            route = NavigationScreen.CreateNewPassword.route,
        ) {
            CreateNewPasswordScreen(
                onNavigate = { route -> navController.navigate(route) {
                    popUpTo(route) {
                        inclusive = true
                        saveState = true
                    }
                } }
            )
        }
    }
}