package com.saugatrai.daggerandroid

import android.app.Application
import com.saugatrai.daggerandroid.storage.SharedPreferencesStorage
import com.saugatrai.daggerandroid.user.UserManager

open class App : Application() {

    open val userManager by lazy {
        UserManager(SharedPreferencesStorage(this))
    }
}