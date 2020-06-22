package org.mobileProgramming.maintermproject.Fragment4;


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
public class MessageDestPetInfoTest {

    @Rule
    public ActivityTestRule<MessageDestPetInfo> mActivityTestRule = new ActivityTestRule<>(MessageDestPetInfo.class);

    @Test
    public void messageDestPetInfoTest() {

        onView(withId(R.id.ClientFragment5_petInfo_name)).perform(click());

    }
}
