package com.example.facebookcloneandroid.ui.screens.what_your_gender;

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.facebookcloneandroid.R
import com.example.facebookcloneandroid.navigation.Routes
import com.example.facebookcloneandroid.ui.components.DefaultButton
import com.example.facebookcloneandroid.ui.components.DefaultCheckBox
import com.example.facebookcloneandroid.ui.theme.Grey999

@Preview(showSystemUi = true)
@Composable
fun WhatYourGenderScreenPreview() {
    WhatYourGenderScreen {}
}


@Composable
fun WhatYourGenderScreen(
    onNavigate: (route: String) -> Unit
) {
    val genderList = mutableListOf<Map<String, String>>(
        hashMapOf("title" to "Female"),
        hashMapOf("title" to "Male"),
        hashMapOf(
            "title" to "Custom",
            "description" to "Select customer to choose another gender,\n" +
                " or if you’d rather not say"
        )
    )
    var currentIndex = remember { mutableIntStateOf(value = 0) }
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 40.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.height(30.dp))
        Text(
            text = "What's your gender?",
            style = TextStyle(
                color = Color.Black,
                fontSize = 18.sp,
                fontWeight = FontWeight.W600,
            )
        )
        Spacer(modifier = Modifier.height(10.dp))
        Text(
            text = "You can change who sees your gender on your profile later.",
            style = TextStyle(
                color = Grey999,
                fontSize = 12.sp,
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.W400,
            )
        )
        Spacer(modifier = Modifier.weight(1f))
        genderList.mapIndexed { index, data ->
            Box(modifier = Modifier.padding(bottom = 20.dp)
            ) {
                DefaultCheckBox(
                    title = data["title"] ?: "",
                    isSelected = index == currentIndex.value,
                    description = data["description"],
                    onSelectOrNot = {
                        currentIndex.value = index
                    },
                )
            }
        }
        Spacer(modifier = Modifier.weight(1f))
        DefaultButton(
            title = stringResource(id = R.string.next),
            onTap = {
                onNavigate(Routes.ContactNumber.route)
            }
        )
        Spacer(modifier = Modifier.weight(2f))
    }
}

