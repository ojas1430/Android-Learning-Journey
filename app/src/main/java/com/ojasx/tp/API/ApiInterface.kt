package com.ojasx.tp.API

import retrofit2.Call
import retrofit2.http.GET

interface   ApiInterface{

    @GET("albums")
    fun getProductData(): Call<List<MyDataItem>>


}