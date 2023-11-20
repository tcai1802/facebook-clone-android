package com.example.facebookcloneandroid.ui.screens.dashboard.watch_video_tab

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.combinedClickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Popup
import androidx.compose.ui.window.PopupProperties
import coil.compose.AsyncImage
import com.example.facebookcloneandroid.R
import com.example.facebookcloneandroid.ui.theme.Grey999
import com.example.facebookcloneandroid.ui.theme.GreyAAA
import com.example.facebookcloneandroid.ui.theme.GreyDDD
import com.example.facebookcloneandroid.ui.theme.GreyEEE

@OptIn(ExperimentalFoundationApi::class)
@Preview(showSystemUi = true, showBackground = true)
@Composable
fun VideoWidget() {
    var showEmojiDialog = remember {
        mutableStateOf(false)
    }
    Column(
        modifier = Modifier.fillMaxWidth()
    ) {
        Divider(color = GreyAAA)
        Spacer(modifier = Modifier.height(15.dp))
        Row(modifier = Modifier.padding(horizontal = 20.dp)) {
            AsyncImage(
                model = "https://cdn.tuoitre.vn/thumb_w/730/2022/12/13/avatar-1-1670915577205689688817.jpeg",
                contentDescription = null,
                modifier = Modifier
                    .width(50.dp)
                    .height(50.dp)
                    .clip(RoundedCornerShape(12.dp)),
                contentScale = ContentScale.Crop
            )
            Spacer(modifier = Modifier.width(10.dp))
            Column(
                verticalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = "Deven mestry",
                    style = TextStyle(
                        fontWeight = FontWeight.W700
                    ),
                )
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    Text(
                        text = "1 h .  Mumbai, Maharastra .",
                        style = TextStyle(
                            fontSize = 12.sp,
                            color = GreyAAA,
                        ),
                    )
                    Spacer(modifier = Modifier.width(2.dp))
                    Image(
                        painter = painterResource(id = R.drawable.ic_friend_selected),
                        contentDescription = null,
                        colorFilter = ColorFilter.tint(GreyAAA),
                        modifier = Modifier.size(9.dp)
                    )
                }
            }
        }
        Spacer(modifier = Modifier.height(17.dp))
        Text(
            text = "Old is Gold..!!",
            style = TextStyle(
                fontSize = 12.sp,
                fontWeight = FontWeight.W400,
            ),
            modifier = Modifier.padding(horizontal = 20.dp)
        )
        Spacer(modifier = Modifier.height(5.dp))
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(250.dp),
        ) {
            VideoPlayerScreen()
        }
        Spacer(modifier = Modifier.height(20.dp))
        Row(
            modifier = Modifier.padding(horizontal = 20.dp)
        ) {
            Box(
                modifier = Modifier.combinedClickable(
                    onClick = {},
                    onLongClick = {
                        showEmojiDialog.value = true;
                    }
                )
            ) {
                Image(
                    painter = painterResource(id = R.drawable.ic_like),
                    contentDescription = null,
                    colorFilter = ColorFilter.tint(Color.Black),
                    modifier = Modifier.width(21.dp)
                )
            }
            if (showEmojiDialog.value)
                EmotionWidget(onDismissRequest = {
                    showEmojiDialog.value = false
                })
            Spacer(modifier = Modifier.width(30.dp))
            Image(
                painter = painterResource(id = R.drawable.ic_comment),
                contentDescription = null,
                colorFilter = ColorFilter.tint(Color.Black),
                modifier = Modifier.width(21.dp)
            )
            Spacer(modifier = Modifier.width(30.dp))
            Image(
                painter = painterResource(id = R.drawable.ic_share),
                contentDescription = null,
                colorFilter = ColorFilter.tint(Color.Black),
                modifier = Modifier.width(21.dp)
            )
        }
        Spacer(modifier = Modifier.height(14.dp))
        Row(
            modifier = Modifier
                .padding(horizontal = 20.dp),
        ) {
            LazyRow(
                reverseLayout = true,
            ) {
                item {
                    Image(
                        painter = painterResource(id = R.drawable.ic_favourite),
                        contentDescription = null,
                        modifier = Modifier
                            .width(16.dp)
                            .height(16.dp)
                            .offset((-8).dp)
                    )
                    Image(
                        painter = painterResource(id = R.drawable.ic_liked),
                        contentDescription = null,
                        modifier = Modifier
                            .width(16.dp)
                            .height(16.dp)
                    )
                }
            }
            Text(
                text = "You, Anin Kale and 205 others ",
                style = TextStyle(
                    fontSize = 12.sp,
                    fontWeight = FontWeight.W400,
                ),
            )
            Spacer(modifier = Modifier.weight(1f))
            Text(
                text = "14 Comments",
                style = TextStyle(
                    fontSize = 12.sp,
                    fontWeight = FontWeight.W400,
                ),
            )

        }
        Spacer(modifier = Modifier.height(16.dp))
        CommentItem()
        CommentItem()
        CommentInput()
        Spacer(modifier = Modifier.height(16.dp))

    }
}

