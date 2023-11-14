package com.example.facebookcloneandroid.ui.screens.dashboard.components

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.facebookcloneandroid.R

@Composable
fun DashBoardAppbarPreview() {
    DashBoardAppBar()
}

@Composable
fun DashBoardAppBar() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(bottom = 19.dp, start = 20.dp, end = 20.dp, top = 10.dp)
    ) {
        Text(
            text = "facebook",
            fontSize = 20.sp,
            fontWeight = FontWeight.W700,
            style = TextStyle(
                brush = Brush.linearGradient(
                    colors = arrayListOf(colorResource(id = R.color.primary_1), colorResource(id = R.color.primary_2)),
                    start = Offset.Zero,
                    end = Offset(100.0f, 100.0f)
                )
            ),
            modifier = Modifier.weight(1f)
        )
        Image(
            painter = painterResource(id = R.drawable.fb_messenger),
            contentDescription = null,
            modifier = Modifier
                .width(26.dp)
                .height(26.dp)
                .clickable {
                    Log.d(null, "TODO: Chat screen")
                }
        )
    }
}