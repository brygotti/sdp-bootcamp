package com.github.brygotti.bootcamp;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

import static org.hamcrest.Matchers.containsString;

import android.app.Activity;
import android.content.Intent;
import android.widget.EditText;

import androidx.test.core.app.ActivityScenario;
import androidx.test.core.app.ApplicationProvider;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class GreetingActivityTest {

    @Test
    public void correctNameDisplayed() {
        Intent launchGreeting = new Intent(ApplicationProvider.getApplicationContext(), GreetingActivity.class);
        String name = "George";
        launchGreeting.putExtra("name", name);
        try (ActivityScenario<Activity> a = ActivityScenario.launch(launchGreeting)) {
            onView(withId(R.id.greetingMessage)).check(matches(withText(containsString(name))));
        }
    }
}
