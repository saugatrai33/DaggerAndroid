package com.saugatrai.daggerandroid.di

import android.content.Context
import com.saugatrai.daggerandroid.main.MainActivity
import com.saugatrai.daggerandroid.registration.RegistrationComponent
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [StorageModule::class, AppSubcomponents::class])
interface AppComponent {
    @Component.Factory
    interface Factory {
        fun create(@BindsInstance context: Context): AppComponent
    }

    fun registrationComponent(): RegistrationComponent.Factory
    fun inject(mainActivity: MainActivity)

}