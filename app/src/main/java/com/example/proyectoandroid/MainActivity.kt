package com.example.proyectoandroid

import android.media.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.proyectoandroid.ui.theme.ProyectoAndroidTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ProyectoAndroidTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                   // BirthdayGreetingWithText("feliz cumpleaños","- por Raul")
                    BirthdayGreetingWithImage("Happy Birthday Sam!", "- from Emma")
                }
            }
        }
    }
}
@Composable
fun BirthdayGreetingWithImage(message: String, from: String, modifier: Modifier = Modifier) {
    val imagen = painterResource(R.drawable.androidparty)
    Box{
        Image(
            painter = imagen,
            contentDescription = null ,
            contentScale = ContentScale.Crop
        )
        BirthdayGreetingWithText("feliz cumpleaños","- por Raul")
    }
}

@Composable
fun Greeting(name: String) {
        Text(text = "Hola mi nombre es $name!",modifier = Modifier.padding(24.dp))
}


@Composable
fun BirthdayGreetingWithText(message: String, from: String, modifier: Modifier = Modifier){

        Column(modifier = Modifier.fillMaxSize(),
            /*De esta manera, se establecerá la altura y el ancho
            del diseño de la columna en la altura y el ancho máximos disponibles. */
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally

        ) {


            Text(
                text = message ,
                fontSize = 26.sp ,
                modifier = Modifier.padding(
                    top = 16.dp,
                    bottom = 30.dp
                )
            )
            Text(
                text = from,
                fontSize = 16.sp
            )
        }
}
@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ProyectoAndroidTheme {
      //  BirthdayGreetingWithText("feliz cumpleaños","- por Raul")
        BirthdayGreetingWithImage("Happy Birthday Sam!", "- from Emma")
    }
}
