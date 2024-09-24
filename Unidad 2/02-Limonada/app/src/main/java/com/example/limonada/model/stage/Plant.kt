package com.example.limonada.model.stage

import com.example.limonada.R
import com.example.limonada.model.Limonade

class Plant(
    override val desc: Int = R.string.tap_the_lemon_tree_to_select_a_lemon,
    override val image: Int = R.drawable.lemon_tree
) : Stage {

    override fun pressImage(limonade: Limonade) {
        limonade.stage = nextStage()
    }

    override fun nextStage(): Stage {
        return Squeeze(
            desc = R.string.keep_tapping_the_lemon_to_squeeze_it,
            image = R.drawable.lemon_squeeze,
            trys = randomNumber()
        )
    }


    private fun randomNumber(): Int {
        return (2..4).random()
    }

}

