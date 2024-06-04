package ru.iteco.fmhandroid.ui.steps;

import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;

import ru.iteco.fmhandroid.ui.pages.ToolbarPage;

public class ToolsSteps {
    ToolbarPage tools = new ToolbarPage();

    public void exit() {
        tools.personButton.perform(click());
        tools.exitButton.perform(click());
    }
    public void clickButterfly() {
        tools.butterflyButton.perform(click());
    }
    public void clickNavigationButton() {
        tools.navigationButton.perform(click());
    }
    public void checkButtons() {
        tools.aboutAppButton.check(matches(isDisplayed()));
        tools.newsButton.check(matches(isDisplayed()));
        tools.mainButton.check(matches(isDisplayed()));
    }
    public void clickNews() {
        tools.newsButton.perform(click());
    }
    public void clickMain() {
        tools.mainButton.perform(click());
    }
    public void clickAboutApp() {
        tools.aboutAppButton.perform(click());
    }

}
