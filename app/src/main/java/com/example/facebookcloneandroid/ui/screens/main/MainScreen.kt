package com.example.facebookcloneandroid.ui.screens.main

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import com.example.facebookcloneandroid.navigation.NavGraph

@Composable
fun MainScreen(
) {
    var navController = rememberNavController()
    NavGraph(navController = navController, modifier = Modifier.fillMaxSize())
}