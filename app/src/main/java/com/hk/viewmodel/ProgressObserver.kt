package com.hk.viewmodel

import android.annotation.SuppressLint
import android.content.Context
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent

@SuppressLint("StaticFieldLeak")
object ProgressObserver : LifecycleObserver{

    private lateinit var customView: GenericCustomViews
    private lateinit var context: Context

    fun initializeCustomView(customViews: GenericCustomViews) {
        this.customView = customViews
    }

    fun initializeContext(context: Context) {
        this.context = context
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    fun start() {
        customView.onStart(this.context)
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    fun hide() {
        customView.onHide(this.context)
    }
}