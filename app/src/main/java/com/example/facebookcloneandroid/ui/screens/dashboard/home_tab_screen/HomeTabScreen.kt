package com.example.facebookcloneandroid.ui.screens.dashboard.home_tab_screen

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.facebookcloneandroid.ui.screens.dashboard.home_tab_screen.components.CreatePostInput

@Preview(showSystemUi = true)
@Composable
fun HomeTabScreenPreview() {
    HomeTabScreen()
}

@Composable
fun HomeTabScreen(
) {
    Column(
    ) {
        CreatePostInput()
    }
}