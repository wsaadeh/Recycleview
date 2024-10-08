package com.saadeh.recycleview

import androidx.annotation.DrawableRes

data class Contact(
    val name: String,
    val phone: String,
    @DrawableRes val icon: Int
)
