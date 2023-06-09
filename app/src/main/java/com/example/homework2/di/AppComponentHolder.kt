package com.example.homework2.di

import android.content.Context

object AppComponentHolder {
    private lateinit var appComponent: AppComponent

    fun build(applicationContext: Context) {
        appComponent = DaggerAppComponent
            .builder()
            .appContext(applicationContext)
            .build()
    }

    fun get(): AppComponent {
        return appComponent
    }
}
