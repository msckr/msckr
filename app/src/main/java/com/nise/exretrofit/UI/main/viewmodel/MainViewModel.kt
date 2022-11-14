package com.nise.exretrofit.UI.main.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.nise.exretrofit.Data.repository.MainRepository
import com.nise.exretrofit.utils.Resource
import kotlinx.coroutines.Dispatchers


class MainViewModel(private val mainRepository: MainRepository) : ViewModel() {

    fun getUsers() = liveData(Dispatchers.IO) {
        emit(Resource.loading(data = null))
        try {
            emit(Resource.success(data = mainRepository.getUsers()))
        } catch (exception: Exception) {
            emit(Resource.error(data = null, message = exception.message ?: "Error Occurred!"))
        }
    }
}
