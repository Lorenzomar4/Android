package com.example.administradordetareas

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.font.FontWeight.Companion.Bold
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.administradordetareas.ui.theme.AdministradorDeTareasTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AdministradorDeTareasTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    AdministradorDeTareasLayout(
                        painterResource(R.drawable.ic_task_completed),
                        stringResource(R.string.textoEnNegrita),
                        stringResource(R.string.textoNormal)
                    )

                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun VistaPorDefecto() {
    AdministradorDeTareasTheme {
        Surface() {
            AdministradorDeTareasLayout(
                painterResource(R.drawable.ic_launcher_background),
                stringResource(R.string.textoEnNegrita),
                stringResource(R.string.textoNormal)
            )

        }

    }
}
@Composable
fun AdministradorDeTareasLayout(
     laImagen : Painter,
     textoNegrita: String,
     texto: String
){
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        imagen(laImagen)
        TextoEnNegrita(textoNegrita)
        Texto(texto)

    }


}
@Composable
fun imagen( imagen : Painter){
    Image(painter = imagen,
        contentDescription = null,
        contentScale = ContentScale.Fit)

}


@Composable
fun TextoEnNegrita(texto : String){
    Text(
        text = texto,
        modifier = Modifier.padding(
            top=24.dp,
            bottom = 8.dp
        ),
        fontWeight = Bold
    )


}
@Composable
fun Texto(texto : String){
    Text(
        text = texto,
        fontSize = 16.sp
    )

}

