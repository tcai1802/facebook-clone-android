package com.example.facebookcloneandroid.ui.screens.dashboard.watch_video_tab

import android.view.ViewGroup
import android.widget.FrameLayout
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.viewinterop.AndroidView
import androidx.media3.common.MediaItem
import androidx.media3.exoplayer.ExoPlayer
import androidx.media3.ui.PlayerView
import com.example.facebookcloneandroid.R

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun WatchVideoTab() {
    val tabList = mutableListOf<String>("For you", "Live", "Music", "Gaming", "Following")
    var currentSeletedIndex = remember {
        mutableStateOf(0)
    }
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
    ) {
        item {
            Text(
                text = "Watch", style = TextStyle(
                    fontSize = 24.sp,
                    fontWeight = FontWeight.W700,
                ),
                modifier = Modifier.padding(horizontal = 20.dp)

            )
            Spacer(modifier = Modifier.height(15.dp))
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 20.dp)
                    .clip(RoundedCornerShape(10.dp))
                    .background(
                        Brush.horizontalGradient(
                            colors = arrayListOf(
                                colorResource(id = R.color.primary_1),
                                colorResource(id = R.color.primary_2)
                            ),
                        )
                    )
                    .padding(
                        horizontal = 20.dp,
                        vertical = 8.dp,
                    )
            ) {
                LazyRow {
                    items(tabList.size) { index ->
                        WatchTabItem(tabList[index], currentSeletedIndex.value == index) {
                            currentSeletedIndex.value = index
                        }
                    }
                }
            }
            Spacer(modifier = Modifier.height(34.dp))
        }
        items(20) {
            VideoWidget()
        }
    }
}

@Composable
fun WatchTabItem(
    title: String,
    isSelect: Boolean,
    onClick: () -> Unit,
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .padding(end = 38.dp)
            .clickable {
                onClick()
            }
    ) {
        Text(
            text = title,
            style = TextStyle(
                fontSize = 12.sp,
                fontWeight = FontWeight.W600,
                color = Color.White
            ),
        )
        Spacer(modifier = Modifier.height(5.dp))
        if (isSelect) Divider(
            thickness = 1.dp,
            color = Color.White,
            modifier = Modifier.width(20.dp)
        )
    }
}

@Composable
fun VideoPlayerScreen() {
    val context = LocalContext.current
    var playWhenReady = remember { mutableStateOf(true) }
    val exoPlayer = remember {
        ExoPlayer.Builder(context).build().apply {
            setMediaItem(MediaItem.fromUri("http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/BigBuckBunny.mp4"))
            repeatMode = ExoPlayer.REPEAT_MODE_ALL
            playWhenReady = playWhenReady
            prepare()
            play()
        }
    }
    DisposableEffect(
        AndroidView(
            modifier = Modifier.fillMaxSize(),
            factory = {
                PlayerView(context).apply {
                    player = exoPlayer
                    useController = true
                    FrameLayout.LayoutParams(
                        ViewGroup.LayoutParams.MATCH_PARENT,
                        ViewGroup.LayoutParams.MATCH_PARENT
                    )
                }
            }
        )
    ) {
        onDispose {
            exoPlayer.release()
        }
    }
}