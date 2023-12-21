package com.example.lab1

import android.content.Context
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {
    fun ChangeText(context: Context): String {
        return context.getString(R.string.hello_toast)
    }
}