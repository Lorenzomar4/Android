package com.example.limonada.model

import com.example.limonada.model.stage.Plant
import com.example.limonada.model.stage.Stage
import android.util.Log


class Limonade(var stage: Stage) {

    fun click() {
        Log.d("Limonade", "Clicked! Current stage: ${stage::class.simpleName}")
        stage.pressImage(this)
    }

    val image: Int
        get() = stage.image

    val desc: Int
        get() = stage.desc


}