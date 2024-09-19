package com.example.mipresentacion

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Menu
import androidx.compose.material.icons.rounded.Phone
import androidx.compose.material.icons.rounded.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mipresentacion.ui.theme.MiPresentacionTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MiPresentacionTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    val color : Color = colorHex("#000016")

    Column(modifier = Modifier
        .background(color)
        .fillMaxSize()) {

            UserProfile(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1.5F)
                    .padding(bottom = 20.dp)
            )
             UserData(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1F)
                    .padding(bottom = 30.dp)
            )



    }
}


@Composable
fun UserProfile(modifier :Modifier = Modifier){
    Column (modifier = modifier ,
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Bottom ,

    ) {
        Image(
            painter = painterResource(R.drawable.android_logo),
            contentDescription = null,
            modifier = Modifier
                .height(150.dp)
                .width(150.dp)

        )
        Spacer(modifier = Modifier.height(10.dp)) // Espacio entre la imagen y el primer texto

        Text(
            text = stringResource(R.string.lorenzo_martinez),
            fontWeight = FontWeight.Bold ,
            color = Color.White ,
            fontSize = 30.sp
        )
        Spacer(modifier = Modifier.height(10.dp)) // Espacio entre la imagen y el primer texto

        Text(
            text = stringResource(R.string.software_developer),
            color = Color.Green ,
            fontSize = 20.sp ,
        )


    }
}

@Composable
fun UserData(modifier :Modifier = Modifier){

    Column(modifier = modifier ,
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Bottom

        ){
        Column(

            verticalArrangement = Arrangement.spacedBy(16.dp) // Espacio uniforme entre IconAndInfo
        ) {
            IconAndInfo(Icons.Rounded.Phone, stringResource(R.string._54_1138468037))
            IconAndInfo(Icons.Rounded.Share, stringResource(R.string.lorenzomar3))
            IconAndInfo(Icons.Rounded.Email, stringResource(R.string.lorenzomar7044_gmail_com_ar))
        }

    }

}

@Composable
fun IconAndInfo( icon : ImageVector , theText :  String,modifier: Modifier = Modifier){
    Row {
        Icon(
            imageVector = icon ,
            contentDescription = "Localized description" ,
            tint = Color.Green
        )
        Spacer(modifier = Modifier.width(10.dp))
        Text(
            text =  theText,
            color = Color.White,
            fontSize = 12.sp

        )
    }



}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MiPresentacionTheme {
        Greeting("Android", modifier = Modifier.background(Color.Black))
    }
}

fun colorHex(stringColor: String): Color {
    return Color(android.graphics.Color.parseColor(stringColor))
}
