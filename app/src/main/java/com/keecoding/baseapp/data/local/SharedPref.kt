package com.keecoding.baseapp.data.local

import android.app.Application
import android.content.Context
import javax.inject.Inject

class SharedPref(
    context: Application
) {
    companion object {
        const val TAG = "App_Shared_Preference"
    }

    private val sharedPreferences = context.getSharedPreferences(TAG, Context.MODE_PRIVATE)

}