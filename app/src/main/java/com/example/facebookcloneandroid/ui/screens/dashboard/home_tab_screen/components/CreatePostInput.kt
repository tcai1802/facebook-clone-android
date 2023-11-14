package com.example.facebookcloneandroid.ui.screens.dashboard.home_tab_screen.components

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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.example.facebookcloneandroid.R
import com.example.facebookcloneandroid.ui.components.DefaultTextField
import com.example.facebookcloneandroid.ui.theme.Blue486BE5
import com.example.facebookcloneandroid.ui.theme.Green44C041
import com.example.facebookcloneandroid.ui.theme.Grey999
import com.example.facebookcloneandroid.ui.theme.GreyEEE
import com.example.facebookcloneandroid.ui.theme.PinkFC6565
import com.example.facebookcloneandroid.ui.theme.YellowF9C50F

@Composable
fun CreatePostInput() {
    Column(
        modifier = Modifier.fillMaxWidth()
    ) {
        Row(
            modifier = Modifier
                .padding(horizontal = 20.dp),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            AsyncImage(
                model = "https://cdn.tuoitre.vn/thumb_w/730/2022/12/13/avatar-1-1670915577205689688817.jpeg",
                contentDescription = "Translated description of what the image contains",
                modifier = Modifier
                    .width(50.dp)
                    .height(50.dp)
                    .clip(RoundedCornerShape(12.dp)),
                contentScale = ContentScale.Crop
            )
            Spacer(modifier = Modifier.width(10.dp))
            Row(
                modifier = Modifier
                    .weight(1f)
                    .clip(RoundedCornerShape(10.dp))
                    .background(GreyEEE)
                    .padding(start = 6.dp, end = 11.dp, top = 2.dp, bottom = 2.dp),
                verticalAlignment = Alignment.CenterVertically,
            ) {
                DefaultTextField(
                    modifier = Modifier.weight(1f),
                    hintText = "What’s on your mind, Sanjay?",
                    keyboardOptions = KeyboardOptions(
                        keyboardType = KeyboardType.Password,
                        imeAction = ImeAction.Done,
                    ),
                    onDone = {
                    },
                    hintStyle = TextStyle(
                        fontSize = 12.sp,
                        fontWeight = FontWeight.W400,
                        color = Grey999
                    ),
                    enableIndicator = false,
                    focusRequester = FocusRequester(),
                )
                Spacer(modifier = Modifier.width(18.dp))
                Image(
                    painter = painterResource(id = R.drawable.ic_gallery),
                    contentDescription = "Translated description of what the image contains",
                    modifier = Modifier
                        .clickable {

                        }
                )
            }
            Spacer(modifier = Modifier.width(10.dp))
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
                    contentDescription = "Translated description of what the image contains",
                    modifier = Modifier
                        .clickable {
                        }
                )
            }
        }
        Spacer(modifier = Modifier.height(17.dp))
        Row(
            horizontalArrangement = Arrangement.SpaceEvenly,
            modifier = Modifier.fillMaxWidth()
        ) {
            CreateOptionItem(
                backgroundColor = YellowF9C50F,
                content =  "Reels",
                iconUrl = R.drawable.ic_reels,
            )
            CreateOptionItem(
                backgroundColor = Green44C041,
                content =  "Room",
                iconUrl = R.drawable.ic_room,
            )
            CreateOptionItem(
                backgroundColor = PinkFC6565,
                content =  "Group",
                iconUrl = R.drawable.ic_group,
            )
            CreateOptionItem(
                backgroundColor = Blue486BE5,
                content =  "Live",
                iconUrl = R.drawable.ic_live,
            )
        }
    }
}
@Composable
fun CreateOptionItem(
    backgroundColor: Color,
    content: String,
    @DrawableRes iconUrl: Int,
    modifier: Modifier = Modifier,
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier
            .clip(RoundedCornerShape(10.dp))
            .background(backgroundColor.copy(0.1f))
            .padding(horizontal = 8.dp, vertical = 5.dp)
    ) {
        Image(
            painter = painterResource(id = iconUrl),
            contentDescription = null,
            modifier = Modifier
                .width(23.dp)
                .height(21.dp)
        )
        Spacer(modifier = Modifier.width(9.dp))
        Text(
            text = content,
            style = TextStyle(
                fontSize = 12.sp,
                fontWeight = FontWeight.W500,
                color = backgroundColor
            ),
        )
    }
}