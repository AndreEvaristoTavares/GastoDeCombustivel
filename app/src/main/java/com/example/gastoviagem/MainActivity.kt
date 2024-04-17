package com.example.gastoviagem

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.gastoviagem.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.calculate.setOnClickListener(this)
    }

    override fun onClick(view: View?) {
        calculate()
    }

    fun calculate() {
        val distance = binding.distance.text.toString().toFloat()
        val preco_combustivel = binding.price.text.toString().toFloat()
        val consumo = binding.autonomy.text.toString().toFloat()
        val totalValue = distance * preco_combustivel / consumo
        binding.totalCalculate.text = "R$: ${"%.2f".format(totalValue)}"
    }


}