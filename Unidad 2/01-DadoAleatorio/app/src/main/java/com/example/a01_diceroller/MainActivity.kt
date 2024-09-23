package com.example.a01_diceroller

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.a01_diceroller.ui.theme._01DiceRollerTheme
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Button
import androidx.compose.ui.Alignment
import androidx.compose.ui.res.stringResource
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue




import androidx.compose.runtime.mutableStateOf

class MainActivity : ComponentActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            _01DiceRollerTheme {
                DiceRollerApp()
            }
        }
    }
}



@Preview(showBackground = true)
@Composable
fun DiceRollerApp() {
    DiceWithButtonAndImage(modifier = Modifier
        .fillMaxSize()
        .wrapContentSize(Alignment.Center))

}

@Composable
fun DiceWithButtonAndImage(modifier: Modifier = Modifier) {
    var result by remember { mutableStateOf(1) }

    Column (
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(obtenerImagen(result)!!),
            contentDescription = "1"

        )
        Spacer(modifier = Modifier.height(16.dp))

        Button(onClick = { result = randomNumber()}) {
            Text(stringResource(R.string.roll))
        }


    }

}

fun randomNumber() : Int {
    val toReturn : Int = (1..6).random()
    println(toReturn)
    return toReturn
}

fun obtenerImagen( entero : Int) : Int? {
    val map: MutableMap<Int, Int> = mutableMapOf(
        1 to R.drawable.dice_1 ,
        2 to R.drawable.dice_2 ,
        3 to R.drawable.dice_3 ,
        4 to R.drawable.dice_4 ,
        5 to R.drawable.dice_5 ,
        6 to R.drawable.dice_6 ,
    )

    return map[entero]
}