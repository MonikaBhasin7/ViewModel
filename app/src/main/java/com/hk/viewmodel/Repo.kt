package com.hk.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import kotlinx.coroutines.*
import kotlin.coroutines.CoroutineContext

object Repo {

    fun getAddress() : MutableLiveData<Address> {
       Thread.sleep(2000)
        val liveData: MutableLiveData<Address> = MutableLiveData()
        liveData.value = Address(System.currentTimeMillis().toInt(),"Home")
        return liveData
    }
}