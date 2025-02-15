package ru.iteco.fmhandroid.ui.steps;

import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.contrib.RecyclerViewActions.actionOnItemAtPosition;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;

import static org.hamcrest.Matchers.not;

import ru.iteco.fmhandroid.R;
import ru.iteco.fmhandroid.ui.DataHelper.DataHelper;
import ru.iteco.fmhandroid.ui.pages.MainPage;
import ru.iteco.fmhandroid.ui.pages.ToolbarPage;

public class MainPageSteps {
    MainPage mainPage = new MainPage();
    ToolbarPage tools = new ToolbarPage();

    public void checkElements() {
        tools.navigationButton.check(matches(isDisplayed()));
        tools.appTrademark.check(matches(isDisplayed()));
        tools.butterflyButton.check(matches(isDisplayed()));
        tools.personButton.check(matches(isDisplayed()));
        mainPage.pageTitle.check(matches(isDisplayed()));
        mainPage.newsList.check(matches(isDisplayed()));
        mainPage.allNewsButton.check(matches(isDisplayed()));
    }

    public void expandList() {
        mainPage.expandListButton.perform(click());
    }

    public void checkListIsNotDisplayed() {
        mainPage.newsList.check(matches(not(isDisplayed())));
    }

    public void expandSeparateNews() {
        mainPage.separateNews.perform(actionOnItemAtPosition(0, click()));
    }
    public void checkNewsDescription() {
        mainPage.newsDescription.check(matches(isDisplayed()));
    }
    public void clickAllNewsButton() {
        mainPage.allNewsButton.perform(click());
    }
    public void loadMainPage() {
        DataHelper.waitingElement(withId(R.id.news_list_recycler_view), 4000);
    }
}
