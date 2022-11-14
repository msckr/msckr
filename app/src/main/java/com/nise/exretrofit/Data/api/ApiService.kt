package com.nise.exretrofit.Data.api

import com.nise.exretrofit.Data.model.User
import retrofit2.http.GET

interface ApiService {
    @GET("users")
    suspend fun getUsers(): List<User>
}