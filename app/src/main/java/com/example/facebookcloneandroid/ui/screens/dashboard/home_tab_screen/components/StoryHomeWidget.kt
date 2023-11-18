package com.example.facebookcloneandroid.ui.screens.dashboard.home_tab_screen.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.example.facebookcloneandroid.R
import com.example.facebookcloneandroid.ui.theme.Blue2669FF

@Preview(showBackground = true)
@Composable
fun StoryHomeWidget() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 20.dp, top = 20.dp)
            .horizontalScroll(rememberScrollState())
    ) {
        AddStory()
        Spacer(modifier = Modifier.width(10.dp))
        StoryView()
        Spacer(modifier = Modifier.width(10.dp))
        StoryView()
        Spacer(modifier = Modifier.width(10.dp))
        StoryView()
    }
}
@Composable
fun AddStory() {
    Box {
        AsyncImage(
            model = "https://cdn.tuoitre.vn/thumb_w/730/2022/12/13/avatar-1-1670915577205689688817.jpeg",
            contentDescription = "Translated description of what the image contains",
            modifier = Modifier
                .width(90.dp)
                .height(130.dp)
                .clip(RoundedCornerShape(20.dp)),
            contentScale = ContentScale.Crop
        )
        Box(
            modifier = Modifier
                .width(24.dp)
                .height(24.dp)
                .offset(0.dp, (12).dp)
                .border(
                    width = 2.dp,
                    color = Color.White,
                    shape = RoundedCornerShape(5.dp)
                )
                .clip(RoundedCornerShape(6.dp))
                .background(Blue2669FF)
                .align(Alignment.BottomCenter)
        ) {
            Icon(
                painter = painterResource(id = R.drawable.baseline_add_24),
                contentDescription = null,
                tint = Color.White,
                modifier = Modifier
                    .size(18.dp)
                    .align(Alignment.Center)
            )
        }
    }
}
@Composable
fun StoryView() {
    Box {
        AsyncImage(
            model = "https://cdn.tuoitre.vn/thumb_w/730/2022/12/13/avatar-1-1670915577205689688817.jpeg",
            contentDescription = "Translated description of what the image contains",
            modifier = Modifier
                .width(90.dp)
                .height(130.dp)
                .clip(RoundedCornerShape(20.dp)),
            contentScale = ContentScale.Crop
        )
        Column(
            modifier = Modifier.offset(0.dp, 32.dp)
                .align(Alignment.BottomCenter)
        ) {
            Box(
                modifier = Modifier
                    .width(36.dp)
                    .height(36.dp)
                    .border(
                        width = 2.dp,
                        color = Blue2669FF,
                        shape = CircleShape
                    )
                    .clip(CircleShape)
                    .background(Color.White)

            ) {
                    AsyncImage(
                        model = "https://cdn.tuoitre.vn/thumb_w/730/2022/12/13/avatar-1-1670915577205689688817.jpeg",
                        contentDescription = "Translated description of what the image contains",
                        modifier = Modifier
                            .clip(CircleShape),
                        contentScale = ContentScale.Crop
                    )
            }
            Text(
                text = "Vish Patil",
                style = TextStyle(
                    color = Color.Black,
                    fontSize = 10.sp,
                    fontWeight = FontWeight.W400,
                )
            )
        }
    }

}
