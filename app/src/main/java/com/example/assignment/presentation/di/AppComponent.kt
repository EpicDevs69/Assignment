package com.example.assignment.presentation.di

import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class,NetModule::class,DataBaseModule::class,UseCaseModule::class,
    RepositoryModule::class,RemoteDataModulde::class,LocalDataModule::class,CacheDataModule::class])
interface AppComponent {
    fun moviesSubComponent():MovieSubComponent.Factory

}