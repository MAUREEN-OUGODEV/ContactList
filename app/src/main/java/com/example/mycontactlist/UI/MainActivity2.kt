package com.example.mycontactlist.UI

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import com.example.mycontactlist.R

import com.example.mycontactlist.ViewModel.ContactViewModel
import com.example.mycontactlist.databinding.ActivityMain2Binding
import com.example.mycontactlist.model.ContactList

class MainActivity2 : AppCompatActivity() {
    lateinit var binding:ActivityMain2Binding
    val contactViewModel:ContactViewModel by viewModels()
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
            error = true
            binding.tilContactName.error = "First name is required"


        }
        if (email.isBlank()){
            error=true
            binding.tilEmail.error="First name is required"


        }
        if (phoneNumber.isBlank()){
            error=true
            binding.tilPhoneNumber.error="First name is required"


        }

        if(!error){
           val newContact=ContactList(0,name,phoneNumber,email,"")
            contactViewModel.saveContact(newContact)

            Toast.makeText(this,getString(R.string.contact_saved), Toast.LENGTH_SHORT).show()
        }

    }
}