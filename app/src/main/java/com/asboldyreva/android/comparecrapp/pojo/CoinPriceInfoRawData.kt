package com.asboldyreva.android.comparecrapp.pojo

import com.google.gson.JsonObject
import com.google.gson.annotations.SerializedName

data class CoinPriceInfoRawData(

    @SerializedName("RAW")
    var coinPriceInfoJsonObject: JsonObject? = null

)