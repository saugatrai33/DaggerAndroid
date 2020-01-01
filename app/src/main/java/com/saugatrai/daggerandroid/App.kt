package com.saugatrai.daggerandroid

import android.app.Application
import com.saugatrai.daggerandroid.di.AppComponent
import com.saugatrai.daggerandroid.di.DaggerAppComponent
import com.saugatrai.daggerandroid.storage.SharedPreferencesStorage
import com.saugatrai.daggerandroid.user.UserManager

open class App : Application() {

    val appComponent: AppComponent by lazy {
        DaggerAppComponent.factory().create(applicationContext)
    }

    open val userManager by lazy {
        UserManager(SharedPreferencesStorage(this))
    }
}