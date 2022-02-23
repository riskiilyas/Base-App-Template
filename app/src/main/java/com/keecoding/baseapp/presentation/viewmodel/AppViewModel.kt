package com.keecoding.baseapp.presentation.viewmodel

import android.app.Application
import android.net.ConnectivityManager
import android.net.Network
import android.net.NetworkCapabilities
import android.net.NetworkRequest
import androidx.core.content.ContextCompat
import androidx.lifecycle.ViewModel

class AppViewModel (
    private val app: Application
): ViewModel() {

    fun checkNetworkAvailable(
        availableCallback: (isAvailable: Boolean) -> Unit,
    ) {
        val networkRequest = NetworkRequest.Builder()
            .addCapability(NetworkCapabilities.NET_CAPABILITY_INTERNET)
            .build()

        val networkCallback = object : ConnectivityManager.NetworkCallback() {
            override fun onAvailable(network: Network) {
                super.onAvailable(network)
                availableCallback(true)
            }

            override fun onLost(network: Network) {
                super.onLost(network)
                availableCallback(false)
            }

            override fun onLosing(network: Network, maxMsToLive: Int) {
                super.onLosing(network, maxMsToLive)
                availableCallback(false)
            }

            override fun onUnavailable() {
                super.onUnavailable()
                availableCallback(false)
            }
        }
        val connectivityManager =
            ContextCompat.getSystemService(app, ConnectivityManager::class.java)
        connectivityManager?.requestNetwork(networkRequest, networkCallback)
    }
}