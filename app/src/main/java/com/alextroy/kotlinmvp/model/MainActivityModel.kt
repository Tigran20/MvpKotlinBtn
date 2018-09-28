package com.alextroy.kotlinmvp.model

import com.alextroy.kotlinmvp.presenter.Contract.Model

class MainActivityModel : Model {
    private var mCounter = 0

    override fun getCounter() = mCounter

    override fun incrementCounter() {
        mCounter++
    }
}