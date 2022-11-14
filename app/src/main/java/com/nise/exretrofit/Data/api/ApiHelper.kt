package com.nise.exretrofit.Data.api

class ApiHelper(private val apiService:ApiService){

    suspend fun getUsers() = apiService.getUsers()
}