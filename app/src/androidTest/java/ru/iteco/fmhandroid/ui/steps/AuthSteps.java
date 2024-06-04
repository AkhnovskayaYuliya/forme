package ru.iteco.fmhandroid.ui.steps;

import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.closeSoftKeyboard;
import static androidx.test.espresso.action.ViewActions.replaceText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;

import ru.iteco.fmhandroid.R;
import ru.iteco.fmhandroid.ui.DataHelper.DataHelper;
import ru.iteco.fmhandroid.ui.pages.AuthPage;

public class AuthSteps {
    AuthPage authPage = new AuthPage();
    DataHelper dataHelper = new DataHelper();
    public void loadAuthPage() {
        DataHelper.waitingElement(withId(R.id.enter_button), 4000);
    }

    public void checkElementsAuth() {
        authPage.login.check(matches(isDisplayed()));
        authPage.password.check(matches(isDisplayed()));
        authPage.loginButton.check(matches(isDisplayed()));
    }

    public void validData() {
        authPage.login.perform(replaceText(dataHelper.validUser().getLogin()), closeSoftKeyboard());
        authPage.password.perform(replaceText(dataHelper.validUser().getPassword()), closeSoftKeyboard());
    }

    public void invalidData() {
        authPage.login.perform(replaceText(dataHelper.invalidUser().getLogin()), closeSoftKeyboard());
        authPage.password.perform(replaceText(dataHelper.invalidUser().getPassword()), closeSoftKeyboard());
    }

    public void clickEnterButton() {
        authPage.loginButton.perform(click());
    }
}
