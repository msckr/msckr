package com.nise.exretrofit.Data.repository

import com.nise.exretrofit.Data.api.ApiHelper

class MainRepository(private val apiHelper: ApiHelper) {
    suspend fun getUsers() = apiHelper.getUsers()
}