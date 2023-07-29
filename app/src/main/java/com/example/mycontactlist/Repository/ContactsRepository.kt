package com.example.mycontactlist.Repository

import android.provider.ContactsContract.Contacts
import com.example.mycontactlist.MyContactsApp
import com.example.mycontactlist.database.ContactDb
import com.example.mycontactlist.model.ContactList
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class ContactsRepository {
    val database=ContactDb.getDatabase(MyContactsApp.appContext)

    suspend fun saveContact(contact:ContactList){
        withContext(Dispatchers.IO){
            database.getContactDao().insertContact(contact)
        }
    }
}