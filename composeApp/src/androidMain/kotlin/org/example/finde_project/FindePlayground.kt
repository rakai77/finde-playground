package org.example.finde_project

import android.app.Application
import org.example.finde_project.di.initKoinModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger

class FindePlayground : Application() {

    override fun onCreate() {
        super.onCreate()
        initKoinModule {
            androidLogger()
            androidContext(this@FindePlayground)
        }
    }
}