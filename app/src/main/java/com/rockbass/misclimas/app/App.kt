package com.rockbass.misclimas.app

import android.app.Application
import com.jakewharton.threetenabp.AndroidThreeTen
import com.mapbox.mapboxsdk.Mapbox
import com.rockbass.misclimas.MAPBOX_TOKEN
import com.rockbass.misclimas.net.configurarRetrofit

class App : Application() {
    override fun onCreate() {
        super.onCreate()

        Mapbox.getInstance(this, MAPBOX_TOKEN)
        AndroidThreeTen.init(this)
        configurarRetrofit(this)
    }
}