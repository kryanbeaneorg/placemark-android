package com.kryanbeaneorg.placemark_android.main

import android.app.Application
import com.kryanbeaneorg.placemark_android.models.PlacemarkModel
import timber.log.Timber
import timber.log.Timber.i

class MainApp : Application() {

    val placemarks = ArrayList<PlacemarkModel>()

    override fun onCreate() {
        super.onCreate()
        Timber.plant(Timber.DebugTree())
        i("Placemark started")
        // placemarks.add(PlacemarkModel("One", "About one..."))
        // placemarks.add(PlacemarkModel("Two", "About two..."))
        // placemarks.add(PlacemarkModel("Three", "About three..."))
    }
}