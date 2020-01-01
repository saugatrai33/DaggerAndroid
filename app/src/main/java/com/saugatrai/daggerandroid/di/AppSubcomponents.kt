package com.saugatrai.daggerandroid.di

import com.saugatrai.daggerandroid.registration.RegistrationComponent
import dagger.Module

@ActivityScope
@Module(subcomponents = [RegistrationComponent::class])
class AppSubcomponents {

}