package org.mobileProgramming.maintermproject.ManagerFragment1;


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
public class ManagerFragment1_FirstInputTest {

    @Rule
    public ActivityTestRule<ManagerFragment1_FirstInput> mActivityTestRule = new ActivityTestRule<>(ManagerFragment1_FirstInput.class);

    @Test
    public void managerFragment1_FirstInputTest() {
        onView(withId(R.id.ManagerFragment1_userName)).perform(click());
        
    }
}
