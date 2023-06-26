package com.example.mvp

import android.graphics.Color


class MainPresenter(private val view: MainContract.View) : MainContract.Presenter {
    private var number = 0

    override fun onIncreaseButtonClicked() {
        number++
        updateView()
    }

    override fun onDecreaseButtonClicked() {
        number--
        updateView()
    }

    private fun updateView() {
        view.setNumberText(number)
        if (number == 10) {
            view.showCongratulationsToast()
        }
        if (number == 15) {
            view.setTextColor(Color.GREEN)
        }
    }
}