package com.kryanbeaneorg.placemark_android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.github.ajalt.timberkt.Timber
import timber.log.Timber.i

class PlacemarkActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_placemark)

        Timber.plant(Timber.DebugTree())

        i("Placemark Activity started..")
    }
}