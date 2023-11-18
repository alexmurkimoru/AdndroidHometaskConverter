package com.example.converter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.ArrayAdapter
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Spinner
import com.example.converter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var bindingClass: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)
        with(bindingClass) {


            *lengthButton.setOnCheckedChangeListener { buttonView, isChecked ->
                output.text = "Len"
                spinnerConnection(inputSpinner, R.array.lenNames)
            }

            weightButton.setOnCheckedChangeListener { buttonView, isChecked ->
                output.text = "weight"
            }

            bindingClass.currencyButton.setOnCheckedChangeListener { buttonView, isChecked ->
                output.text = "currency"
            }

        }
    }

    private fun spinnerConnection(spinner: Spinner, textArrayResId : Int){//функция для подключения строкового массива в спиннер
        ArrayAdapter.createFromResource(
            this,
            textArrayResId,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            spinner.adapter = adapter
        }

    }
}