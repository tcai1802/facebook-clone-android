package com.example.facebookcloneandroid.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
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
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.facebookcloneandroid.ui.theme.Grey999
import com.example.facebookcloneandroid.ui.theme.GreyAAA

@Preview(showBackground = true)
@Composable
fun DefaultCheckBoxPreview(

) {
    DefaultCheckBox {

    }
}
@Composable
fun DefaultCheckBox(
    title: String = "",
    description: String? = null,
    isSelected: Boolean = false,
    onSelectOrNot: (value: Boolean) -> Unit,
) {
    Column(
        verticalArrangement = Arrangement.Top,
        modifier = Modifier.fillMaxWidth()
            .clickable {
                onSelectOrNot(!isSelected)
            }
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,

        ) {
            Text(
                text = title,
                style = TextStyle(
                    fontSize = 14.sp,
                    fontWeight = FontWeight.W600,
                    color = Color.Black
                ),
                modifier = Modifier.weight(1f)
            )
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .width(16.dp)
                    .height(16.dp)
                    .clip(CircleShape)
                    .background(Color.Transparent)
                    .border(width = 1.dp, Color.Blue, shape = CircleShape)
            ) {
                if(isSelected) Box(
                    modifier = Modifier
                        .width(10.dp)
                        .height(10.dp)
                        .clip(CircleShape)
                        .background(Color.Blue)
                ) {

                }
            }
        }
        Spacer(modifier = Modifier.height(5.dp))
        if(description != null) Text(
            text = description,
            style = TextStyle(
                fontSize = 10.sp,
                fontWeight = FontWeight.W400,
                color = Grey999
            ),
            modifier = Modifier.fillMaxWidth().padding(bottom = 5.dp)
        )

        Divider(thickness = 1.dp, color = GreyAAA)
    }
}