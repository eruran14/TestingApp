package com.eru.testingapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.eru.testingapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initClicker()
    }

    private fun initClicker() {
        with(binding){
            calculateBtn.setOnClickListener {
//                resultTv.text = Math().add(num1Et.text.toString(), num2Et.text.toString())
                resultTv.text = Math().divide(num1Et.text.toString(), num2Et.text.toString())
            }
        }
    }
}