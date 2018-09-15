package com.ivianuu.androidktx

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModel
import androidx.lifecycle.viewModels

private class MyViewModel : ViewModel()

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel<MyViewModel>()

        Log.d("ViewModels", viewModelStore.viewModels.toString())
    }
}
