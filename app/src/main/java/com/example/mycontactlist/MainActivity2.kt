package com.example.mycontactlist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.mycontactlist.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    lateinit var binding:ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

    }

    override fun onResume() {
        super.onResume()
        binding.tvAdd.setOnClickListener{
            validateSignup()
        }

    }

    fun validateSignup(){


        val name=binding.etContactName.text.toString()
        val email=binding.etEmail.text.toString()
        val phoneNumber=binding.etPhoneNumber.text.toString()
        var error=false

        if (name.isBlank()) {
            binding.tilContactName.error = "First name is required"
            error = true

        }
        if (email.isBlank()){
            binding.tilEmail.error="First name is required"
            error=true

        }
        if (phoneNumber.isBlank()){
            binding.tilPhoneNumber.error="First name is required"
            error=true

        }

        if(!error){
            Toast.makeText(this,"Congradulations Joy on your sign up", Toast.LENGTH_SHORT)
                .show()
        }

    }
}