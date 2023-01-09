package com.example.assignment.presentation.di

import com.example.assignment.presentation.MovieActivity
import dagger.Subcomponent
@MovieScope
@Subcomponent(modules = [MovieModule::class])
interface MovieSubComponent {
    fun inject(movieActivity: MovieActivity )


    @Subcomponent.Factory
    interface Factory{
        fun create():MovieSubComponent
    }
}