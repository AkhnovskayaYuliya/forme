package ru.iteco.fmhandroid.ui.steps;

import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.replaceText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;

import ru.iteco.fmhandroid.ui.DataHelper.DataHelper;
import ru.iteco.fmhandroid.ui.pages.FilterPage;

public class FilterSteps {
    FilterPage filter = new FilterPage();
    DataHelper dataHelper = new DataHelper();
    public void checkFilterTitle() {
        filter.pageTitle.check(matches(allOf(isDisplayed(), withText("Фильтровать новости"))));
    }
    public void clickCancel() {
        filter.cancelButton.perform(click());
    }
    public void clickCategoty() {
        filter.categoryList.perform(click());
    }
    public void clickFilterButton() {
        filter.filterButton.perform(click());
    }
    public void inputCategory(String text) {
        filter.inputCategory.perform(replaceText(text));
    }

    public void selectDate() {
        filter.dateFirst.perform(click());
        dataHelper.setDateInDatePicker();
        filter.okButton.perform(click());
        filter.dateSecond.perform(click());
        dataHelper.setDateInDatePicker();
        filter.okButton.perform(click());
    }

    public void clickInactiveCheckBox() {
        filter.inactiveCheckBox.perform(click());
    }

    public void clickActiveCheckBox() {
        filter.activeCheckBox.perform(click());
    }
}
