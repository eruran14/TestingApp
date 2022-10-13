package com.eru.testingapp

import androidx.test.espresso.Espresso
import androidx.test.espresso.Espresso.closeSoftKeyboard
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MainActivityTest {

    @Rule
    @JvmField
    val rule: ActivityScenarioRule<*> = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun simpleAdd(){
        onView(withId(R.id.num1Et)).perform(ViewActions.typeText("4"))
        onView(withId(R.id.num1Et)).perform(ViewActions.closeSoftKeyboard())
        onView(withId(R.id.num2Et)).perform(ViewActions.typeText("5"))
        onView(withId(R.id.num2Et)).perform(ViewActions.closeSoftKeyboard())
        onView(withId(R.id.calculateBtn)).perform(ViewActions.click())
        onView(withId(R.id.num1Et)).check(ViewAssertions.matches(ViewMatchers.withText("9")))

    }
    @Test
    fun simpleDivide(){
        onView(withId(R.id.num1Et)).perform(ViewActions.typeText("10"))
        onView(withId(R.id.num1Et)).perform(ViewActions.closeSoftKeyboard())
        onView(withId(R.id.num2Et)).perform(ViewActions.typeText("5"))
        onView(withId(R.id.num2Et)).perform(ViewActions.closeSoftKeyboard())
        onView(withId(R.id.calculateBtn)).perform(ViewActions.click())
        onView(withId(R.id.num1Et)).check(ViewAssertions.matches(ViewMatchers.withText("2")))

    }
}