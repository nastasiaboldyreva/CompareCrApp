package com.asboldyreva.android.comparecrapp.pojo

import com.google.gson.annotations.SerializedName

data class CoinInfo (
    @SerializedName("Id")
    val id: String,

    @SerializedName( "Name")
    val name: String,

    @SerializedName("FullName")
    val fullName: String,

    @SerializedName("ImageUrl")
    val imageURL: String,
)