package com.example.cuadrantedecompose


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent

import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.cuadrantedecompose.ui.theme.CuadranteDeComposeTheme
import androidx.compose.foundation.background
import androidx.compose.ui.Alignment
import androidx.compose.ui.unit.dp
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CuadranteDeComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    CuadranteDeComposelLayout()
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun vistaPrevia() {
    CuadranteDeComposeTheme {
        CuadranteDeComposelLayout()
    }
}
@Composable
fun CuadranteDeComposelLayout(){
    Column(Modifier.fillMaxWidth()) {
        Row(Modifier.weight(1f)) {
            CardInfo(
                titulo = "Text composable",
                descripcion = "Displays text and follows Material Design guidelines.",
                colorDeFondo = Color.Green,
                modifier = Modifier.weight(1f)
            )
            CardInfo(
                titulo = "Eso",
                descripcion = "Displays text and follows Material Design guidelines.",
                colorDeFondo = Color.Red,
                modifier = Modifier.weight(1f)
            )

        }

        Row(Modifier.weight(1f)) {
            CardInfo(
                titulo = "Text composable",
                descripcion = "Displays text and follows Material Design guidelines.",
                colorDeFondo = Color.Cyan,
                modifier = Modifier.weight(1f)
            )
            CardInfo(
                titulo = "EESOOOO",
                descripcion = "Displays text and follows Material Design guidelines.",
                colorDeFondo = Color.Gray,
                modifier = Modifier.weight(1f)
            )

        }

    }
}


@Composable
fun CardInfo(
    titulo: String,
    descripcion: String,
    colorDeFondo: Color,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(colorDeFondo)
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = titulo,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 16.dp)
        )
        Text(
            text = descripcion,
            textAlign = TextAlign.Justify
        )
    }
}



