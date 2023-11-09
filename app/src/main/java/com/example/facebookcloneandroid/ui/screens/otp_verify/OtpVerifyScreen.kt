package com.example.facebookcloneandroid.ui.screens.otp_verify

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusDirection
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.facebookcloneandroid.R
import com.example.facebookcloneandroid.navigation.Routes
import com.example.facebookcloneandroid.ui.components.DefaultButton
import com.example.facebookcloneandroid.ui.components.DefaultTextField
import com.example.facebookcloneandroid.ui.theme.Grey999

@Preview(showSystemUi = true)
@Composable

fun OtpVerifyScreenPreview() {
    OtpVerifyScreen {}
}


@Composable
fun OtpVerifyScreen(
    onNavigate: (route: String) -> Unit
) {
    val focusManager = LocalFocusManager.current
    val requester = remember { FocusRequester() }

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 40.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.height(30.dp))
        Text(
            text = stringResource(id = R.string.enter_the_code_sent_to),
            style = TextStyle(
                color = Color.Black.copy(.8f),
                fontSize = 14.sp,
                fontWeight = FontWeight.W200,
            )
        )
        Text(
            text = "Sanjayshendy123@gmail.com",
            style = TextStyle(
                color = Color.Black,
                fontSize = 14.sp,
                fontWeight = FontWeight.W400,
            )
        )
        Spacer(modifier = Modifier.height(15.dp))
        Text(
            text = stringResource(id = R.string.code_description),
            style = TextStyle(
                color = Grey999,
                fontSize = 12.sp,
                fontWeight = FontWeight.W400,
            )
        )
        Spacer(modifier = Modifier.height(30.dp))
        DefaultTextField(
            hintText = stringResource(id = R.string.enter_code_hint),
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Number,
                imeAction = ImeAction.Done,
            ),
            onNext = {
                focusManager.moveFocus(FocusDirection.Next)
            },
            hintStyle = TextStyle(
                fontSize = 14.sp,
                fontWeight = FontWeight.W400,
                textAlign = TextAlign.Center,
                color = Grey999
            ),
            textStyle = TextStyle(
                fontSize = 14.sp,
                fontWeight = FontWeight.W400,
                textAlign = TextAlign.Center,
                color = Color.Black,
                letterSpacing = 20.sp,
            ),
            onValidate = {
                it.length < 7
            },
            focusRequester = requester
        )
        Spacer(modifier = Modifier.height(20.dp))
        DefaultButton(
            title = stringResource(id = R.string.continue_btn),
            onTap = {
                onNavigate(Routes.CreateNewPassword.route)
            }
        )
        Spacer(modifier = Modifier.height(20.dp))
        SendCodeOption(Modifier.fillMaxWidth(), R.drawable.ic_mail,R.string.send_email_again)
        Spacer(modifier = Modifier.height(25.dp))
        SendCodeOption(Modifier.fillMaxWidth(),R.drawable.ic_get_code_sms,R.string.get_code_via_sms)
    }
}

@Composable
fun SendCodeOption(
    modifier: Modifier,
    @DrawableRes icon: Int,
    @StringRes title: Int,
) {
    Row(
        modifier = modifier,
    ) {
        Image(
            painter = painterResource(id = icon),
            contentDescription = null,
            modifier = Modifier
                .height(18.dp)
        )
        Spacer(modifier = Modifier.width(20.dp))
        Text(
            text = stringResource(id = title),
            style = TextStyle(
                color = Color.Black,
                fontSize = 12.sp,
                fontWeight = FontWeight.W400,
            )
        )
    }
}