package com.asboldyreva.android.comparecrapp.pojo

import com.google.gson.annotations.SerializedName

data class CoinInfoListOfData(

    @SerializedName("Data")
    var data: List<Data>? = null

)