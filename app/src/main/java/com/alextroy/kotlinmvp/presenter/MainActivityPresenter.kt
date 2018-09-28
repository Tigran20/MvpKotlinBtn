package com.alextroy.kotlinmvp.presenter

import com.alextroy.kotlinmvp.model.MainActivityModel
import com.alextroy.kotlinmvp.presenter.Contract.*


class MainActivityPresenter(_view: View) : Presenter {
    private var view: View = _view
    private var model: Model = MainActivityModel()

    init {
        view.initView()
    }

    override fun incrementValue() {
        model.incrementCounter()
        view.updateViewData()
    }

    override fun getCounter() = model.getCounter().toString()
}