package com.example.mycontactlist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.mycontactlist.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
    override fun onResume() {
        super.onResume()
        displayContacts()
    }

    fun displayContacts(){
        val contact1=ContactList("Maureen","712345678","warukira@gmail.com")
        val contact2=ContactList("Akinyi","712345678","maureen0ugo@gmail.com")
        val contact3=ContactList("Ougo","712345678","ougoakinyi@gmail.com")
        val contact4=ContactList("Maureen","712345678","waruriakinyi@gmail.com")


        val contactList= listOf(contact1,contact2,contact3,contact4)
        val tvcontact=ContactRvAdapter(contactList)
        binding.rvContacts.layoutManager= LinearLayoutManager(this)
        binding.rvContacts.adapter=tvcontact

    }
}