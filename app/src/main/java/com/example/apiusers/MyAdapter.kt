package com.example.apiusers

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.apiusers.databinding.EachItemBinding
import com.squareup.picasso.Picasso

class MyAdapter(val userArreyList: List<User>) : RecyclerView.Adapter<MyAdapter.MyViewHolder>() {
    class MyViewHolder(var binding: EachItemBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(EachItemBinding.inflate(LayoutInflater.from(parent.context)))
    }

    override fun getItemCount(): Int {
        return userArreyList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        Picasso.get().load(userArreyList[position].image).into(holder.binding.image);
        holder.binding.name.text = userArreyList[position].firstName
    }

}