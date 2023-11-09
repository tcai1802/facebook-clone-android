
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
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
import androidx.compose.ui.res.painterResource
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
import com.example.facebookcloneandroid.ui.theme.Grey999

@Preview(showSystemUi = true)
@Composable

fun JoinFacebookScreenPreview() {
    JoinFacebookScreenScreen {}
}


@Composable
fun JoinFacebookScreenScreen(
    onNavigate: (route: String) -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 40.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.height(30.dp))

        Image(
            painter = painterResource(id = R.drawable.join_facebook_image),
            contentDescription = null,
            modifier = Modifier
                .height(218.dp)
        )
        Spacer(modifier = Modifier.weight(1f))
        Text(
            text = "Join Facebook",
            style = TextStyle(
                color = Color.Black,
                fontSize = 18.sp,
                fontWeight = FontWeight.W600,
            )
        )
        Spacer(modifier = Modifier.height(20.dp))
        Text(
            text = "We’ll help you \n create a new account in a few easy steps.",
            style = TextStyle(
                color = Grey999,
                fontSize = 12.sp,
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.W400,
            )
        )
        Spacer(modifier = Modifier.weight(1f))
        DefaultButton(
            title = stringResource(id = R.string.next),
            onTap = {
                onNavigate(Routes.WhatYourName.route)
            }
        )
        Spacer(modifier = Modifier.weight(2f))
        Text(
            modifier = Modifier
                .clickable (

                ) {
                    onNavigate(Routes.Login.route)
                },
            text = stringResource(id = R.string.have_an_account_exits),
            style = TextStyle(
                fontSize = 14.sp,
                fontWeight = FontWeight.W700,
                color = colorResource(id = R.color.primary_1)
            )
        )
        Spacer(modifier = Modifier.height(20.dp))
    }
}
