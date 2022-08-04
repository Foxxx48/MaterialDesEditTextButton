package com.fox.materialdesedittextbutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ToggleButton
import com.fox.materialdesedittextbutton.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var _binding: ActivityMainBinding? = null
    private val binding get() = _binding!!
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btn1.setOnClickListener {
            var textInput =  binding.editTex1.text
            binding.textView2.setText(textInput)
        }

        binding.btn2.setOnClickListener {
            var textInput = binding.editTex2.text
            binding.textView3.setText(textInput)
        }

        binding.toggleButton.addOnButtonCheckedListener { group, checkedId, isChecked ->

            when(checkedId){
                binding.button1.id-> if(isChecked) {binding.textView3.setText("Fragment1")
                } else {  binding.textView3.setText("")
                }

                binding.button2.id-> if(isChecked) {binding.textView3.setText("Fragment2")
                } else {  binding.textView3.setText("")
                }

                binding.button3.id-> if(isChecked) {binding.textView3.setText("Fragment3")
                } else {  binding.textView3.setText("")
                }
            }
        }
    }
}