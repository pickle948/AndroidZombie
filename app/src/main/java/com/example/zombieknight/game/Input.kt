package com.example.zombieknight.game

enum class Action {MOVE_LEFT, MOVE_RIGHT, JUMP, FIRE, ACCEPT}

class Input {
    private val held = mutableSetOf<Action>()
    private val pressed = mutableSetOf<Action>()

    fun isPressed() {}
    fun justPressed() {}
    fun pressAction() {}
    fun releaseAction() {}
    fun releaseAll() {}
    fun endTick() {}

}