package org.mobileProgramming.maintermproject.Third;


import androidx.test.espresso.Espresso;
import androidx.test.espresso.action.ViewActions;
import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.filters.LargeTest;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mobileProgramming.maintermproject.R;
import org.mobileProgramming.maintermproject.Third.Client;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.matcher.ViewMatchers.withId;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class ClientTest {

    @Rule
    public ActivityTestRule<Client> mActivityTestRule = new ActivityTestRule<>(Client.class);

    @Test
    public void clientTest() {
        Espresso.onView(ViewMatchers.withId(R.id.navigationView)).perform(ViewActions.click());
        Espresso.onView(ViewMatchers.withId(R.id.frameLayout)).perform(ViewActions.click());

    }
}
