package com.hk.viewmodel

import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent

object ProgressObserver : LifecycleObserver{

    lateinit var customView: GenericCustomViews

    fun initializeCustomView(customViews: GenericCustomViews) {
        this.customView = customViews
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    fun start() {
        customView.onStart()
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    fun hide() {
        customView.onHide()
    }
}