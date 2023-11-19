package com.example.facebookcloneandroid.ui.screens.dashboard.personal_tab

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.example.facebookcloneandroid.R
import com.example.facebookcloneandroid.ui.components.ButtonType
import com.example.facebookcloneandroid.ui.components.DefaultButton
import com.example.facebookcloneandroid.ui.screens.dashboard.home_tab_screen.components.PostWidget
import com.example.facebookcloneandroid.ui.theme.Grey999
import com.example.facebookcloneandroid.ui.theme.GreyAAA
import com.example.facebookcloneandroid.ui.theme.GreyDDD
import com.example.facebookcloneandroid.ui.theme.GreyEEE

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun PersonTab() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(310.dp)
        ) {
            AsyncImage(
                model = "https://cdn.tuoitre.vn/thumb_w/730/2022/12/13/avatar-1-1670915577205689688817.jpeg",
                contentDescription = "",
                modifier = Modifier
                    .fillMaxWidth()
                    .height(250.dp),
                contentScale = ContentScale.Crop
            )
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .align(Alignment.BottomCenter)
            ) {
                Box(
                    modifier = Modifier
                        .clip(RoundedCornerShape(25))
                        .width(120.dp)
                        .height(120.dp)
                        .border(4.dp, Color.White, shape = RoundedCornerShape(25))
                ) {
                    AsyncImage(
                        model = "https://cdn.tuoitre.vn/thumb_w/730/2022/12/13/avatar-1-1670915577205689688817.jpeg",
                        contentDescription = "",
                        modifier = Modifier
                            .clip(RoundedCornerShape(25)),
                        contentScale = ContentScale.Crop
                    )
                    Image(
                        painter = painterResource(id = R.drawable.baseline_camera_alt_24),
                        contentDescription = "",
                        modifier = Modifier
                            .padding(10.dp)
                            .clip(RoundedCornerShape(25))
                            .background(GreyDDD)
                            .padding(6.dp)
                            .width(16.dp)
                            .align(Alignment.BottomEnd),
                        contentScale = ContentScale.Fit
                    )
                }
                Spacer(modifier = Modifier.height(10.dp))
                Text(
                    text = "Sanjay Shendy",
                    style = TextStyle(fontSize = 24.sp, fontWeight = FontWeight.Bold)
                )

            }
        }
        Spacer(modifier = Modifier.height(10.dp))
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center) {
            DefaultButton(
                title = "Add to story",
                buttonType = ButtonType.Filled,
                modifier = Modifier
                    .wrapContentWidth()
                    .clip(RoundedCornerShape(7.dp))
                    .padding(0.dp)
                    .background(
                        Brush.horizontalGradient(
                            colors = arrayListOf(
                                colorResource(id = R.color.primary_1),
                                colorResource(id = R.color.primary_2)
                            ),
                        )
                    )
                    .padding(vertical = 10.dp, horizontal = 27.dp),
                onTap = {}
            )
            Spacer(modifier = Modifier.width(15.dp))
            DefaultButton(
                title = "Edit profile",
                buttonType = ButtonType.Filled,
                modifier = Modifier
                    .wrapContentWidth()
                    .clip(RoundedCornerShape(7.dp))
                    .padding(0.dp)
                    .background(GreyEEE)
                    .padding(vertical = 10.dp, horizontal = 27.dp),
                textStyle = TextStyle(
                    fontSize = 14.sp,
                    fontWeight = FontWeight.W700,
                    color = Grey999,
                ),
                onTap = {}
            )
        }
        Spacer(modifier = Modifier.height(15.dp))
        Divider(thickness = 0.5.dp, color = GreyAAA)
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(21.dp)
                .horizontalScroll(rememberScrollState()),
            horizontalArrangement = Arrangement.SpaceBetween,
        ) {
            InfoUser(
                "Posts", 1972
            )
            InfoUser(
                "Friends", 4843
            )
            InfoUser(
                "Followers", 1990
            )
            InfoUser(
                "Following", 1456
            )
        }
        Divider(thickness = 0.5.dp, color = GreyAAA)
        ExperienceUser(R.drawable.baseline_work_24, "Founder and CEO at A to Z company Ltd.")
        ExperienceUser(
            R.drawable.baseline_school_24,
            "Studied Computer Science at Harvard University"
        )
        ExperienceUser(R.drawable.baseline_home_24, "Lives in Mumbai, Maharastra")
        ExperienceUser(R.drawable.baseline_location_on_24, "From Mumbai, India.")
        ExperienceUser(R.drawable.baseline_more_horiz_24, "See your about info.")
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {
            DefaultButton(
                title = "Edit public details",
                buttonType = ButtonType.Filled,
                modifier = Modifier
                    .wrapContentWidth()
                    .clip(RoundedCornerShape(7.dp))
                    .padding(0.dp)
                    .background(GreyEEE)
                    .padding(vertical = 10.dp, horizontal = 27.dp),
                textStyle = TextStyle(
                    fontSize = 14.sp,
                    fontWeight = FontWeight.W700,
                    color = Color.Black,
                ),
                onTap = {}
            )
        }
        Spacer(modifier = Modifier.height(15.dp))
        PostWidget()
        PostWidget()
    }
}

@Composable
fun InfoUser(title: String, value: Int) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Text(
            text = "$title",
            style = TextStyle(
                fontSize = 18.sp,
                fontWeight = FontWeight.W600,
                brush = Brush.linearGradient(
                    colors = arrayListOf(
                        colorResource(id = R.color.primary_1),
                        colorResource(id = R.color.primary_2)
                    ),
                    start = Offset.Zero,
                    end = Offset(100.0f, 100.0f)
                )
            ),
        )
        Text(
            text = "$value",
            style = TextStyle(
                fontSize = 16.sp,
                fontWeight = FontWeight.W500,
                brush = Brush.linearGradient(
                    colors = arrayListOf(
                        colorResource(id = R.color.primary_1),
                        colorResource(id = R.color.primary_2)
                    ),
                    start = Offset.Zero,
                    end = Offset(100.0f, 100.0f)
                )
            ),
        )
    }
}

@Composable
fun ExperienceUser(@DrawableRes iconUrl: Int, content: String) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 20.dp, vertical = 10.dp)
    ) {
        Image(
            painter = painterResource(id = iconUrl),
            colorFilter = ColorFilter.tint(GreyAAA),
            contentDescription = "",
            modifier = Modifier
                .width(25.dp),
            contentScale = ContentScale.Fit
        )
        Spacer(modifier = Modifier.width(10.dp))
        Text(
            text = content,
            style = TextStyle(
                fontSize = 14.sp,
                fontWeight = FontWeight.W400,
                color = Color.Black
            ),
        )
    }
}