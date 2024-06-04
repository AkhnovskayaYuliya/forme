package ru.iteco.fmhandroid.ui.steps;

import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.contrib.RecyclerViewActions.actionOnItemAtPosition;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import ru.iteco.fmhandroid.R;
import ru.iteco.fmhandroid.ui.DataHelper.DataHelper;
import ru.iteco.fmhandroid.ui.pages.NewsPage;
import ru.iteco.fmhandroid.ui.pages.ToolbarPage;

public class NewsPageSteps {
    ToolbarPage tools = new ToolbarPage();
    NewsPage newsPage = new NewsPage();
    DataHelper dataHelper = new DataHelper();
    public void checkElements() {
        tools.navigationButton.check(matches(isDisplayed()));
        tools.appTrademark.check(matches(isDisplayed()));
        tools.butterflyButton.check(matches(isDisplayed()));
        tools.personButton.check(matches(isDisplayed()));
        newsPage.pageTitle.check(matches(isDisplayed()));
        newsPage.sortNewsButton.check(matches(isDisplayed()));
        newsPage.filterNewsButton.check(matches(isDisplayed()));
        newsPage.panelButton.check(matches(isDisplayed()));
        newsPage.newsList.check(matches(isDisplayed()));
    }

    public void expandSeparateNews() {
        newsPage.separateNews.perform(actionOnItemAtPosition(0, click()));
    }

    public void checkDescription() {
        newsPage.newsDescription.check(matches(isDisplayed()));
    }
    public void sortNews() {
        newsPage.sortNewsButton.perform(click());
    }
    public void checkSortedNews() {
        List<Date> dates = dataHelper.getDisplayedDates(R.id.news_list_recycler_view, R.id.news_item_date_text_view);
        List<Date> sortedDates = new ArrayList<>(dates);
        sortedDates.sort(Collections.reverseOrder());
        assert dates.equals(sortedDates);
    }

    public void clickFilter() {
        newsPage.filterNewsButton.perform(click());
    }
    public void clickPanelButton() {
        newsPage.panelButton.perform(click());
    }

}
