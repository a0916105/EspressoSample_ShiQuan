package tw.idv.jew.espressosample.ui.login

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isEnabled
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.rules.ActivityScenarioRule
import org.hamcrest.Matchers.not
import org.junit.Assert.*
import org.junit.Rule
import org.junit.Test
import tw.idv.jew.espressosample.R

class LoginActivityTest {
    @get:Rule
    val activityRule = ActivityScenarioRule(LoginActivity::class.java)

    @Test
    fun testDisableSignIn() {
        /*Espresso.onView(ViewMatchers.withId(R.id.login))
            .check(ViewActions.matches(not(ViewMatchers.isEnabled())))*/
        onView(withId(R.id.login))
            .check(matches(not(isEnabled())))
    }

    @Test
    fun testEnableSignIn() {
        onView(withId(R.id.username))
            .perform(typeText("John"))
        onView(withId(R.id.password))
            .perform(typeText("mypassword"))
        onView(withId(R.id.login))
            .check(matches(isEnabled()))
    }
}