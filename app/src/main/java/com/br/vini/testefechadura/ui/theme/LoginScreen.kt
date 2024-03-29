package com.br.vini.testefechadura.ui.theme

import com.br.vini.testefechadura.R
import androidx.compose.foundation.Image
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldColors
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Black
import androidx.compose.ui.graphics.Color.Companion.Gray
import androidx.compose.ui.graphics.Color.Companion.Green
import androidx.compose.ui.graphics.Color.Companion.Yellow
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginScreen() {
    var email by remember {mutableStateOf("")}
    var password by remember {mutableStateOf("")}
    Surface(
        color = Fechadura,
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())

    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 100.dp),
            verticalArrangement = Arrangement.SpaceBetween,
            horizontalAlignment = Alignment.CenterHorizontally
            ) {
            Column( horizontalAlignment = Alignment.CenterHorizontally) {
                Image(
                    painter = painterResource(id = R.drawable.logo_oficial_fechadura),
                    contentDescription = "Logo do ifro",
                    modifier = Modifier
                        .width(200.dp)
                        .height(200.dp)
                )
                Text(text = "Entre já em sua conta")
            }
            Column(
                modifier = Modifier.padding(bottom = 60.dp, start = 20.dp, end = 20.dp)

            ) {
                OutlinedTextField(
                    value = email ,
                    onValueChange = {email = it},
                    label = { Text(
                        "E-mail", style = TextStyle(
                            color = Black
                        ))},
                    modifier = Modifier.fillMaxWidth(),
                    colors = TextFieldDefaults.outlinedTextFieldColors(
                        focusedBorderColor = Gray,
                        unfocusedBorderColor = Black,
                        cursorColor = Black
                    ),
                )
                OutlinedTextField(
                    value = password,
                    onValueChange = {password = it},
                    label = {Text (
                        "Coloque sua senha",
                        style = TextStyle(
                            color = Black))},
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 10.dp),
                    colors = TextFieldDefaults.outlinedTextFieldColors(
                        focusedBorderColor = Gray,
                        unfocusedBorderColor = Black,
                        cursorColor = Black
                    ),
                    visualTransformation = PasswordVisualTransformation(),
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password)
                )
                Button(
                    onClick = { },
                    Modifier
                        .fillMaxWidth()
                        .padding(top = 30.dp)
                        .height(55.dp)
                    ,
                    colors = ButtonDefaults.buttonColors(
                        containerColor = botao
                    )

                ) {
                    Text(
                        text = "Entrar",
                        color = Color.White)
                }
            }

        }
    }
}

/*


 */


@Preview
@Composable
fun LoginScreenPreview() {
    LoginScreen()
}