package com.saugatrai.daggerandroid.di

import com.saugatrai.daggerandroid.storage.SharedPreferencesStorage
import com.saugatrai.daggerandroid.storage.Storage
import dagger.Binds
import dagger.Module

@Module
abstract class StorageModule {
    @Binds
    abstract fun provideStorage(sharedPreferencesStorage: SharedPreferencesStorage): Storage
}