@Composable
fun EmotionWidget(
    onDismissRequest: () -> Unit,
) {
    Popup(
        alignment = Alignment.TopStart,
        properties = PopupProperties(
        ),
        onDismissRequest = onDismissRequest,
        offset = IntOffset(27, -100)

    ) {
        Row(
            modifier = Modifier
                .clip(RoundedCornerShape(20.dp))
                .background(Color.White)
                .padding(5.dp)

        ) {
            Image(
                painter = painterResource(id = R.drawable.ic_liked),
                contentDescription = null,
                modifier = Modifier
                    .width(27.dp)
                    .height(27.dp),
                contentScale = ContentScale.Fit
            )
            Spacer(modifier = Modifier.width(15.dp))
            Image(
                painter = painterResource(id = R.drawable.ic_favourite),
                contentDescription = null,
                modifier = Modifier
                    .width(27.dp)
                    .height(27.dp),
                contentScale = ContentScale.Fit
            )
            Spacer(modifier = Modifier.width(15.dp))
            Image(
                painter = painterResource(id = R.drawable.ic_care),
                contentDescription = null,
                modifier = Modifier
                    .width(27.dp)
                    .height(27.dp),
                contentScale = ContentScale.Fit
            )
            Spacer(modifier = Modifier.width(15.dp))
            Image(
                painter = painterResource(id = R.drawable.ic_haha),
                contentDescription = null,
                modifier = Modifier
                    .width(27.dp)
                    .height(27.dp),
                contentScale = ContentScale.Fit
            )
            Spacer(modifier = Modifier.width(15.dp))
            Image(
                painter = painterResource(id = R.drawable.ic_wow),
                contentDescription = null,
                modifier = Modifier
                    .width(27.dp)
                    .height(27.dp),
                contentScale = ContentScale.Fit
            )
            Spacer(modifier = Modifier.width(15.dp))
            Image(
                painter = painterResource(id = R.drawable.ic_sad),
                contentDescription = null,
                modifier = Modifier
                    .width(27.dp)
                    .height(27.dp),
                contentScale = ContentScale.Fit
            )
            Spacer(modifier = Modifier.width(15.dp))
            Image(
                painter = painterResource(id = R.drawable.ic_angry),
                contentDescription = null,
                modifier = Modifier
                    .width(27.dp)
                    .height(27.dp)
            )
            Spacer(modifier = Modifier.width(15.dp))
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CommentInput() {
    var text by remember { mutableStateOf(value = "") }
    val interactionSource = remember { MutableInteractionSource() }
    Row(
        modifier = Modifier
            .padding(horizontal = 20.dp),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        AsyncImage(
            model = "https://cdn.tuoitre.vn/thumb_w/730/2022/12/13/avatar-1-1670915577205689688817.jpeg",
            contentDescription = "Translated description of what the image contains",
            modifier = Modifier
                .width(31.dp)
                .height(31.dp)
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
            BasicTextField(
                value = text,
                onValueChange = {
                    text = it
                },
                modifier = Modifier.weight(1f),
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Password,
                    imeAction = ImeAction.Done,
                ),
                visualTransformation = VisualTransformation.None,
                interactionSource = interactionSource,
                decorationBox = { innerTextField ->
                    TextFieldDefaults.DecorationBox(
                        value = text,
                        innerTextField = innerTextField,
                        enabled = true,
                        singleLine = true,
                        placeholder = {
                            Text(
                                text = "Write a comment..",
                                style = TextStyle(
                                    fontSize = 12.sp,
                                    fontWeight = FontWeight.W400,
                                    color = Grey999
                                ),
                            )
                        },
                        colors = TextFieldDefaults.colors(
                            focusedIndicatorColor = Color.Transparent,
                            unfocusedIndicatorColor = Color.Transparent,
                            disabledIndicatorColor = Color.Transparent
                        ),
                        contentPadding = PaddingValues(0.dp),
                        interactionSource = interactionSource,
                        visualTransformation = VisualTransformation.None,
                    )
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
        Spacer(modifier = Modifier.height(20.dp))

    }
}

@Composable
fun CommentItem() {
    Row(modifier = Modifier.padding(bottom = 13.dp, start = 20.dp, end = 20.dp)) {
        AsyncImage(
            model = "https://cdn.tuoitre.vn/thumb_w/730/2022/12/13/avatar-1-1670915577205689688817.jpeg",
            contentDescription = null,
            modifier = Modifier
                .width(43.dp)
                .height(43.dp)
                .clip(RoundedCornerShape(12.dp)),
            contentScale = ContentScale.Crop
        )
        Spacer(modifier = Modifier.width(10.dp))
        Column {
            Column(
                modifier = Modifier
                    .clip(RoundedCornerShape(10.dp))
                    .background(GreyDDD)
                    .padding(
                        vertical = 5.dp,
                        horizontal = 7.dp
                    )
            ) {
                Text(
                    text = "Amir Shenoy",
                    style = TextStyle(
                        fontSize = 12.sp,
                        fontWeight = FontWeight.W500,
                    ),
                )
                Text(
                    text = "Beautiful place.",
                    style = TextStyle(
                        fontSize = 12.sp,
                        fontWeight = FontWeight.W400,
                    ),
                )
            }
            Spacer(modifier = Modifier.height(7.dp))
            Row {
                Text(
                    text = "1 h",
                    style = TextStyle(
                        fontSize = 12.sp,
                        fontWeight = FontWeight.W500,
                        color = Color(0xFF555555)
                    ),
                )
                Spacer(modifier = Modifier.width(10.dp))
                Text(
                    text = "Like",
                    style = TextStyle(
                        fontSize = 12.sp,
                        fontWeight = FontWeight.W500,
                        color = Color(0xFF555555)
                    ),
                )
                Spacer(modifier = Modifier.width(10.dp))
                Text(
                    text = "Reply",
                    style = TextStyle(
                        fontSize = 12.sp,
                        fontWeight = FontWeight.W500,
                        color = Color(0xFF555555)
                    ),
                )
            }
        }
    }
}
