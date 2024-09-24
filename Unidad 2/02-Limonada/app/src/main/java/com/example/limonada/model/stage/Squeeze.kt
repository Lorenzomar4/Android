package com.example.limonada.model.stage

import com.example.limonada.R
import com.example.limonada.model.Limonade

class Squeeze(val trys: Int, override val desc: Int, override val image: Int) : Stage {

    var click: Int = 0

    override fun pressImage(limonade: Limonade) {

        if (click >= trys) {
            limonade.stage = nextStage()
        } else {
            click++
        }
    }

    override fun nextStage(): Stage {
        return LemonDrink(
            desc = R.string.tap_the_lemonade_to_drink_it,
            image = R.drawable.lemon_drink
        )
    }


}