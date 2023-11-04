package com.example.facebookcloneandroid.ui.screens.splash
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.facebookcloneandroid.R
import kotlinx.coroutines.delay

@Preview(showSystemUi = true)
@Composable
fun SplashScreenPreview() {
    SplashScreen(){};
}
@Composable
fun SplashScreen(
    modifier: Modifier = Modifier,
    changePage: () -> Unit,
) {

    LaunchedEffect(key1 = true) {
        while(true) {
            delay(4000)
            changePage()
        }
    }


    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier,
    ) {
        Spacer(modifier = Modifier.weight(1f))
        Image(
            painter = painterResource(id = R.drawable.logo),
            contentDescription = null,
            modifier = Modifier
                .width(130.dp)
                .height(100.dp)
        )
        Text(
            text = stringResource(id = R.string.app_name),
            fontSize = 28.sp,
            fontWeight = FontWeight.W700,
            style = TextStyle(
                brush = Brush.linearGradient(
                    colors = arrayListOf(colorResource(id = R.color.primary_1), colorResource(id = R.color.primary_2)),
                    start = Offset.Zero,
                    end = Offset(100.0f, 100.0f)
                )
            )
        )
        Spacer(modifier = Modifier.weight(1f))
        Text(
            text = "From",
            style = TextStyle(
                fontSize = 14.sp,
                fontWeight = FontWeight.W400,
                color = Color(R.color.screaming_grey)
            )
        )
        Spacer(modifier = Modifier.height(10.dp))
        Image(
            painter = painterResource(id = R.drawable.meta_logo),
            contentDescription = null,
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .width(101.dp)
                .height(20.dp)
        )
        Spacer(modifier = Modifier.height(10.dp))
    }
}

