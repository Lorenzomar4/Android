package com.example.limonada.model.stage

import com.example.limonada.R
import com.example.limonada.model.Limonade

class LemonDrink(override val desc: Int, override val image: Int) : Stage {

    override fun pressImage(limonade: Limonade) {
        limonade.stage = nextStage()
    }

    override fun nextStage(): Stage {
        return LemonRestart(desc = R.string.tap_the_empty_glass_to_start_again , image = R.drawable.lemon_restart)
    }
}