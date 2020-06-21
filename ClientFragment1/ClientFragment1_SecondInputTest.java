package org.mobileProgramming.maintermproject.ClientFragment1;


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
public class ClientFragment1_SecondInputTest {

    @Rule
    public ActivityTestRule<ClientFragment1_SecondInput> mActivityTestRule = new ActivityTestRule<>(ClientFragment1_SecondInput.class);

    @Test
    public void clientFragment1_SecondInputTest() {
        onView(withId(R.id.SecondInput_PetAge)).perform(click());
        onView(withId(R.id.SecondInput_PetType)).perform(click());
        onView(withId(R.id.SecondInput_Allergy)).perform(click());

    }
}
