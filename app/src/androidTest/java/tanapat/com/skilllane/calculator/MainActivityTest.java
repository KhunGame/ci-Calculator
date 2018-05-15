package tanapat.com.skilllane.calculator;

import android.support.test.rule.ActivityTestRule;

import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;

import tools.fastlane.screengrab.Screengrab;
import tools.fastlane.screengrab.UiAutomatorScreenshotStrategy;
import tools.fastlane.screengrab.locale.LocaleTestRule;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

public class MainActivityTest {


    @ClassRule
    public static final LocaleTestRule localeTestRule =
            new LocaleTestRule();

    //open activity
    @Rule
    public ActivityTestRule<MainActivity> activityTestRule =
            new ActivityTestRule<>(MainActivity.class);

    @Test
    public void plus_1_and_1_should_result_2() {
        //set for screen grab
        Screengrab.setDefaultScreenshotStrategy(new UiAutomatorScreenshotStrategy());
        CalculatorPage.กรอกเลขตัวแรก("1");

        Screengrab.screenshot("step01");

        onView(withId(R.id.btn_plus))
                .perform(click());

        CalculatorPage.กรอกเลขตัวที่สอง("1");

        Screengrab.screenshot("step02");

        onView(withId(R.id.btn_calculator))
                .perform(click());

        onView(withId(R.id.txv_result))
                .check(matches(withText("Result = 2")));

        Screengrab.screenshot("step03");
    }
}