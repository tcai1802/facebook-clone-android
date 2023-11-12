
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

fun WhatYourNameScreenPreview() {
    WhatYourNameScreen {}
}


@Composable
fun WhatYourNameScreen(
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
            text = "What’s your name?",
            style = TextStyle(
                color = Color.Black,
                fontSize = 18.sp,
                fontWeight = FontWeight.W600,
            )
        )
        Spacer(modifier = Modifier.height(10.dp))
        Text(
            text = "Enter the name you use in real life.",
            style = TextStyle(
                color = Grey999,
                fontSize = 12.sp,
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.W400,
            )
        )
        Spacer(modifier = Modifier.weight(1f))
        Row {
            DefaultTextField(
                modifier = Modifier.weight(1f),
                labelText = "First Name",
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Password,
                    imeAction = ImeAction.Next,
                ),
                onNext = {
                    focusManager.moveFocus(FocusDirection.Next)
                },
                focusRequester = firstNameRequester,
            )
            Spacer(modifier = Modifier.width(30.dp))
            DefaultTextField(
                modifier = Modifier.weight(1f),
                labelText = "Last Name",
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Password,
                    imeAction = ImeAction.Done,
                ),
                onDone = {
                    focusManager.clearFocus()
                },
                focusRequester = lastNameRequester
            )
        }
        Spacer(modifier = Modifier.weight(1f))
        DefaultButton(
            title = stringResource(id = R.string.next),
            onTap = {
                onNavigate(Routes.WhatYourBirthday.route)
            }
        )
        Spacer(modifier = Modifier.weight(2f))
    }
}
