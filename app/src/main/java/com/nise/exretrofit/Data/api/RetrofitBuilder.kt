package com.nise.exretrofit.Data.api

import com.nise.exretrofit.Data.api.RetrofitBuilder.base_Url
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitBuilder {
    private const val base_Url = "https://5e510330f2c0d300147c034c.mockapi.io/"
    private fun getRetrofit() : Retrofit {
        return Retrofit.Builder()
            .baseUrl(base_Url)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
    val apiService:ApiService = getRetrofit().create(ApiService::class.java)


}