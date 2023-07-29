package com.example.mycontactlist.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.mycontactlist.model.ContactList

@Database(entities = arrayOf(ContactList::class), version = 1)
abstract class ContactDb:RoomDatabase() {
    abstract fun getContactDao():ContactDao
    companion object{
        private var database: ContactDb? = null

        fun getDatabase(context: Context):ContactDb{
            if(database==null){
                database= Room
                    .databaseBuilder(context,ContactDb::class.java,"ContactsDb")
                    .build()
            }
            return database as ContactDb
        }
    }
}