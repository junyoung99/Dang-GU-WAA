package org.mobileProgramming.maintermproject.ManagerFragment5;


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
public class ManagerFragment5_userInfoTest {

    @Rule
    public ActivityTestRule<ManagerFragment5_userInfo> mActivityTestRule = new ActivityTestRule<>(ManagerFragment5_userInfo.class);

    @Test
    public void managerFragment5_userInfoTest() {
        onView(withId(R.id.ManagerFragment1_userInfoProfile)).perform(click());

        onView(withId(R.id.ManagerFragment5_userInfo_address)).perform(click());

    }
}
