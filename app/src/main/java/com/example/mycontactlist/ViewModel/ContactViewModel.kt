package com.example.mycontactlist.ViewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.mycontactlist.Repository.ContactsRepository
import com.example.mycontactlist.model.ContactList
import kotlinx.coroutines.launch

class ContactViewModel :ViewModel(){
    val contactsRepo=ContactsRepository()

    fun saveContact(contact:ContactList){
       viewModelScope.launch{
           contactsRepo.saveContact(contact)
       }
    }
}