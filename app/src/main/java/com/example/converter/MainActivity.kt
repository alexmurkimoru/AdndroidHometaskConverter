package com.example.converter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.RadioGroup
import android.widget.Spinner
import com.example.converter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var typeOfValues: Int = -1
    private val listOfLengthFunctions = mapOfLengthFunctions
    private val listOfWeightFunctions = mapOfWeightFun
    private val listOfCurrencyFunctions = mapOfCurrencyFun
    private var inputSpinnerValue = ""
    private var outputSpinnerValue = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        with(binding) {
            myRadioGroup.setOnCheckedChangeListener(::onRadioGroupCheckedChange)
            myRadioGroup.check(lengthButton.id)
            convertingButton.setOnClickListener(::onClickListener)

            inputSpinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
                override fun onItemSelected(
                    parent: AdapterView<*>?,
                    view: View?,
                    position: Int,
                    id: Long
                ) {
                    inputSpinnerValue = parent?.getItemAtPosition(position).toString()
                }

                override fun onNothingSelected(parent: AdapterView<*>?) {}
            }
            outputSpinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
                override fun onItemSelected(
                    parent: AdapterView<*>?,
                    view: View?,
                    position: Int,
                    id: Long
                ) {
                    outputSpinnerValue = parent?.getItemAtPosition(position).toString()
                }

                override fun onNothingSelected(parent: AdapterView<*>?) {}
            }

        }
    }

    private fun onClickListener(button: View) = with(binding) {
        val finalString : String = inputSpinnerValue + outputSpinnerValue
        val inputValue: Double = numberInput.text.toString().toDouble()
        var result = 0.0
        val convertingFun: ((Double) -> Double)? = when (typeOfValues) {
            R.array.lenNames -> {
                listOfLengthFunctions.get(finalString)?.function
            }

            R.array.weightNames -> {
                listOfWeightFunctions.get(finalString)?.function
            }

            R.array.currencyNames -> {
                listOfCurrencyFunctions.get(finalString)?.function
            }
            else -> listOfLengthFunctions.get(finalString)?.function
        }
        if (convertingFun != null) {
            result = convertingFun(inputValue)
        }
        output.text = result.toString()
    }

    private fun onRadioGroupCheckedChange(radioGroup: RadioGroup, radioId: Int) = with(binding) {
        when (radioId) {
            lengthButton.id -> {
                spinnerConnection(spinner = inputSpinner, textArrayResId = R.array.lenNames)
                spinnerConnection(spinner = outputSpinner, textArrayResId = R.array.lenNames)
                typeOfValues = R.array.lenNames
            }

            weightButton.id -> {
                spinnerConnection(spinner = inputSpinner, textArrayResId = R.array.weightNames)
                spinnerConnection(spinner = outputSpinner, textArrayResId = R.array.weightNames)
                typeOfValues = R.array.weightNames
            }

            currencyButton.id -> {
                spinnerConnection(spinner = inputSpinner, textArrayResId = R.array.currencyNames)
                spinnerConnection(spinner = outputSpinner, textArrayResId = R.array.currencyNames)
                typeOfValues = R.array.currencyNames
            }
        }
    }

    private fun spinnerConnection(
        spinner: Spinner,
        textArrayResId: Int
    ) {//функция для подключения строкового массива в спиннер
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