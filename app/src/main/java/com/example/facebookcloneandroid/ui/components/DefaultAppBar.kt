package com.example.facebookcloneandroid.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.facebookcloneandroid.R
import com.example.facebookcloneandroid.ui.theme.GreyAAA

@Composable
fun DefaultAppBar(
    title: String = "",
    onBack: () -> Unit
) {
    Column(
        modifier = Modifier.background(Color.White)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 13.dp, horizontal = 21.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = R.drawable.arrow_back),
                contentDescription = null,
                modifier = Modifier
                    .width(13.dp)
                    .clickable {
                        onBack()
                    }
            )
            Box(modifier = Modifier.width(10.dp))
            Text(
                modifier = Modifier
                    .padding(horizontal = 10.dp),
                text = title,
                style = TextStyle(
                    fontSize = 14.sp,
                    fontWeight = FontWeight.W400,
                    color = Color.Black,
                )
            )
        }
        Divider (
            color = GreyAAA,
            modifier = Modifier
                .height(1.dp)
                .fillMaxWidth()
        )
    }
}