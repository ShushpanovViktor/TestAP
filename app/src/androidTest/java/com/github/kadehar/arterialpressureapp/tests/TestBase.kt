package com.github.kadehar.arterialpressureapp.tests

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.rules.activityScenarioRule
import com.github.kadehar.arterialpressureapp.MainActivity
import com.github.kadehar.arterialpressureapp.R
import org.junit.Rule

open class TestBase {
    @get:Rule
    var activityScenarioRule = activityScenarioRule<MainActivity>()

    fun createNewAPCard() {
        onView(withId(R.id.apDetailsCreateButton))
            .perform(click())
        onView(withId(R.id.apDetailsSaveButton))
            .check(matches(isDisplayed()))

        onView(withId(R.id.apDetailsMorningText))
            .perform(
                typeText("123"),
                typeText("90"),
                pressImeActionButton()
            )

        onView(withId(R.id.apDetailsEveningText))
            .perform(
                typeText("123"),
                typeText("90"),
                pressImeActionButton()
            )

        onView(withId(R.id.apDetailsSaveButton))
            .perform(click())
    }
}