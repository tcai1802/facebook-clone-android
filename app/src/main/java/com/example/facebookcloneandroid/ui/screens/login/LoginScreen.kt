
import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.absolutePadding
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusDirection
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.facebookcloneandroid.R
import com.example.facebookcloneandroid.navigation.NavigationScreen
import com.example.facebookcloneandroid.ui.components.ButtonType
import com.example.facebookcloneandroid.ui.components.DefaultButton
import com.example.facebookcloneandroid.ui.components.DefaultTextField
import com.example.facebookcloneandroid.ui.theme.Blue2669FF
import com.example.facebookcloneandroid.ui.theme.GreyAAA


@Preview(showSystemUi = true)
@Composable
fun LoginScreenPreview() {
    LoginScreen(onNavigate = {});
}

@Composable
fun LoginScreen(
    modifier: Modifier = Modifier,
    onNavigate: (route: String) -> Unit
) {
    val focusManager = LocalFocusManager.current
    val phoneRequester = remember { FocusRequester() }
    val passRequester = remember { FocusRequester() }


    Box(
        modifier = modifier.background(Color.White)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState())
                .padding(top = 160.dp, start = 40.dp, end = 40.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.drawable.logo),
                contentDescription = null,
                modifier = Modifier
                    .width(50.dp)
                    .height(80.dp)
            )
            Box(modifier = Modifier.height(20.dp))
            DefaultTextField(
                hintText = stringResource(id = R.string.email_phone_hint),
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Password,
                    imeAction = ImeAction.Next,
                ),
                onNext = {
                    focusManager.moveFocus(FocusDirection.Next)
                },
                focusRequester = phoneRequester
            )
            Box(modifier = Modifier.height(20.dp))
            DefaultTextField(
                hintText = stringResource(id = R.string.password_hint),
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Password,
                    imeAction = ImeAction.Done,
                ),
                onDone = {
                    focusManager.clearFocus()
                },
                focusRequester = passRequester
            )
            Box(modifier = Modifier.height(50.dp))
            DefaultButton(
                title = "Login",
                buttonType = ButtonType.Filled,
            )
            Box(modifier = Modifier.height(20.dp))
            Text(
                modifier = Modifier
                    .clickable (

                    ) {
                        onNavigate(NavigationScreen.ForgotPassword.route)
                        Log.d("Tag", "Forgot password")
                    },
                text = "Forgot Password?",
                style = TextStyle(
                    fontSize = 14.sp,
                    fontWeight = FontWeight.W700,
                    color = colorResource(id = R.color.primary_1)
                )
            )
            Box(modifier = Modifier.height(20.dp))
            Row(verticalAlignment = Alignment.CenterVertically) {
                Box(modifier = Modifier
                    .weight(1f)
                    .height(1.dp)
                    .background(GreyAAA))
                Text(
                    modifier = Modifier
                        .padding(horizontal = 10.dp),
                    text = "OR",
                    style = TextStyle(
                        fontSize = 14.sp,
                        fontWeight = FontWeight.W400,
                        color = GreyAAA,
                    )
                )
                Box(modifier = Modifier
                    .weight(1f)
                    .height(1.dp)
                    .background(GreyAAA))
            }
            Box(modifier = Modifier.height(20.dp))
            DefaultButton(
                title = "Create new Facebook account",
                buttonType = ButtonType.Outline,
            )
            Box(modifier = Modifier.height(20.dp))
        }
        LoginCanvas(
            modifier = Modifier
                .fillMaxWidth()
                .height(180.dp),
            colorBackground = Blue2669FF,
            hasBorderRight = true,
        )
        LoginCanvas(
            modifier = Modifier
                .fillMaxWidth()
                .height(180.dp)
                .absolutePadding(top = 20.dp),
            colorBackground = Blue2669FF.copy(alpha = 0.7f)
        )
        LoginCanvas(
            modifier = Modifier
                .fillMaxWidth()
                .height(180.dp)
                .absolutePadding(top = 40.dp),
            colorBackground = Blue2669FF.copy(alpha = 0.4f)
        )
        LoginCanvas(
            modifier = Modifier
                .fillMaxWidth()
                .height(180.dp)
                .padding(top = 60.dp),
            colorBackground = Blue2669FF.copy(alpha = 0.2f)
        )


    }
}
