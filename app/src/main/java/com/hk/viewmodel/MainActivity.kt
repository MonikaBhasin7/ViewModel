package com.hk.viewmodel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ViewModelProvider(this).get(MainViewModel::class.java)
        val progressObserver = ProgressObserver(this, ProgressCustomView())
        lifecycle.addObserver(progressObserver)
    }
}