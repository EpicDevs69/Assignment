package com.example.assignment.presentation

import android.app.Application
import com.example.assignment.BuildConfig
import com.example.assignment.presentation.di.*

class App:Application(),Injector {
    private lateinit var appComponent: AppComponent
    override fun onCreate() {
        super.onCreate()
        appComponent= DaggerAppComponent.builder()
            .appModule(AppModule(applicationContext))
            .netModule(NetModule(BuildConfig.BASE_URL))
            .remoteDataModulde(RemoteDataModulde(BuildConfig.API_KEY))
            .build()
    }

    override fun createMovieSubComponent(): MovieSubComponent {
         return appComponent.moviesSubComponent().create()
    }
}