package com.example.articulosdecompose

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.articulosdecompose.ui.theme.ArticulosDeComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ArticulosDeComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    ArticuloDeComposeLayaut()
                }
            }
        }
    }
}
@Preview(showBackground = true)
@Composable
fun VistaPrevia() {
    ArticulosDeComposeTheme {
        ArticuloDeComposeLayaut()
        
    }
}
@SuppressLint("SuspiciousIndentation")
@Composable
fun ArticuloDeComposeLayaut(){
    val imagen = painterResource(R.drawable.bg_compose_background)
        Column() {
            Image(
                painter = imagen ,
                contentDescription =null,
                contentScale = ContentScale.Fit
            )
            Titulo(stringResource(R.string.tituloString))
            TextoDescripcionCorto(stringResource(R.string.textoDescripcionCorto))
            TextoDescripcionLargo(stringResource(R.string.textoDescripcionLargo))
        }

}
/*
Configura el primer elemento Text que admite
composición con un tamaño de fuente 24sp y
un padding de 16dp
(inicio, fin, parte inferior y parte superior).
 */
@Composable
fun Titulo(titulo : String ,  modifier: Modifier = Modifier){
    Text(
        text = titulo,
        fontSize =  24.sp,
        modifier = Modifier.padding(24.dp)
        )
}
@Composable
fun TextoDescripcionCorto(texto : String){
    /*
    Configura el segundo elemento Text que
     admite composición con un tamaño de
     fuente predeterminado, un padding de 16dp (inicio y fin) y una
      alineación del texto de tipo Justify.
     */
    Text(
        text = texto,
        modifier = Modifier.padding(
            start = 16.dp,
            end = 16.dp
        ),
        textAlign = TextAlign.Justify
    )

}
/*
Configura el tercer elemento Text que admite composición con un tamaño de fuente predeterminado,
 un padding de 16dp (inicio, fin, parte inferior y parte superior) y una alineación del texto de tipo Justify..
 */
@Composable
fun TextoDescripcionLargo(texto : String){
    Text(
        text = texto,
        modifier = Modifier.padding(16.dp),
        textAlign = TextAlign.Justify
    )
}



