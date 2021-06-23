package tw.idv.jew.espressosample.ui.login

import tw.idv.jew.espressosample.ui.login.LoggedInUserView

/**
 * Authentication result : success (user details) or error message.
 */
data class LoginResult(
        val success: LoggedInUserView? = null,
        val error: Int? = null
)