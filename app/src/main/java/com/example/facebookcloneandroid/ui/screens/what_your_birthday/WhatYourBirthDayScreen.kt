package com.example.facebookcloneandroid.ui.screens.what_your_birthday

import android.view.LayoutInflater
import android.widget.DatePicker
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.viewinterop.AndroidView
import com.example.facebookcloneandroid.R
import com.example.facebookcloneandroid.navigation.Routes
import com.example.facebookcloneandroid.ui.components.DefaultButton
import com.example.facebookcloneandroid.ui.theme.Grey999
import java.util.Calendar

@Preview(showSystemUi = true)
@Composable
fun WhatYourBirthDayScreenPreview() {
    WhatYourBirthDayScreen {}
}

@Composable
fun WhatYourBirthDayScreen(
    onNavigate: (route: String) -> Unit
) {
    val focusManager = LocalFocusManager.current
    val firstNameRequester = remember { FocusRequester() }
    val lastNameRequester = remember { FocusRequester() }
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 40.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.height(30.dp))
        Text(
            text = "What’s your birthday?",
            style = TextStyle(
                color = Color.Black,
                fontSize = 18.sp,
                fontWeight = FontWeight.W600,
            )
        )
        Spacer(modifier = Modifier.height(10.dp))
        Text(
            text = "Choose your date of birth. \n" +
                    "You can always make this private later.",
            style = TextStyle(
                color = Grey999,
                fontSize = 12.sp,
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.W400,
            )
        )
        Spacer(modifier = Modifier.weight(1f))
        AndroidView(
            factory = {context ->
                val view = LayoutInflater.from(context).inflate(R.layout.date_picker, null);
                val datePicker = view.findViewById<DatePicker>(R.id.datePicker)
                val calendar = Calendar.getInstance() // show today by default
                datePicker.init(
                    calendar.get(Calendar.YEAR),
                    calendar.get(Calendar.MONTH),
                    calendar.get(Calendar.DAY_OF_MONTH)
                ) { _, year, monthOfYear, dayOfMonth ->
                    val date = Calendar.getInstance().apply {
                        set(year, monthOfYear, dayOfMonth)
                    }.time
//                    onSelectedDateUpdate(date)
                }
                datePicker

            }
        )
        Spacer(modifier = Modifier.weight(1f))
        DefaultButton(
            title = stringResource(id = R.string.next),
            onTap = {
                onNavigate(Routes.WhatYourGender.route)
            }
        )
        Spacer(modifier = Modifier.weight(2f))
    }
}