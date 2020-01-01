package com.saugatrai.daggerandroid.settings

import com.saugatrai.daggerandroid.user.UserDataRepository
import com.saugatrai.daggerandroid.user.UserManager

/**
 * SettingsViewModel is the ViewModel that [SettingsActivity] uses to handle complex logic.
 */
class SettingsViewModel(
    private val userDataRepository: UserDataRepository,
    private val userManager: UserManager
) {

    fun refreshNotifications() {
        userDataRepository.refreshUnreadNotifications()
    }

    fun logout() {
        userManager.logout()
    }
}
