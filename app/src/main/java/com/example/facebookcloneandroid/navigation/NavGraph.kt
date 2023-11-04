package com.example.facebookcloneandroid.navigation

import LoginScreen
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.facebookcloneandroid.ui.screens.dashboard.DashBoardScreen
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
            LoginScreen()
        }
    }
}