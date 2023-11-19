package com.example.facebookcloneandroid.ui.screens.dashboard.components

import android.util.Log
import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.facebookcloneandroid.R
import com.example.facebookcloneandroid.ui.theme.Blue384CFF

enum class DashBoardTabBarEnum (
    @DrawableRes val iconUrl: Int = 0,
    @DrawableRes val iconSelectedUrl: Int = 0,
) {
    Home(iconUrl = R.drawable.ic_home, iconSelectedUrl = R.drawable.ic_home_selected),
    Friends(iconUrl = R.drawable.ic_friend, iconSelectedUrl = R.drawable.ic_friend_selected),
    Personal(iconUrl = R.drawable.ic_personal, iconSelectedUrl = R.drawable.ic_personal_selected),
    WatchVideo(iconUrl = R.drawable.ic_watch_video, iconSelectedUrl = R.drawable.ic_watch_video_selected),
    Notification(iconUrl = R.drawable.ic_notification, iconSelectedUrl = R.drawable.ic_notification_selected),
    Menu(iconUrl = R.drawable.ic_menu, iconSelectedUrl = R.drawable.ic_menu_selected),
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DashBoardTabBarPreview() {
    DashBoardTabBar()
}


@Composable
fun DashBoardTabBar(
    currentTabSelected: DashBoardTabBarEnum = DashBoardTabBarEnum.Home,
    onSelectedTab: (selectedTab: DashBoardTabBarEnum) -> Unit = {},
) {
    Row(
        horizontalArrangement = Arrangement.SpaceEvenly,
        modifier = Modifier
            .fillMaxWidth()
            .padding(bottom = 17.dp)
    ) {
        DashBoardTabBarEnum.values().map { value ->
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(id = if(currentTabSelected == value) value.iconSelectedUrl else value.iconUrl),
                    contentDescription = null,
                    modifier = Modifier
                        .height(21.dp)
                        .clickable {
                            onSelectedTab(value)
                            Log.d(null, "TODO: Chat screen")
                        }
                )
                Spacer(modifier = Modifier.height(4.dp))
                if(currentTabSelected == value) Box(
                    modifier = Modifier
                        .width(4.dp)
                        .height(4.dp)
                        .clip(CircleShape)
                        .background(Blue384CFF)
                ) {

                }
            }
        }
    }
}