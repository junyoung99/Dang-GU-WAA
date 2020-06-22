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
public class MessageActivityTest {

    @Rule
    public ActivityTestRule<MessageActivity> mActivityTestRule = new ActivityTestRule<>(MessageActivity.class);

    @Test
    public void messageActivityTest() {
        onView(withId(R.id.messageActivity_matching)).perform(click());
        onView(withId(R.id.messageActivity_recyclerview)).perform(click());
        onView(withId(R.id.messageActivity_editText)).perform(click());
        onView(withId(R.id.drawer_layout)).perform(click());

    }
}
