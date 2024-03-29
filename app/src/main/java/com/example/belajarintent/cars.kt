package com.example.belajarintent

import android.os.Parcel
import android.os.Parcelable

data class  cars(
    val merek: String?,
    val tahun : Int?,
    val plat : String?
): Parcelable{
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readInt(),
        parcel.readString()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(merek)
        if (tahun != null) {
            parcel.writeInt(tahun)
        }
        parcel.writeString(plat)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<cars> {
        override fun createFromParcel(parcel: Parcel): cars {
            return cars(parcel)
        }

        override fun newArray(size: Int): Array<cars?> {
            return arrayOfNulls(size)
        }
    }

}