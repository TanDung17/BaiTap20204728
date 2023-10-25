package com.codingformobile.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_main.*
import org.mariuszgromada.math.mxparser.Expression
import java.text.DecimalFormat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_clear.setOnClickListener {
            input.text = ""
            output.text = ""

            val backgr = button_clear.background
            button_clear.setBackgroundColor(resources.getColor(R.color.super_gray))
            // Thay đổi màu nền trở lại
            button_clear.postDelayed({
                button_clear.background = backgr
            }, 1000)
        }

        button_clear_one.setOnClickListener {
            input.text = addToInputText("CE")
            input.text= ""
            val backgr = button_clear.background
            button_clear.setBackgroundColor(resources.getColor(R.color.super_gray))
            // Thay đổi màu nền trở lại
            button_clear.postDelayed({
                button_clear.background = backgr
            }, 1000)
        }
        button_right_most.setOnClickListener {
            input.text = addToInputText("BS")
            val backgr = button_clear.background
            button_clear.setBackgroundColor(resources.getColor(R.color.super_gray))
            // Thay đổi màu nền trở lại
            button_clear.postDelayed({
                button_clear.background = backgr
            }, 1000)
            if(input.text.length == 1) {
                input.text = "0"
            }
            else {
                input.text = input.text.subSequence(0, input.text.length - 2)
            }
        }
        button_0.setOnClickListener {
            val backgr = button_clear.background
            button_clear.setBackgroundColor(resources.getColor(R.color.super_gray))
            // Thay đổi màu nền trở lại
            button_clear.postDelayed({
                button_clear.background = backgr
            }, 1000)
            input.text = addToInputText("0")
        }
        button_1.setOnClickListener {
            val backgr = button_clear.background
            button_clear.setBackgroundColor(resources.getColor(R.color.super_gray))
            // Thay đổi màu nền trở lại
            button_clear.postDelayed({
                button_clear.background = backgr
            }, 1000)
            input.text = addToInputText("1")
        }
        button_2.setOnClickListener {
            val backgr = button_clear.background
            button_clear.setBackgroundColor(resources.getColor(R.color.super_gray))
            // Thay đổi màu nền trở lại
            button_clear.postDelayed({
                button_clear.background = backgr
            }, 1000)
            input.text = addToInputText("2")
        }
        button_3.setOnClickListener {
            val backgr = button_clear.background
            button_clear.setBackgroundColor(resources.getColor(R.color.super_gray))
            // Thay đổi màu nền trở lại
            button_clear.postDelayed({
                button_clear.background = backgr
            }, 1000)
            input.text = addToInputText("3")
        }
        button_4.setOnClickListener {
            val backgr = button_clear.background
            button_clear.setBackgroundColor(resources.getColor(R.color.super_gray))
            // Thay đổi màu nền trở lại
            button_clear.postDelayed({
                button_clear.background = backgr
            }, 1000)
            input.text = addToInputText("4")
        }
        button_5.setOnClickListener {
            val backgr = button_clear.background
            button_clear.setBackgroundColor(resources.getColor(R.color.super_gray))
            // Thay đổi màu nền trở lại
            button_clear.postDelayed({
                button_clear.background = backgr
            }, 1000)
            input.text = addToInputText("5")
        }
        button_6.setOnClickListener {
            val backgr = button_clear.background
            button_clear.setBackgroundColor(resources.getColor(R.color.super_gray))
            // Thay đổi màu nền trở lại
            button_clear.postDelayed({
                button_clear.background = backgr
            }, 1000)
            input.text = addToInputText("6")
        }
        button_7.setOnClickListener {
            val backgr = button_clear.background
            button_clear.setBackgroundColor(resources.getColor(R.color.super_gray))
            // Thay đổi màu nền trở lại
            button_clear.postDelayed({
                button_clear.background = backgr
            }, 1000)
            input.text = addToInputText("7")
        }
        button_8.setOnClickListener {
            val backgr = button_clear.background
            button_clear.setBackgroundColor(resources.getColor(R.color.super_gray))
            // Thay đổi màu nền trở lại
            button_clear.postDelayed({
                button_clear.background = backgr
            }, 1000)
            input.text = addToInputText("8")
        }
        button_9.setOnClickListener {
            val backgr = button_clear.background
            button_clear.setBackgroundColor(resources.getColor(R.color.super_gray))
            // Thay đổi màu nền trở lại
            button_clear.postDelayed({
                button_clear.background = backgr
            }, 1000)
            input.text = addToInputText("9")
        }
        button_dot.setOnClickListener {
            val backgr = button_clear.background
            button_clear.setBackgroundColor(resources.getColor(R.color.super_gray))
            // Thay đổi màu nền trở lại
            button_clear.postDelayed({
                button_clear.background = backgr
            }, 1000)
            input.text = addToInputText(".")
        }
        button_division.setOnClickListener {
            val backgr = button_clear.background
            button_clear.setBackgroundColor(resources.getColor(R.color.super_gray))
            // Thay đổi màu nền trở lại
            button_clear.postDelayed({
                button_clear.background = backgr
            }, 1000)
            input.text = addToInputText("÷") // ALT + 0247
        }
        button_multiply.setOnClickListener {
            val backgr = button_clear.background
            button_clear.setBackgroundColor(resources.getColor(R.color.super_gray))
            // Thay đổi màu nền trở lại
            button_clear.postDelayed({
                button_clear.background = backgr
            }, 1000)
            input.text = addToInputText("×") // ALT + 0215
        }
        button_subtraction.setOnClickListener {
            val backgr = button_clear.background
            button_clear.setBackgroundColor(resources.getColor(R.color.super_gray))
            // Thay đổi màu nền trở lại
            button_clear.postDelayed({
                button_clear.background = backgr
            }, 1000)
            input.text = addToInputText("-")
        }
        button_addition.setOnClickListener {
            val backgr = button_clear.background
            button_clear.setBackgroundColor(resources.getColor(R.color.super_gray))
            // Thay đổi màu nền trở lại
            button_clear.postDelayed({
                button_clear.background = backgr
            }, 1000)
            input.text = addToInputText("+")
        }

        button_equals.setOnClickListener {
            val backgr = button_clear.background
            button_clear.setBackgroundColor(resources.getColor(R.color.super_gray))
            // Thay đổi màu nền trở lại
            button_clear.postDelayed({
                button_clear.background = backgr
            }, 1000)
            showResult()
        }
    }

    private fun addToInputText(buttonValue: String): String {
        return "${input.text}$buttonValue"
    }

    private fun getInputExpression(): String {
        var expression = input.text.replace(Regex("÷"), "/")
        expression = expression.replace(Regex("×"), "*")
        return expression
    }

    private fun showResult() {
        try {
            val expression = getInputExpression()
            val result = Expression(expression).calculate()
            if (result.isNaN()) {
                // Show Error Message
                output.text = "Error"
                output.setTextColor(ContextCompat.getColor(this, R.color.red))
            } else {
                // Show Result
                output.text = DecimalFormat("0.######").format(result).toString()
                output.setTextColor(ContextCompat.getColor(this, R.color.green))
            }
        } catch (e: Exception) {
            // Show Error Message
            output.text = "Error"
            output.setTextColor(ContextCompat.getColor(this, R.color.red))
        }
    }
}