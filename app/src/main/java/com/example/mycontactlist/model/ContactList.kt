package com.example.mycontactlist.model

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "Contacts")
data class ContactList(
    @PrimaryKey(autoGenerate = true)
    var contactId:Int,
    var name : String,
    var number: String,
    var email : String,
    var avatar : String
)
