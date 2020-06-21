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
public class ClientFragment5_userInfoTest {

    @Rule
    public ActivityTestRule<ClientFragment5_userInfo> mActivityTestRule = new ActivityTestRule<>(ClientFragment5_userInfo.class);

    @Test
    public void clientFragment5_userInfoTest() {
        onView(withId(R.id.ClientFragment1_userInfoProfile)).perform(click());

        onView(withId(R.id.ClientFragment5_userInfo_address)).perform(click());

    }
}
