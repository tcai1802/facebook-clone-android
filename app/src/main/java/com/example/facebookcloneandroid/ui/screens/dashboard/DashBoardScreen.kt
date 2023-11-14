package com.example.facebookcloneandroid.ui.screens.dashboard

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.facebookcloneandroid.ui.screens.dashboard.components.DashBoardAppBar
import com.example.facebookcloneandroid.ui.screens.dashboard.components.DashBoardTabBar
import com.example.facebookcloneandroid.ui.screens.dashboard.components.DashBoardTabBarEnum
import com.example.facebookcloneandroid.ui.screens.dashboard.home_tab_screen.HomeTabScreen

@Preview(showSystemUi = true)
@Composable

fun DashBoardScreenPreview() {
    DashBoardScreen()
}
@Composable
fun DashBoardScreen(
    modifier: Modifier = Modifier,
) {
    var currentTab = remember {
        mutableStateOf(DashBoardTabBarEnum.Home)
    }
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        DashBoardAppBar()
        DashBoardTabBar(
            currentTabSelected = currentTab.value,
            onSelectedTab = {
                currentTab.value = it
            }
        )
        HomeTabScreen()
        Spacer(modifier = Modifier.height(20.dp))
    }
}

