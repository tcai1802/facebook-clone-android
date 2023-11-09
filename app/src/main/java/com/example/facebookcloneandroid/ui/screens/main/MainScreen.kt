package com.example.facebookcloneandroid.ui.screens.main

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.facebookcloneandroid.navigation.NavGraph
import com.example.facebookcloneandroid.navigation.Routes
import com.example.facebookcloneandroid.ui.components.DefaultAppBar

@Composable
fun MainScreen(
) {
    var navController = rememberNavController()
    val backStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = backStackEntry?.destination?.route ?: Routes.Splash.route
    Column {
        when (currentRoute) {
            Routes.CreateNewPassword.route,
            Routes.ForgotPassword.route,
            Routes.JoinFacebook.route,
            Routes.WhatYourName.route,
            Routes.WhatYourBirthday.route,
            Routes.WhatYourGender.route,
            Routes.ContactNumber.route,
            Routes.ChoosePassword.route,
            Routes.TermsAndPrivacy.route,
            Routes.OtpVerify.route -> DefaultAppBar(
                title = Routes.values().find { it.route == currentRoute }?.title ?: 0,
                onBack = {
                    navController.popBackStack()
                }
            )
            else -> Box{}
        }
        NavGraph(
            navController = navController,
            modifier = Modifier
                .fillMaxSize()
        )
    }
}
