package com.example.facebookcloneandroid.ui.screens.dashboard.home_tab_screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.facebookcloneandroid.ui.screens.dashboard.home_tab_screen.components.CreatePostInput
import com.example.facebookcloneandroid.ui.screens.dashboard.home_tab_screen.components.PostType
import com.example.facebookcloneandroid.ui.screens.dashboard.home_tab_screen.components.PostWidget
import com.example.facebookcloneandroid.ui.screens.dashboard.home_tab_screen.components.StoryHomeWidget

@Preview(showSystemUi = true)
@Composable
fun HomeTabScreenPreview() {
    HomeTabScreen()
}

@Composable
fun HomeTabScreen(
) {
    Column(
        modifier = Modifier.verticalScroll(rememberScrollState())
    ) {
        CreatePostInput()
        StoryHomeWidget()
        Spacer(modifier = Modifier.height(50.dp))
        PostWidget(PostType.UpdateAvatar)
        PostWidget()
        PostWidget()
    }
}