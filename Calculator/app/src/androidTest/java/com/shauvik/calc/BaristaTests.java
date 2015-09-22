package com.shauvik.calc;

import com.shauvik.calc.CalcActivity;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import static android.support.test.espresso.Espresso.*;
import static android.support.test.espresso.action.ViewActions.*;
import static android.support.test.espresso.matcher.ViewMatchers.*;
import static android.support.test.espresso.assertion.ViewAssertions.*;
import static org.hamcrest.Matchers.*;
import android.test.suitebuilder.annotation.LargeTest;
import static com.checkdroid.crema.EspressoPlus.*;
import android.support.test.espresso.Espresso;
import static org.hamcrest.core.*;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class BaristaTests {

  @Rule
  public final ActivityTestRule<CalcActivity> main = new ActivityTestRule<>(CalcActivity.class);

  @Test
  public void ty1() {
    onView(withId(R.id.btn5)).check(matches(isClickable()));
  }

  @Test
  public void hjj2() {
    onView(withId(R.id.btn4)).check(matches(isClickable()));
  }

  @Test
  public void bjj3() {
    onView(withId(R.id.btn4)).perform(click());
  }

  @Test
  public void vjf4() {
    onView(withId(R.id.multiply)).perform(click());
    onView(withId(R.id.btn4)).perform(click());
    onView(withId(R.id.equals)).perform(click());
  }

  @Test
  public void calci5() {
    onView(withId(R.id.btn8)).perform(click());
    onView(withId(R.id.divide)).perform(click());
    onView(withId(R.id.btn3)).perform(click());
    onView(withId(R.id.equals)).perform(click());
  }

  @Test
  public void cakcj6() {
    onView(withId(R.id.btn8)).perform(click());
    onView(withId(R.id.divide)).perform(click());
    onView(withId(R.id.btn2)).perform(click());
    onView(withId(R.id.equals)).perform(click());
    onView(withId(R.id.btn5)).check(matches(isClickable()));
  }

  @Test
  public void calculator7() {
    onView(withId(R.id.btn5)).check(matches(isClickable()));
  }

  /**
   * test calculator app
   */
  @Test
  public void CalcTest8() {
    onView(withId(R.id.btn7)).perform(click());
    onView(withId(R.id.divide)).perform(click());
    onView(withId(R.id.btn0)).perform(click());
    onView(withId(R.id.equals)).perform(click());
    onView(withId(R.id.textView)).check(matches(isDisplayed()));
    onView(withId(R.id.textView)).check(matches(withText("ERROR")));
  }

  @Test
  public void guess9() {
    onView(withId(R.id.btn5)).check(matches(isClickable()));
  }

  /**
   * Test for Calculator
   */
  @Test
  public void CalculatorTest10() {
    onView(withId(R.id.btn8)).check(matches(isClickable()));
    onView(withId(R.id.btn9)).check(matches(isClickable()));
  }

  /**
   * Test for Calculator
   */
  @Test
  public void CalculatorTest11() {
    onView(withId(R.id.btn8)).check(matches(isEnabled()));
  }

  /**
   * Test for Calculator
   */
  @Test
  public void CalculatorTest12() {
    onView(withId(R.id.btn9)).check(matches(isClickable()));
    onView(withId(R.id.btn8)).check(matches(isClickable()));
  }

  /**
   * Test for Calculator
   */
  @Test
  public void CalculatorTest13() {
    onView(withId(R.id.btn3)).perform(click());
    onView(withId(R.id.subtract)).perform(click());
    onView(withId(R.id.btn2)).perform(click());
    onView(withId(R.id.equals)).perform(click());
    onView(withId(R.id.btn7)).perform(click());
  }

  /**
   * Test for Calculator
   */
  @Test
  public void CalculatorTest14() {
    onView(withId(R.id.btn8)).perform(click());
    onView(withId(R.id.divide)).perform(click());
    onView(withId(R.id.btn7)).perform(click());
    onView(withId(R.id.equals)).perform(click());
    onView(withId(R.id.btn4)).perform(click());
    onView(withId(R.id.multiply)).perform(click());
    onView(withId(R.id.btn4)).perform(click());
    onView(withId(R.id.equals)).perform(click());
  }

  /**
   * Test for Calculator
   */
  @Test
  public void CalculatorTest15() {
    onView(withId(R.id.btn8)).perform(click());
    onView(withId(R.id.divide)).perform(click());
    onView(withId(R.id.btn7)).perform(click());
    onView(withId(R.id.equals)).perform(click());
    onView(withId(R.id.multiply)).perform(click());
    onView(withId(R.id.btn4)).perform(click());
    onView(withId(R.id.equals)).perform(click());
  }

  /**
   * Test for Calculator
   */
  @Test
  public void CalculatorTest16() {
    onView(withId(R.id.btn5)).perform(click());
  }

  /**
   * Test for Calculator
   */
  @Test
  public void CalculatorTest17() {
    onView(withId(R.id.btn1)).perform(click());
  }

  /**
   * Test for Calculator
   */
  @Test
  public void CalculatorTest18() {
    onView(withId(R.id.btn8)).perform(click());
  }

  /**
   * Test for Calculator
   */
  @Test
  public void CalculatorTest19() {
    onView(withId(R.id.btn8)).perform(click());
  }

  /**
   * Test for Calculator
   */
  @Test
  public void CalculatorTest20() {
    onView(withId(R.id.btn8)).perform(click());
  }

  /**
   * Test for Calculator
   */
  @Test
  public void CalculatorTest21() {
    onView(withId(R.id.btn7)).perform(click());
    onView(withId(R.id.divide)).perform(click());
    onView(withId(R.id.btn1)).perform(click());
    onView(withId(R.id.equals)).perform(click());
    onView(withId(R.id.textView)).check(matches(withText("7")));
  }

  /**
   * Test for Calculator
   */
  @Test
  public void CalculatorTest22() {
    onView(withId(R.id.btn7)).perform(click());
    onView(withId(R.id.divide)).perform(click());
    onView(withId(R.id.btn0)).perform(click());
    onView(withId(R.id.equals)).perform(click());
    onView(withId(R.id.textView)).check(matches(withText("ERROR")));
  }

  /**
   * Test for Calculator
   */
  @Test
  public void CalculatorTest23() {
    onView(withId(R.id.btn7)).perform(click());
    onView(withId(R.id.divide)).perform(click());
    onView(withId(R.id.btn0)).perform(click());
    onView(withId(R.id.equals)).perform(click());
    onView(withId(R.id.textView)).check(matches(withText("ERROR")));
  }

  /**
   * Test for Calculator
   */
  @Test
  public void CalculatorTest24() {
    onView(withId(R.id.btn7)).perform(click());
    onView(withId(R.id.divide)).perform(click());
    onView(withId(R.id.btn2)).perform(click());
    onView(withId(R.id.equals)).perform(click());
    onView(withId(R.id.textView)).check(matches(withText("3")));
  }

  /**
   * Test for Calculator
   */
  @Test
  public void CalculatorTest25() {
    onView(withId(R.id.btn7)).perform(click());
    onView(withId(R.id.divide)).perform(click());
    onView(withId(R.id.btn2)).perform(click());
    onView(withId(R.id.equals)).perform(click());
    onView(withId(R.id.textView)).check(matches(withText("3")));
  }

  /**
   * Test for Calculator
   */
  @Test
  public void CalculatorTest26() {
    onView(withId(R.id.btn7)).perform(click());
    onView(withId(R.id.divide)).perform(click());
    onView(withId(R.id.btn0)).perform(click());
    onView(withId(R.id.equals)).perform(click());
    onView(withId(R.id.textView)).check(matches(withText("ERROR")));
  }

}
