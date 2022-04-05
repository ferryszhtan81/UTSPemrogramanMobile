/*
* Copyright (C) 2021 The Android Open Source Project.
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
*     http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/
package com.example.kittyapp.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.kittyapp.R
import com.example.kittyapp.const.Layout
import com.example.kittyapp.data.DataSource

class KittyCardAdapter(
    private val context: Context?,
    private val layout: Int
): RecyclerView.Adapter<KittyCardAdapter.KittyCardViewHolder>() {

    private val kittyList = DataSource.kitties
    class KittyCardViewHolder(view: View?): RecyclerView.ViewHolder(view!!) {
        val kittyImageView : ImageView? = view?.findViewById(R.id.kitty_img)
        val kittyNameText : TextView? = view?.findViewById(R.id.kitty_name)
        val kittyAgeText : TextView? = view?.findViewById(R.id.kitty_age)
        val kittyHobbyText : TextView? = view?.findViewById(R.id.kitty_hobby)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): KittyCardViewHolder {
        val adapterLayout = when (layout){
            Layout.GRID -> LayoutInflater.from(parent.context).inflate(R.layout.grid_list_item,parent,false)
            else -> LayoutInflater.from(parent.context).inflate(R.layout.vertical_horizontal_list_item,parent,false)
        }
        return KittyCardViewHolder(adapterLayout)
    }

    override fun getItemCount(): Int {
        return kittyList.size
    }

    override fun onBindViewHolder(holder: KittyCardViewHolder, position: Int) {
        val kittyData = kittyList[position]
        holder.kittyImageView?.setImageResource(kittyData.imageResourceId)
        holder.kittyNameText?.text = kittyData.name
        val resources = context?.resources
        holder.kittyAgeText?.text = resources?.getString(R.string.kitty_age,kittyData.age)
        holder.kittyHobbyText?.text = resources?.getString(R.string.kitty_hobbies,kittyData.hobbies)
    }
}
