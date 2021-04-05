package com.asboldyreva.android.comparecrapp.pojo

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

@Entity(tableName = "full_price_list")
data class CoinPriceInfo(
    @SerializedName("TYPE")
    var type: String?,
    @SerializedName("MARKET")
    var market: String?,

    @PrimaryKey
    @SerializedName("FROMSYMBOL")
    var fromSymbol: String,

    @SerializedName("TOSYMBOL")
    var tpSymbol: String?,
    @SerializedName("FLAGS")
    var flags: String?,
    @SerializedName("PRICE")
    var price: Double?,
    @SerializedName("LASTUPDATE")
    var lastUpdate: Int?,
    @SerializedName("LASTVOLUME")
    var lastVolume: Double?,
    @SerializedName("LASTVOLUMETO")
    var lastVolumeTo: Double?,
    @SerializedName("LASTTRADEID")
    var lastTradeId: String,
    @SerializedName("VOLUMEDAY")
    var volumeDay: Double,
    @SerializedName("VOLUMEDAYTO")
    var volumeDayTo: Double,
    @SerializedName("VOLUME24HOUR")
    var volume24Hour: Double,
    @SerializedName("VOLUME24HOURTO")
    var volume24HourTo: Double?,
    @SerializedName("OPENDAY")
    var openDay: Double?,
    @SerializedName("HIGHDAY")
    var highDay: Double?,
    @SerializedName("LOWDAY")
    var lowDay: Double?,
    @SerializedName("OPEN24HOUR")
    var open24Hour: Double?,
    @SerializedName("HIGH24HOUR")
    var high24Hour: Double?,
    @SerializedName("LOW24HOUR")
    var low24Hour: Double?,
    @SerializedName("LASTMARKET")
    var lastMarket: String?,
    @SerializedName("VOLUMEHOUR")
    var volumeHour: Double?,
    @SerializedName("VOLUMEHOURTO")
    var volumeHourTo: Double?,
    @SerializedName("OPENHOUR")
    var openHour: Double?,
    @SerializedName("HIGHHOUR")
    var highHour: Double?,
    @SerializedName("LOWHOUR")
    var lowHour: Double?,
    @SerializedName("TOPTIERVOLUME24HOUR")
    var topTierVolume24Hour: Double?,
    @SerializedName("TOPTIERVOLUME24HOURTO")
    var topTierVolume24HourTo: Double?,
    @SerializedName("CHANGE24HOUR")
    var change24Hour: Double?,
    @SerializedName("CHANGEPCT24HOUR")
    var changePct24Hour: Double?,
    @SerializedName("CHANGEDAY")
    var changeDay: Double?,
    @SerializedName("CHANGEPCTDAY")
    var changePctDay: Double?,
    @SerializedName("CHANGEHOUR")
    var changeHour: Double?,
    @SerializedName("CHANGEPCTHOUR")
    var changePctHour: Double?,
    @SerializedName("CONVERSIONTYPE")
    var conversionType: String?,
    @SerializedName("CONVERSIONSYMBOL")
    var conversionSymbol: String?,
    @SerializedName("SUPPLY")
    var supply: Int?,
    @SerializedName("MKTCAP")
    var mktCap: Double?,
    @SerializedName("MKTCAPPENALTY")
    var mktCapPenalty: Int?,
    @SerializedName("TOTALVOLUME24H")
    var totalVolume24Hour: Double?,
    @SerializedName("TOTALVOLUME24HTO")
    var totalVolume24HourTo: Double?,
    @SerializedName("TOTALTOPTIERVOLUME24H")
    var totalTopTierVolume24H: Double?,
    @SerializedName("TOTALTOPTIERVOLUME24HTO")
    var totalTopTierVolume24HTo: Double?,
    @SerializedName("IMAGEURL")
    var imageUrl: String?
)