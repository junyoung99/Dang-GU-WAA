package org.mobileProgramming.maintermproject.ClientFragment5;


import androidx.test.filters.LargeTest;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mobileProgramming.maintermproject.R;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.matcher.ViewMatchers.withId;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class ClientFragment5_myInfoTest {

    @Rule
    public ActivityTestRule<ClientFragment5_myInfo> mActivityTestRule = new ActivityTestRule<>(ClientFragment5_myInfo.class);

    @Test
    public void clientFragment5_myInfoTest() {
        onView(withId(R.id.uni)).perform(click());
        onView(withId(R.id.name)).perform(click());


    }
}
