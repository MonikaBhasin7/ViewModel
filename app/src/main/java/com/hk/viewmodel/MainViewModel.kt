package com.hk.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {

    private val _addressLiveData: MutableLiveData<Address> = MutableLiveData()
    val addressLiveData: LiveData<Address>
        get()  = _addressLiveData


    fun getAddress(): LiveData<Address> {
        return Repo.getAddress()
    }
}