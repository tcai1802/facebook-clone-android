package com.example.facebookcloneandroid.ui.screens.dashboard.request_friend_tab

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
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
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
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
import com.example.facebookcloneandroid.ui.theme.Blue384CFF
import com.example.facebookcloneandroid.ui.theme.Grey999
import com.example.facebookcloneandroid.ui.theme.GreyAAA
import com.example.facebookcloneandroid.ui.theme.GreyEEE

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun RequestFriendTabScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
    ) {
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 20.dp)
        ) {
            Text(
                text = "Friends", style = TextStyle(
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold,
                )
            )
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .clip(RoundedCornerShape(10.dp))
                    .background(GreyEEE)
                    .width(30.dp)
                    .height(30.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.baseline_search_24),
                    contentDescription = "",
                    modifier = Modifier
                        .clickable {
                        }
                )
            }
        }
        Spacer(modifier = Modifier.height(21.dp))
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 20.dp)
        ) {
            DefaultButton(
                title = "Suggestions",
                buttonType = ButtonType.Filled,
                modifier = Modifier
                    .wrapContentWidth()
                    .background(
                        Brush.horizontalGradient(
                            colors = arrayListOf(
                                colorResource(id = R.color.primary_1),
                                colorResource(id = R.color.primary_2)
                            ),
                        )
                    )
                    .padding(vertical = 8.dp, horizontal = 12.dp)
                    .clip(
                        RoundedCornerShape(7.dp)
                    ),
                onTap = {
                }
            )
            Spacer(modifier = Modifier.width(15.dp))
            DefaultButton(
                title = "Your Friends",
                buttonType = ButtonType.Filled,
                modifier = Modifier
                    .wrapContentWidth()
                    .background(
                        Brush.horizontalGradient(
                            colors = arrayListOf(
                                colorResource(id = R.color.primary_1),
                                colorResource(id = R.color.primary_2)
                            ),
                        )
                    )
                    .padding(vertical = 8.dp, horizontal = 12.dp)
                    .clip(RoundedCornerShape(7.dp)),
                onTap = {}
            )
        }
        Spacer(modifier = Modifier.height(21.dp))
        Divider(thickness = 0.5.dp, color = GreyAAA)
        Spacer(modifier = Modifier.height(15.dp))
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 20.dp)
        ) {
            Text(
                text = "Friend request  ", style = TextStyle(
                    fontSize = 18.sp,
                    fontWeight = FontWeight.W500,
                )
            )
            Text(
                text = "400", style = TextStyle(
                    fontSize = 18.sp,
                    fontWeight = FontWeight.W500,
                    color = Color.Red
                )
            )
            Spacer(modifier = Modifier.weight(1f))
            Text(
                text = "See all", style = TextStyle(
                    fontSize = 18.sp,
                    fontWeight = FontWeight.W500,
                    color = Blue384CFF
                )
            )
        }
        Spacer(modifier = Modifier.height(15.dp))
        FriendRequestItem()
        FriendRequestItem()
        FriendRequestItem()
        FriendRequestItem()
        FriendRequestItem()
        FriendRequestItem()
        FriendRequestItem()
        FriendRequestItem()
    }
}

@Composable
fun FriendRequestItem() {
    Row(modifier = Modifier
        .fillMaxWidth()
        .padding(horizontal = 20.dp)) {
        AsyncImage(
            model = "https://cdn.tuoitre.vn/thumb_w/730/2022/12/13/avatar-1-1670915577205689688817.jpeg",
            contentDescription = "Translated description of what the image contains",
            modifier = Modifier
                .width(80.dp)
                .height(80.dp)
                .clip(RoundedCornerShape(12.dp)),
            contentScale = ContentScale.Crop
        )
        Spacer(modifier = Modifier.width(15.dp))
        Column(modifier = Modifier.weight(1f)) {
            Row {
                Text(
                    text = "Kiran Pawar", style = TextStyle(
                        fontSize = 16.sp,
                        fontWeight = FontWeight.W500,
                    )
                )
                Spacer(modifier = Modifier.weight(1f))
                Text(
                    text = "9w", style = TextStyle(
                        fontSize = 14.sp,
                        fontWeight = FontWeight.W400,
                    )
                )
            }
            Text(
                text = "1 mutual friend", style = TextStyle(
                    fontSize = 14.sp,
                    fontWeight = FontWeight.W400,
                    color = Grey999,
                )
            )
            Row {
                DefaultButton(
                    title = "Confirm",
                    buttonType = ButtonType.Filled,
                    modifier = Modifier
                        .wrapContentWidth()
                        .background(
                            Brush.horizontalGradient(
                                colors = arrayListOf(
                                    colorResource(id = R.color.primary_1),
                                    colorResource(id = R.color.primary_2)
                                ),
                            )
                        )
                        .padding(vertical = 8.dp, horizontal = 27.dp)
                        .clip(RoundedCornerShape(7.dp)),
                    onTap = {}
                )
                Spacer(modifier = Modifier.width(15.dp))
                DefaultButton(
                    title = "Delete",
                    buttonType = ButtonType.Filled,
                    modifier = Modifier
                        .wrapContentWidth()
                        .background(GreyEEE)
                        .padding(vertical = 8.dp, horizontal = 27.dp)
                        .clip(RoundedCornerShape(7.dp)),
                    textStyle = TextStyle(
                        fontSize = 14.sp,
                        fontWeight = FontWeight.W700,
                        color = Grey999,
                    ),
                    onTap = {}
                )
            }

        }
    }
}