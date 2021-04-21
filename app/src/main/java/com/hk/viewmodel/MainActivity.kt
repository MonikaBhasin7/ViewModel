package com.hk.viewmodel

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import com.hk.viewmodel.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    val TAG = "MainActivity"

    lateinit var viewModel: MainViewModel
    lateinit var dataBinding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //ViewModelProvider(this).get(MainViewModel::class.java)
        //val progressObserver = ProgressObserver(this, ProgressCustomView())
        //lifecycle.addObserver(progressObserver)



        //LiveData
//        FireStoreLiveDate().observe(this) { value ->
//            Log.d(TAG, "value -- $value")
//        }

        //startActivity(Intent(this, SecondActivity::class.java))



        dataBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)
    }

    override fun onResume() {
        super.onResume()

        viewModel.getAddress().observe(this, object : Observer<Address> {
            @SuppressLint("SetTextI18n")
            override fun onChanged(t: Address?) {
                if (t != null) {
                    dataBinding.txtAddress.text = "${t?.hNo} - ${t.streetAddress}"
                }
            }

        })

    }
}