package com.example.facebookcloneandroid.ui.components

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.facebookcloneandroid.ui.theme.Grey999

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DefaultTextField(
    hintText: String = "",
    keyboardOptions: KeyboardOptions? = null,
    keyboardActions: KeyboardActions? = null,
    onNext: () -> Unit,
    onDone: () -> Unit,
    focusRequester: FocusRequester
) {
    var text by remember { mutableStateOf("") }

    Box(
        modifier = Modifier
            .background(color = Color.Transparent)
    ) {
        BasicTextField(
            value = text,
            onValueChange = {
                text = it
            },
            keyboardOptions = keyboardOptions ?: KeyboardOptions(
                keyboardType = KeyboardType.Text,
                imeAction = ImeAction.Next,
            ),
            keyboardActions = keyboardActions ?: KeyboardActions(
                onNext = {
                    onNext()
                },
                onDone = {
                    onDone()
                    Log.d(null, "On done")
                },
            ),
            maxLines = 1,
            textStyle = TextStyle(
                fontSize = 14.sp,
                fontWeight = FontWeight.W400,
                color = Color.Black,
            ),
            modifier = Modifier
                .fillMaxWidth()
                .focusRequester(focusRequester),
            decorationBox = @Composable {innerTextField ->
                TextFieldDefaults.DecorationBox(
                    value = text,
                    colors = TextFieldDefaults.colors(
                        disabledContainerColor = Color.Transparent,
                        focusedContainerColor = Color.Transparent,
                        unfocusedContainerColor = Color.Transparent,
                        unfocusedIndicatorColor = Grey999,
                        focusedIndicatorColor = Grey999,
                        focusedTextColor = Color.Black,
                    ),
                    singleLine = true,
                    enabled = true,
                    innerTextField = innerTextField,
                    visualTransformation = VisualTransformation.None,
                    interactionSource = remember { MutableInteractionSource() },
                    contentPadding = PaddingValues(vertical = 5.dp),
                    placeholder = { Text(
                        text = hintText,
                        style = TextStyle(
                            fontSize = 14.sp,
                            fontWeight = FontWeight.W400,
                            color = Grey999
                        )
                    )
                    },
                )
            }
        )
    }
}