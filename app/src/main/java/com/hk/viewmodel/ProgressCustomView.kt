package com.hk.viewmodel

import android.util.Log

class ProgressCustomView : GenericCustomViews {

    var TAG = ProgressCustomView::class.java.toString()
    override fun onStart() {
        Log.d(TAG, "onStart ProgressCustomView")
    }

    override fun onHide() {
        Log.d(TAG, "onHide ProgressCustomView")
    }
}