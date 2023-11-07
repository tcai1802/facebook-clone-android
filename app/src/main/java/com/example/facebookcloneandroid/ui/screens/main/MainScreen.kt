package com.example.facebookcloneandroid.ui.screens.main

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.facebookcloneandroid.navigation.NavGraph
import com.example.facebookcloneandroid.navigation.NavigationScreen
import com.example.facebookcloneandroid.ui.components.DefaultAppBar

enum class BaseScreen {
}

@Composable
fun MainScreen(
) {
    var navController = rememberNavController()
    val backStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = backStackEntry?.destination?.route ?: NavigationScreen.Splash.route

    Column {
        when(currentRoute) {
            NavigationScreen.OtpVerify.route,
            NavigationScreen.CreateNewPassword.route,
            NavigationScreen.ForgotPassword.route -> DefaultAppBar(
                title = when(currentRoute) {
                    NavigationScreen.OtpVerify.route -> NavigationScreen.OtpVerify.title
                    NavigationScreen.ForgotPassword.route -> NavigationScreen.ForgotPassword.title
                    NavigationScreen.CreateNewPassword.route -> NavigationScreen.CreateNewPassword.title
                    else -> ""
                },
                onBack = {
                    navController.popBackStack()
                }
            )
        }
        NavGraph(
            navController = navController,
            modifier = Modifier
                .fillMaxSize()
        )
    }
}