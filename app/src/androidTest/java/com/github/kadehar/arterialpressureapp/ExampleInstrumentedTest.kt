package com.github.kadehar.arterialpressureapp

@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {

    @get:Rule
    var activityScenarioRule = activityScenarioRule<MainActivity>()

    @Test
    fun useAppContext() {
        val appContext = InstrumentationREgistry.getInstrumentation().targetContext
        assertEquals("com.github.kadehar.arterialpressureapp", appContext.packagename)
    }

    @Test
    fun changeOnCLick() {
        onView(withId(R.id.apDetailsCreateButton)).perform(click())
        onView(withId(R.id.apDetailsSaveButton)).check(matches(isDisplayed()))
    }


    @Test
    fun oneMonthText() {
        onView(withId(R.id.arterialPressureFilters)).perform(
            RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(2, click())
        )
        onView(withId(R.id.arterialPressureList)).check(itemCount(greaterThan(1)))
    }
}