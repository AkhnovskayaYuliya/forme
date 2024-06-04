package ru.iteco.fmhandroid.ui.steps;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.replaceText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

import static org.hamcrest.Matchers.allOf;

import ru.iteco.fmhandroid.ui.DataHelper.DataHelper;
import ru.iteco.fmhandroid.ui.pages.EditNewsPage;

public class EditNewsSteps {
    EditNewsPage editNewsPage = new EditNewsPage();
    DataHelper dataHelper = new DataHelper();

    public void checkTitle() {
        editNewsPage.pageTitle.check(matches(isDisplayed()));
    }
    public void cancelEdit() {
        editNewsPage.cancelButton.perform(click());
        editNewsPage.okButton.perform(click());
    }
    public void changeDate() {
        editNewsPage.publicationDate.perform(click());
        dataHelper.setDateInDatePicker();
        editNewsPage.okButton.perform(click());
    }
    public void changeTitle(String text) {
        editNewsPage.newsTitle.perform(replaceText(text));
    }
    public void changeDescription(String text) {
        editNewsPage.description.perform(replaceText(text));
    }
    public void clickSave() {
        editNewsPage.saveButton.perform(click());
    }
    public void checkChanges(String text) {
        onView(allOf(withText(text), isDisplayed())).check(matches(isDisplayed()));
    }
    public void changeTime() {
        editNewsPage.time.perform(click());
        editNewsPage.okButton.perform(click());
    }
    public void changeStatus() {
        editNewsPage.switcher.perform(click());
    }
}
