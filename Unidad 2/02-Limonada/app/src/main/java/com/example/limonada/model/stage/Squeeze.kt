package com.example.limonada.model.stage

import com.example.limonada.R
import com.example.limonada.model.Limonade

class Squeeze(val trys : Int, override val desc: Int , override val image: Int) : Stage {

    var click : Int = 0

    override fun pressImage(limonade: Limonade) {

        if(click>=trys){




        }
        else{
            click++
        }



    }

    override fun nextStage(): Stage {
        return LemonDrink(desc = R.string.tap_the_lemon_tree_to_select_a_lemon , image = R.drawable.lemon_squeeze)
    }


}