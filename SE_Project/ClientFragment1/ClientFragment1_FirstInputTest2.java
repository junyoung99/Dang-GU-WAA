package org.mobileProgramming.maintermproject.ClientFragment1;


import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

import androidx.test.espresso.ViewInteraction;
import androidx.test.filters.LargeTest;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mobileProgramming.maintermproject.R;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.closeSoftKeyboard;
import static androidx.test.espresso.action.ViewActions.replaceText;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withClassName;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.is;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class ClientFragment1_FirstInputTest2 {

    @Rule
    public ActivityTestRule<ClientFragment1_FirstInput> mActivityTestRule = new ActivityTestRule<>(ClientFragment1_FirstInput.class);

    @Test
    public void clientFragment1_FirstInputTest2() {
       onView(withId(R.id.FirstInput_NextBtn)).perform(click());
        onView(withId(R.id.FirstInput_UserName)).perform(click());
        onView(withId(R.id.FirstInput_Address)).perform(click());
        onView(withId(R.id.FirstInput_Address)).perform(click());
        onView(withId(R.id.FirstInput_Age)).perform(click());
        onView(withId(R.id.FirstInput_Job)).perform(click());



    }
}
