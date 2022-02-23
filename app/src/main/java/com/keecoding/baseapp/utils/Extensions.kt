package com.keecoding.baseapp.utils

import android.content.Context
import android.net.ConnectivityManager
import android.net.Network
import android.net.NetworkCapabilities
import android.net.NetworkRequest
import android.widget.EditText
import android.widget.Toast
import androidx.core.content.ContextCompat

fun EditText.grabText(): String {
    return this.text.toString()
}