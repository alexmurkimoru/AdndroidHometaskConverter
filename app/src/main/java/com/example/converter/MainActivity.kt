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
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        with(binding) {
            myRadioGroup.setOnCheckedChangeListener(::onRadioGroupCheckedChange)
            myRadioGroup.check(lengthButton.id)
        }
    }

    private fun onRadioGroupCheckedChange(radioGroup : RadioGroup, radioId : Int) = with(binding){
        when(radioId){
            lengthButton.id -> {
                spinnerConnection(spinner = inputSpinner, textArrayResId = R.array.lenNames)
                spinnerConnection(spinner = outputSpinner, textArrayResId = R.array.lenNames)
            }
            weightButton.id -> {
                spinnerConnection(spinner = inputSpinner, textArrayResId = R.array.weightNames)
                spinnerConnection(spinner = outputSpinner, textArrayResId = R.array.weightNames)
            }
            currencyButton.id -> {
                spinnerConnection(spinner = inputSpinner, textArrayResId = R.array.currencyNames)
                spinnerConnection(spinner = outputSpinner, textArrayResId = R.array.currencyNames)
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