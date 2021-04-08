package com.hk.viewmodel

import android.content.Context
import android.util.Log
import android.widget.Toast

class ProgressCustomView : GenericCustomViews {

    var TAG = ProgressCustomView::class.java.toString()
    override fun onStart(context: Context) {
        Log.d(TAG, "onStart ProgressCustomView")
        Toast.makeText(context, "onStart ProgressCustomView", Toast.LENGTH_SHORT).show()
    }

    override fun onHide(context: Context) {
        Log.d(TAG, "onHide ProgressCustomView")
        Toast.makeText(context, "onHide ProgressCustomView", Toast.LENGTH_SHORT).show()
    }
}