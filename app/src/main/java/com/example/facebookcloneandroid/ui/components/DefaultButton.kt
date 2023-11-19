package com.example.facebookcloneandroid.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.facebookcloneandroid.R

enum class ButtonType {
    Filled,
    Outline,
}

@Composable
fun DefaultButton(
    modifier: Modifier? = null,
    title: String = "",
    buttonType: ButtonType = ButtonType.Filled,
    textStyle: TextStyle? =  null,
    onTap: () -> Unit = {},
) {
    when(buttonType) {
        ButtonType.Filled -> FilledButton(modifier,title,onTap,textStyle)
        ButtonType.Outline -> OutlineButton(modifier,title,onTap)
    }
}

@Composable
fun FilledButton(
    modifier: Modifier? = null,
    title: String = "",
    onTap: () -> Unit = {},
    textStyle: TextStyle? =  null,
) {
    Button(
        modifier = Modifier.wrapContentWidth(),
        onClick = { onTap() },
        colors = ButtonDefaults.buttonColors(
            containerColor = Color.Transparent
        ),
        contentPadding = PaddingValues(0.dp),
        shape = RoundedCornerShape(15.dp)
    ) {
        Box(
            modifier = modifier ?: Modifier
                .fillMaxWidth()
                .background(
                    Brush.horizontalGradient(
                        colors = arrayListOf(
                            colorResource(id = R.color.primary_1),
                            colorResource(id = R.color.primary_2)
                        ),
                    )
                )
                .padding(vertical = 12.dp)
                .clip(RoundedCornerShape(15.dp)
                ),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = title,
                style = textStyle ?: TextStyle(
                    fontSize = 14.sp,
                    fontWeight = FontWeight.W700,
                    color = Color.White,
                )
            )
        }
    }
}


@Composable
fun OutlineButton(
    modifier: Modifier? = null,
    title: String = "",
    onTap: () -> Unit = {},
) {
    Button(
        modifier = Modifier.fillMaxWidth(),
        onClick = { onTap() },
        colors = ButtonDefaults.buttonColors(
            containerColor = Color.Transparent
        ),
        contentPadding = PaddingValues(0.dp),
        shape = RoundedCornerShape(15.dp)
    ) {
        Box(
            modifier = modifier ?: Modifier
                .fillMaxWidth()
                .background(Color.Transparent)
                .border(width = 2.dp, brush = Brush.horizontalGradient(
                    colors = arrayListOf(
                        colorResource(id = R.color.primary_1),
                        colorResource(id = R.color.primary_2)
                    )),
                    shape = RoundedCornerShape(15.dp)
                )
                .padding(vertical = 12.dp)
                .clip(RoundedCornerShape(15.dp)),
            contentAlignment = Alignment.Center
        ) {
            Text(
                modifier = Modifier
                    .background(Color.Transparent)
                    .clip(RoundedCornerShape(15.dp)),
                text = title,
                style = TextStyle(
                    fontSize = 14.sp,
                    fontWeight = FontWeight.W700,
                    color = Color.Black,
                )
            )
        }
    }
}