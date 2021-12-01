package com.github.kadehar.arterialpressureapp.tests

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.github.kadehar.arterialpressureapp.R
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class AddButtonTest : TestBase() {
    @Test
    fun onAddButtonTapTest() {
        onView(withId(R.id.apDetailsCreateButton)).perform(click())
        onView(withId(R.id.apDetailsSaveButton)).check(matches(isDisplayed()))
    }
}