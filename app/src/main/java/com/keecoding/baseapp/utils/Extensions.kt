package com.keecoding.baseapp.utils

import android.content.Context
import android.widget.EditText
import android.widget.Toast

fun EditText.grabText(): String {
    return this.text.toString()
}
