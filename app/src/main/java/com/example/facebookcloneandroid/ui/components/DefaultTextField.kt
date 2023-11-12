package com.example.facebookcloneandroid.ui.components

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsFocusedAsState
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
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
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.facebookcloneandroid.R
import com.example.facebookcloneandroid.ui.theme.Grey999

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DefaultTextField(
    hintText: String = "",
    labelText: String? = null,
    keyboardOptions: KeyboardOptions? = null,
    keyboardActions: KeyboardActions? = null,
    textStyle: TextStyle? = null,
    hintStyle: TextStyle? = null,
    onNext: () -> Unit = {},
    onDone: () -> Unit = {},
    onValidate: (value: String) -> Boolean = {true},
    focusRequester: FocusRequester,
    modifier: Modifier = Modifier,
) {
    var text by remember { mutableStateOf(value = "") }
    var interactionSource =  remember { MutableInteractionSource() }
    val isFocused by interactionSource.collectIsFocusedAsState()

    Box(
        modifier = modifier.background(color = Color.Transparent),
    ) {
        Column {
            if (labelText != null ) Text(
                labelText,
                style = TextStyle(
                    fontSize = 12.sp,
                    fontWeight = FontWeight.W400,
                    color = if(isFocused) Color.Blue else Grey999,
                )
            )
            BasicTextField(
                value = text,
                onValueChange = {
                    if (onValidate(it)) text = it
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
                textStyle = textStyle ?: TextStyle(
                    fontSize = 14.sp,
                    fontWeight = FontWeight.W400,
                    color = Color.Black,
                ),
                enabled = true,
                interactionSource = interactionSource,
                visualTransformation = VisualTransformation.None,
                modifier = Modifier
                    .fillMaxWidth()
                    .focusRequester(focusRequester),
                decorationBox = @Composable { innerTextField ->
                    TextFieldDefaults.DecorationBox(
                        value = text,
                        innerTextField = innerTextField,
                        enabled = true,
                        singleLine = true,
                        visualTransformation = VisualTransformation.None,
                        interactionSource = interactionSource,
                        placeholder = {
                            Text(
                                modifier = Modifier.fillMaxWidth(),
                                text = hintText,
                                style = hintStyle ?: TextStyle(
                                    fontSize = 14.sp,
                                    fontWeight = FontWeight.W400,
                                    color = Grey999
                                )
                            )
                        },
                        colors = TextFieldDefaults.colors(
                            disabledContainerColor = Color.Transparent,
                            focusedContainerColor = Color.Transparent,
                            unfocusedContainerColor = Color.Transparent,
                            unfocusedIndicatorColor = Grey999,
                            focusedIndicatorColor = colorResource(id = R.color.primary_1),
                            focusedTextColor = Color.Black,
                        ),
                        contentPadding = PaddingValues(vertical = 5.dp),
                    )

                }
            )
        }
    }
}