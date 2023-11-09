package com.example.facebookcloneandroid.ui.screens.forgot_password

import android.util.Log
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.facebookcloneandroid.R
import com.example.facebookcloneandroid.navigation.Routes
import com.example.facebookcloneandroid.ui.components.DefaultButton
import com.example.facebookcloneandroid.ui.components.DefaultTextField

enum class AccountType {
    Email,
    Phone,
}

@Composable
fun ForgotPasswordScreen(
    onNavigate: (route: String) -> Unit
) {
    val focusManager = LocalFocusManager.current
    val accountType = remember { mutableStateOf(AccountType.Phone) }
    val requester = remember { FocusRequester() }

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 40.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.height(30.dp))
        Text(
            text = stringResource(id =
               when(accountType.value) {
                    AccountType.Phone -> R.string.enter_phone_number
                    AccountType.Email -> R.string.enter_email
               }
            ),
            style = TextStyle(
                color = Color.Black,
                fontSize = 18.sp,
                fontWeight = FontWeight.W600,
            )
        )
        Spacer(modifier = Modifier.height(30.dp))
        when(accountType.value) {
            AccountType.Phone -> DefaultTextField(
                hintText = stringResource(id = R.string.enter_code_hint),
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Number,
                    imeAction = ImeAction.Done,
                ),
                onNext = {},
                onDone = {
                    focusManager.clearFocus()
                },
                focusRequester = requester
            )
            AccountType.Email -> DefaultTextField(
                hintText = stringResource(id = R.string.enter_email_hint),
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Email,
                    imeAction = ImeAction.Done,
                ),
                onNext = {},
                onDone = {
                    focusManager.clearFocus()
                },
                focusRequester = requester
            )
        }
        Spacer(modifier = Modifier.height(50.dp))
        DefaultButton(
            title = stringResource(id = R.string.find_your_account),
            onTap = {
                onNavigate(Routes.OtpVerify.route)
            }
        )
        Spacer(modifier = Modifier.weight(1f))
        Text(
            modifier = Modifier
                .clickable (

                ) {
                    when (accountType.value) {
                        AccountType.Phone -> accountType.value = AccountType.Email
                        AccountType.Email -> accountType.value = AccountType.Phone
                    }
                    Log.d("Tag", "Forgot password")
                },
            text = stringResource(id = when(accountType.value) {
                AccountType.Phone -> R.string.search_by_email
                AccountType.Email -> R.string.search_by_phone
            }),
            style = TextStyle(
                fontSize = 15.sp,
                fontWeight = FontWeight.W500,
                color = colorResource(id = R.color.primary_1)
            )
        )
        Spacer(modifier = Modifier.height(20.dp))
    }
}