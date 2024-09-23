package com.example.limonada.model.stage

import com.example.limonada.model.Limonade

interface Stage {
    val desc : Int
    val image : Int

    fun pressImage(limonade: Limonade)

    fun nextStage() : Stage


}

