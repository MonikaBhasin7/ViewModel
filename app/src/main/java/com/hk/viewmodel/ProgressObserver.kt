package com.hk.viewmodel

import android.content.Context
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent

class ProgressObserver(private val context: Context, private val customView: GenericCustomViews) : LifecycleObserver{

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    fun start() {
        customView.onStart(context)
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    fun hide() {
        customView.onHide(context)
    }
}