package org.mobileProgramming.maintermproject.Third;


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
public class ManagerTest {

    @Rule
    public ActivityTestRule<Manager> mActivityTestRule = new ActivityTestRule<>(Manager.class);

    @Test
    public void managerTest() {
        onView(withId(R.id.navigationView)).perform(click());
        onView(withId(R.id.frameLayout)).perform(click());

    }
}
