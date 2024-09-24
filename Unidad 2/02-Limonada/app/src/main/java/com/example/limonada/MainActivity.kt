package com.example.limonada

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.limonada.model.Limonade
import com.example.limonada.model.stage.Plant
import com.example.limonada.ui.theme.LimonadaTheme
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LimonadaTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    LimonadeAction(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}


@Composable
fun LimonadeAction(name: String, modifier: Modifier = Modifier) {

    Column(modifier = Modifier.fillMaxWidth()) {

        Row(
            modifier = Modifier
                .weight(1F)
                .fillMaxWidth()
                .background(Color.Yellow),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = stringResource(R.string.limonade),
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold
            )
        }

        Column(
            modifier = Modifier
                .weight(16F)
                .fillMaxWidth(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally

        ) {
            LimonadeStage()
        }

    }

}


@Composable
fun LimonadeStage() {
    val limonade: Limonade = remember { Limonade(Plant()) }
    var imagen by remember { mutableStateOf(limonade.image) }
    var text by remember { mutableStateOf(limonade.desc) }

    Image(
        modifier = Modifier.clickable {
            limonade.click()
            imagen = limonade.image
            text = limonade.desc
        },
        painter = painterResource(id = imagen),
        contentDescription = stringResource(R.string.click_me)
    )

    Text(
        text = stringResource(text)
    )
}



@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    LimonadaTheme {
        LimonadeAction("Android", modifier = Modifier.fillMaxSize())
    }
}