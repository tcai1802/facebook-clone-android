package com.example.facebookcloneandroid.navigation

import CreateNewPasswordScreen
import JoinFacebookScreenScreen
import LoginScreen
import WhatYourNameScreen
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.facebookcloneandroid.ui.screens.dashboard.DashBoardScreen
import com.example.facebookcloneandroid.ui.screens.forgot_password.ForgotPasswordScreen
import com.example.facebookcloneandroid.ui.screens.otp_verify.OtpVerifyScreen
import com.example.facebookcloneandroid.ui.screens.splash.SplashScreen
import com.example.facebookcloneandroid.ui.screens.what_your_birthday.WhatYourBirthDayScreen


@Composable
fun NavGraph(
    navController: NavHostController,
    modifier: Modifier
) {
    NavHost(
        navController = navController,
        startDestination = Routes.Splash.route
    ) {
        composable(
            route = Routes.Splash.route,
        ) {
            SplashScreen(
                changePage =  {
                    navController.navigate(Routes.Login.route)
                }
            )
        }
        composable(
            route = Routes.DashBoard.route,
        ) {
            DashBoardScreen()
        }
        composable(
            route = Routes.Login.route,
        ) {
            LoginScreen(
                onNavigate = { route -> navController.navigate(route) }
            )
        }
        composable(
            route = Routes.ForgotPassword.route,
        ) {
            ForgotPasswordScreen(
                onNavigate = { route -> navController.navigate(route) }
            )
        }
        composable(
            route = Routes.OtpVerify.route,
        ) {
            OtpVerifyScreen(
                onNavigate = { route -> navController.navigate(route) }
            )
        }
        composable(
            route = Routes.CreateNewPassword.route,
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
        composable(
            route = Routes.JoinFacebook.route,
        ) {
            JoinFacebookScreenScreen(
                onNavigate = { route -> navController.navigate(route) {
                    popUpTo(route) {
                        inclusive = true
                        saveState = true
                    }
                } }
            )
        }
        composable(
            route = Routes.WhatYourName.route,
        ) {
            WhatYourNameScreen(
                onNavigate = { route -> navController.navigate(route) {
                    popUpTo(route) {
                        inclusive = true
                        saveState = true
                    }
                } }
            )
        }
        composable(
            route = Routes.WhatYourBirthday.route,
        ) {
            WhatYourBirthDayScreen(
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