package com.example.calculatenow

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.calculatenow.databinding.ActivityMainBinding
import net.objecthunter.exp4j.ExpressionBuilder

@Suppress("KotlinConstantConditions")
class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.displayResult

        binding.acButton.setOnClickListener {

            binding.displayResult.text = " "
            binding.finalResult.text = " "
        }

        binding.zero.setOnClickListener {
            binding.displayResult.append("0")
        }
        binding.one.setOnClickListener {
            binding.displayResult.append("1")
        }
        binding.two.setOnClickListener {
            binding.displayResult.append("2")
        }
        binding.three.setOnClickListener {
            binding.displayResult.append("3")
        }
        binding.four.setOnClickListener {
            binding.displayResult.append("4")
        }
        binding.five.setOnClickListener {
            binding.displayResult.append("5")
        }
        binding.six.setOnClickListener {
            binding.displayResult.append("6")
        }
        binding.seven.setOnClickListener {
            binding.displayResult.append("7")
        }
        binding.eight.setOnClickListener {
            binding.displayResult.append("8")
        }
        binding.nine.setOnClickListener {
            binding.displayResult.append("9")
        }

        binding.addition.setOnClickListener {
            binding.displayResult.append(" + ")
        }
        binding.subtraction.setOnClickListener {
            binding.displayResult.append(" - ")
        }
        binding.multiplication.setOnClickListener {
            binding.displayResult.append(" * ")
        }
        binding.division.setOnClickListener {
            binding.displayResult.append(" / ")

        }
        binding.decimal.setOnClickListener {
            binding.displayResult.append(".")
        }
        binding.bracketOpen.setOnClickListener {
            binding.displayResult.append("(")
        }
        binding.bracketClosed.setOnClickListener {
            binding.displayResult.append(")")
        }

        binding.equalButton.setOnClickListener {
            val expression = ExpressionBuilder(binding.displayResult.text.toString()).build()
            val result = expression.evaluate()
            val longresult = result.toLong()

            if (result == longresult.toDouble()) {
                binding.finalResult.text = longresult.toString()
            } else {
                binding.finalResult.text.toString()
            }

        }


        binding.cButton.setOnClickListener {
            val length = binding.displayResult.length()
            if (length > 0)
                binding.displayResult.text = binding.displayResult.text.subSequence(0, length - 1)
        }
    }
}