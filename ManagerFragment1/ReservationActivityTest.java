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
public class ReservationActivityTest {

    @Rule
    public ActivityTestRule<ReservationActivity> mActivityTestRule = new ActivityTestRule<>(ReservationActivity.class);

    @Test
    public void reservationActivityTest() {
        onView(withId(R.id.calendar_view)).perform(click());

        onView(withId(R.id.ll_settings)).perform(click());

    }
}
