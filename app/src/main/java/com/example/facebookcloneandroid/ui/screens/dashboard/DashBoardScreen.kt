package com.example.facebookcloneandroid.ui.screens.dashboard

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.facebookcloneandroid.R


@Composable
fun DashBoardScreen(
    modifier: Modifier = Modifier,
) {
    Column {
        Image(
            painter = painterResource(id = R.drawable.logo),
            contentDescription = null,
            modifier = Modifier
                .width(130.dp)
                .height(100.dp)
        )
        Text(text = "DashBoardScreen")
    }
}