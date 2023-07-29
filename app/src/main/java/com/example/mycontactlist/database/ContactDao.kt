package com.example.mycontactlist.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import com.example.mycontactlist.model.ContactList

@Dao
interface ContactDao {
    @Insert(onConflict=OnConflictStrategy.REPLACE)
   fun insertContact(contact:ContactList)

}