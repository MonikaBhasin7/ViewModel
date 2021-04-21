package com.hk.viewmodel

import androidx.lifecycle.LiveData

class FireStoreLiveDate: LiveData<String>(), FireStoreInterface {

    private var fireStoreManager: FireStoreManager? = null
    init {
        fireStoreManager = FireStoreManager(this)
    }

    val simpleString = "str"
    override fun setValueInLiveData(string: String) {
        value = string
    }

    override fun onActive() {
        fireStoreManager?.assignValue()
    }

    override fun onInactive() {
        fireStoreManager?.deAssignValue()
    }


}