package com.example.mvp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.mvp.databinding.ActivityMainBinding
class MainActivity : AppCompatActivity(), MainContract.View {
    private lateinit var binding: ActivityMainBinding
    private lateinit var presenter: MainContract.Presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        presenter = MainPresenter(this)

        binding.incrementbtn.setOnClickListener {
            presenter.onIncreaseButtonClicked()
        }

        binding.decrementbtn.setOnClickListener {
            presenter.onDecreaseButtonClicked()
        }
    }

    override fun setNumberText(number: Int) {
        binding.resultTv.text = number.toString()
    }

    override fun setTextColor(color: Int) {
        binding.resultTv.setTextColor(color)
    }

    override fun showCongratulationsToast() {
        Toast.makeText(this, "Поздравляем!", Toast.LENGTH_SHORT).show()
    }

}