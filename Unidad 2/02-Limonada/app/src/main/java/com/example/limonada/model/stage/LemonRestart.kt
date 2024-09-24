package com.example.limonada.model.stage

import com.example.limonada.model.Limonade

class LemonRestart(override val desc: Int, override val image: Int) : Stage {
    override fun pressImage(limonade: Limonade) {
        limonade.stage = nextStage()
    }

    override fun nextStage(): Stage {
        return Plant()
    }
}