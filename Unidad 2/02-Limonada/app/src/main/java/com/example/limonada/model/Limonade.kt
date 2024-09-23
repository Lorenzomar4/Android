package com.example.limonada.model

import com.example.limonada.model.stage.Plant
import com.example.limonada.model.stage.Stage

class Limonade( var stage : Stage) {


    fun click(){
        stage.pressImage(this)
    }






}