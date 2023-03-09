package com.example.cartadepresentacion

import android.graphics.drawable.Icon
import android.os.Bundle
import android.widget.Space
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.VerticalAlignmentLine
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.cartadepresentacion.ui.theme.CartaDePresentacionTheme

import androidx.compose.material.Icon
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Share
import androidx.compose.material.icons.rounded.Call
import androidx.compose.material.icons.rounded.Menu

import androidx.compose.ui.graphics.vector.ImageVector


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CartaDePresentacionTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    CartaDePresentacionArq(colorHex(stringResource(R.string.azulOscFondo)))
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    CartaDePresentacionTheme {
        CartaDePresentacionArq(colorHex(stringResource(R.string.azulOscFondo)))
    }
}

@Composable
fun CartaDePresentacionArq(
    colorFondo: Color
) {
    Column(
        modifier = Modifier

            .background(color = colorFondo)


    ) {
        Spacer(Modifier.height(180.dp))

        LogoConTextoContenedor(
            painterResource(id = R.drawable.android_logo),
            stringResource(R.string.Nombre),
            stringResource(R.string.Desc)
        )

        Spacer(Modifier.height(150.dp))

        ContenedorDeDatosDelUsuario(
            Icons.Filled.Phone,
            stringResource(R.string.numeroDeCelular),
        )
        ContenedorDeDatosDelUsuario(
            Icons.Filled.Share,
            stringResource(R.string.shareDesc)
        )
        ContenedorDeDatosDelUsuario(
            Icons.Filled.Email,
            stringResource(R.string.emailString)
        )
    }
}

@Composable
fun LogoConTextoContenedor(
    imagen: Painter,
    nombre: String,
    descripcion: String
) {
    Column(
        Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Image(
            painter = imagen,
            contentDescription = null,
            Modifier
                .height(150.dp)
                .width(150.dp)
        )
        Text(
            text = nombre,
            color = Color.White,
            modifier = Modifier.padding(
                top = 10.dp,
                bottom = 10.dp
            )
        )

        Text(
            text = descripcion,
            color = Color.Green,
            fontWeight = FontWeight.Bold
        )

    }
}

val MyAppIcons = Icons.Rounded.Call

@Composable
fun ContenedorDeDatosDelUsuario(
    icono: ImageVector,
    informacion: String
) {
    Column(
        Modifier
            .fillMaxWidth()

    ) {
        Row(
            modifier = Modifier
                
                .fillMaxWidth()
                .height(40.dp),
            verticalAlignment = Alignment.CenterVertically

        ) {
            Icon(
                icono,
                contentDescription = null,
                tint = Color.Gray,
                modifier = Modifier.padding(
                    start = 20.dp,
                    end = 20.dp
                )

            )
            Text(
                text = informacion,
                color = Color.White
            )
        }

    }
}

fun colorHex(stringColor: String): Color {
    return Color(android.graphics.Color.parseColor(stringColor))
}


