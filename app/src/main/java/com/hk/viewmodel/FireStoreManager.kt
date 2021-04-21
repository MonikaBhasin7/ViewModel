package com.hk.viewmodel

class FireStoreManager(val simpleObject: FireStoreInterface) {

    fun assignValue() {
        simpleObject.setValueInLiveData("10")
    }
    fun deAssignValue() {
        simpleObject.setValueInLiveData("0")
    }
}