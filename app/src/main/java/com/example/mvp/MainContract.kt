package com.example.mvp

interface MainContract {
    interface View {
        fun setNumberText(number: Int)
        fun setTextColor(color: Int)
        fun showCongratulationsToast()
    }

    interface Presenter {
        fun onIncreaseButtonClicked()
        fun onDecreaseButtonClicked()
    }
}