package com.example.limonada.model.stage

import com.example.limonada.R
import com.example.limonada.model.Limonade

class Plant(override val desc: Int = 1, override val image: Int = 2) : Stage {


    override fun pressImage(limonade: Limonade) {
        limonade.stage = nextStage()
    }

    override fun nextStage(): Stage {
        return Squeeze(desc = R.string.tap_the_lemon_tree_to_select_a_lemon , image = R.drawable.lemon_squeeze , trys =  randomNumber())
    }


    private fun randomNumber() :Int{
        return (2..4).random()
    }

}

