package com.gitturami.bike

import android.app.Application
import android.content.Context
import android.content.Intent
import android.content.Intent.FLAG_ACTIVITY_NEW_TASK
import com.gitturami.bike.view.intro.IntroActivity

class BikeApplication: Application() {
    companion object {
        lateinit var instance: BikeApplication
            private set
        fun applicationContext() : Context {
            return instance!!.applicationContext
        }


    }

    override fun onCreate() {
        super.onCreate()
        instance = this
        var intent = Intent(this, IntroActivity::class.java)
        startActivity(intent.addFlags(FLAG_ACTIVITY_NEW_TASK))
    }



}