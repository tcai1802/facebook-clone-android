package com.example.facebookcloneandroid.ui.screens.term_privacy

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.facebookcloneandroid.R
import com.example.facebookcloneandroid.navigation.Routes
import com.example.facebookcloneandroid.ui.components.DefaultButton
import com.example.facebookcloneandroid.ui.theme.Blue384CFF
import com.example.facebookcloneandroid.ui.theme.Grey999

@Preview(showSystemUi = true)
@Composable
fun TermPrivacyScreenPreview() {
    TermPrivacyScreen {}
}
@Composable
fun TermPrivacyScreen(
    onNavigate: (route: String) -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 40.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.height(30.dp))
        Text(
            text = "Finishing signing up",
            style = TextStyle(
                color = Color.Black,
                fontSize = 18.sp,
                fontWeight = FontWeight.W600,
            )
        )
        Spacer(modifier = Modifier.height(10.dp))
        Text(
            buildAnnotatedString {
                append("By tapping Sign up, you agree to our \n")
                withStyle(style = SpanStyle(color = Blue384CFF)
                ) {
                    append("Terms, Data Policy")
                }
                append(" and ")
                withStyle(style = SpanStyle(color = Blue384CFF)
                ) {
                    append("Cookies Policy")
                }
            },
            style = TextStyle(
                color = Grey999,
                fontSize = 12.sp,
                fontWeight = FontWeight.W400,
                textAlign = TextAlign.Center
            )
        )
        Spacer(modifier = Modifier.weight(1f))
        DefaultButton(
            title = "Sign up",
            onTap = {
                onNavigate(Routes.DashBoard.route)
            }
        )
        Spacer(modifier = Modifier.height(10.dp))
        Text(
            text = "Sign up without updating my contact",
            style = TextStyle(
                fontSize = 12.sp,
                fontWeight = FontWeight.W400,
                color = colorResource(id = R.color.primary_1)
            )
        )
        Spacer(modifier = Modifier.weight(1f))
        Spacer(modifier = Modifier.weight(2f))
        Text(
            text = "The Facebook company is now Meta. While our company name is changing, we are continuing to offer the same products, including the Facebook app from Meta. Our Data Policy and Terms of Service remain in effect, and this name change does not affect how we use or share data. Learn more about Meta and our vision for the metaverse.",
            style = TextStyle(
                fontSize = 12.sp,
                fontWeight = FontWeight.W300,
                color = Color.Black,
                textAlign = TextAlign.Center
            )
        )
        Spacer(modifier = Modifier.height(20.dp))
    }
}