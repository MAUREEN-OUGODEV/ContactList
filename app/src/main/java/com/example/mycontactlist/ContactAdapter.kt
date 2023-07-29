package com.example.mycontactlist

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.mycontactlist.databinding.ContactListItemBinding
import com.example.mycontactlist.model.ContactList
import com.squareup.picasso.Picasso
import jp.wasabeef.picasso.transformations.CropCircleTransformation


class ContactAdapter(var contactList:List<ContactList>):RecyclerView.Adapter<ContactViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        val binding=ContactListItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ContactViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return contactList.size
    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        var currentContact=contactList[position]
        var binding=holder.binding
        binding.tvName.text = currentContact.name
        binding.tvEmail.text = currentContact.email
        binding.tvNumber.text = currentContact.number
        Picasso
            .get()
            .load(currentContact.avatar)
//            .resize(80,80)
//            .centerCrop()
            .transform(CropCircleTransformation())

            .into(binding.ivImage)
//        binding.tvName2.text = currentContact.name
//        binding.tvEmail2.text = currentContact.email
//        binding.tvNumber2.text = currentContact.number
//        binding.tvName3.text = currentContact.name
//        binding.tvEmail3.text = currentContact.email
//        binding.tvNumber3.text = currentContact.number
//        binding.tvName4.text = currentContact.name
//        binding.tvEmail4.text = currentContact.email
//        binding.tvNumber4.text = currentContact.number








    }

}

class ContactViewHolder(var binding:ContactListItemBinding):RecyclerView.ViewHolder(binding.root){

}