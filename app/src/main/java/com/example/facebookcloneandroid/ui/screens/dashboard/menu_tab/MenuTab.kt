package com.example.facebookcloneandroid.ui.screens.dashboard.menu_tab

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
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
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
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
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.facebookcloneandroid.R
import com.example.facebookcloneandroid.ui.theme.GreyEEE

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun MenuTab() {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, bottom = 11.dp, end = 20.dp),
        ) {
            Text(
                text = "Menu",
                style = TextStyle(
                    fontSize = 24.sp,
                    fontWeight = FontWeight.W700,
                ),
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
        Text(
            text = "Shorctus",
            style = TextStyle(
                fontSize = 14.sp,
                fontWeight = FontWeight.W600,
                color = Color(0xFF555555)
            ),
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp),
        )
        Spacer(modifier = Modifier.height(10.dp))
        LazyColumn() {
            item {
                ShortcutsItem("Jobs")
                ShortcutsItem("COVID-19 information Center")
                ShortcutsItem("Marketplace")
                ShortcutsItem("Friends")
                ShortcutsItem("Events")
                ShortcutsItem("Gaming")
                Spacer(modifier = Modifier.height(15.dp))
            }
            item {
                MenuOptionItem("Community resources")
                MenuOptionItem("Help & Support")
                MenuOptionItem("Settings & Privacy")
            }
        }
    }
}

@Composable
fun ShortcutsItem(
    title: String
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 20.dp, end = 20.dp, bottom = 3.dp)
            .border(
                width = 1.dp, brush = Brush.horizontalGradient(
                    colors = arrayListOf(
                        colorResource(id = R.color.primary_1),
                        colorResource(id = R.color.primary_2)
                    )
                ),
                shape = RoundedCornerShape(5.dp)
            )
            .padding(vertical = 8.dp),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Text(
            text = title,
            style = TextStyle(
                fontSize = 12.sp, fontWeight = FontWeight.W600,
                brush = Brush.linearGradient(
                    colors = arrayListOf(
                        colorResource(id = R.color.primary_1),
                        colorResource(id = R.color.primary_2)
                    ),
                    start = Offset.Zero,
                    end = Offset(100.0f, 100.0f)
                )
            )

        )

    }
}

@Composable
fun MenuOptionItem(title: String) {
    Column(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Divider(
            color = Color(0xFF555555)
        )
        Text(
            text = title,
            style = TextStyle(
                fontSize = 12.sp, fontWeight = FontWeight.W600,
                color = Color.Black
            ),
            textAlign = TextAlign.Center,
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 10.dp)


        )
    }
}