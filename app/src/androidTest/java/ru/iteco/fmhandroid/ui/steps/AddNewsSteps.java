package ru.iteco.fmhandroid.ui.steps;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.replaceText;
import static androidx.test.espresso.assertion.ViewAssertions.doesNotExist;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

import static org.hamcrest.Matchers.allOf;

import ru.iteco.fmhandroid.ui.pages.AddNewsPage;

public class AddNewsSteps {
    AddNewsPage addNewsPage = new AddNewsPage();
    public void checkTitle() {
        addNewsPage.pageTitle.check(matches(isDisplayed()));
    }
    public void cancelAddNews() {
        addNewsPage.cancelButton.perform(click());
        addNewsPage.okButton.perform(click());
    }
    public void clickCategoty() {
        addNewsPage.category.perform(click());
    }
    public void createTitle(String text) {
        addNewsPage.newsTitle.perform(replaceText(text));
    }
    public void createDate() {
        addNewsPage.publicationDate.perform(click());
        addNewsPage.okButton.perform(click());
    }
    public void createTime() {
        addNewsPage.time.perform(click());
        addNewsPage.okButton.perform(click());
    }
    public void createDescription(String text) {
        addNewsPage.description.perform(replaceText(text));
    }
    public void clickSave() {
        addNewsPage.saveButton.perform(click());
    }
    public void checkNews(String text) {
        onView(allOf(withText(text), isDisplayed())).check(matches(isDisplayed()));
    }
    public void manualInputTime(String text1, String text2) {
        addNewsPage.time.perform(click());
        addNewsPage.toggle.perform(click());
        addNewsPage.manualInputHours.perform(replaceText(text1));
        addNewsPage.manualInputMinutes.perform(replaceText(text2));
        addNewsPage.okButton.perform(click());
    }
    public void checkTimeError() {
        addNewsPage.timeError.check(matches(isDisplayed()));
    }
    public void clickCancel() {
        addNewsPage.smallCancelButton.perform(click());
    }
    public void checkDoesNotExist(String text) {
        onView(withText(text)).check(doesNotExist());
    }
}
