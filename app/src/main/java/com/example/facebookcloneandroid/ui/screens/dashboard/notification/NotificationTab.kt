package com.example.facebookcloneandroid.ui.screens.dashboard.notification

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.example.facebookcloneandroid.R
import com.example.facebookcloneandroid.ui.theme.GreyEEE

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun NotificationTab() {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, bottom = 20.dp, end = 20.dp),
        ) {
            Text(
                text = "Notifications", style = TextStyle(
                    fontSize = 24.sp,
                    fontWeight = FontWeight.W700,
                )
            )
            Box(
                modifier = Modifier
                    .clip(RoundedCornerShape(25))
                    .background(GreyEEE)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.baseline_search_24),
                    contentDescription = null,
                    colorFilter = ColorFilter.tint(color = Color.Black),
                    modifier = Modifier
                        .padding(8.dp)
                        .size(16.dp)
                )
            }

        }
        LazyColumn {
            item {
                Text(
                    text = "New", style = TextStyle(
                        fontSize = 16.sp,
                        fontWeight = FontWeight.W700,
                    ),
                    modifier = Modifier.padding(vertical = 8.dp, horizontal = 20.dp)
                )
            }
            items(10) {
                NotifyItem(it % 2 == 0)
            }
            item {
                Text(
                    text = "Earlier", style = TextStyle(
                        fontSize = 16.sp,
                        fontWeight = FontWeight.W700,
                    ),
                    modifier = Modifier.padding(vertical = 8.dp, horizontal = 20.dp)
                )
            }
            items(10) {
                NotifyItem(it % 2 == 0)
            }
        }
    }
}

@Composable
fun NotifyItem(
    isViewed: Boolean = false,
) {
    Row(
        modifier = Modifier
            .background(
                brush = Brush.horizontalGradient(
                    colors = arrayListOf(
                        colorResource(id = R.color.primary_1).copy(if (isViewed) .1f else .2f),
                        colorResource(id = R.color.primary_2).copy(if (isViewed) .1f else .2f)
                    )
                )
            )
            .padding(horizontal = 20.dp, vertical = 10.dp)
    ) {
        AsyncImage(
            model = "https://cdn.tuoitre.vn/thumb_w/730/2022/12/13/avatar-1-1670915577205689688817.jpeg",
            contentDescription = null,
            modifier = Modifier
                .width(50.dp)
                .height(50.dp)
                .clip(RoundedCornerShape(12.dp)),
            contentScale = ContentScale.Crop
        )
        Spacer(modifier = Modifier.width(15.dp))
        Column(modifier = Modifier.weight(1f), verticalArrangement = Arrangement.SpaceBetween, ) {
            Text(
                buildAnnotatedString {
                    withStyle(style = SpanStyle(fontWeight = FontWeight.Bold)) {
                        append("Darrell Trivet")
                    }
                    append(" has a new story  up. What’s your reaction?")

                },
                style = TextStyle(
                    fontSize = 12.sp,
                    fontWeight = FontWeight.W400,
                ),
            )
            Spacer(modifier = Modifier.weight(1f))
            Text(
                text = "2hours ago", style = TextStyle(
                    fontSize = 11.sp,
                    color = Color(0xFF555555)
                )
            )
        }
    }
}