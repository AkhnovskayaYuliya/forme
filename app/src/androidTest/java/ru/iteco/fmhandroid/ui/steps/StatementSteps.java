package ru.iteco.fmhandroid.ui.steps;

import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.contrib.RecyclerViewActions.actionOnItemAtPosition;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;

import ru.iteco.fmhandroid.ui.pages.StatementsPage;
import ru.iteco.fmhandroid.ui.pages.ToolbarPage;

public class StatementSteps {
    StatementsPage statementsPage = new StatementsPage();
    ToolbarPage tools = new ToolbarPage();
    public void checkElement() {
        tools.navigationButton.check(matches(isDisplayed()));
        tools.appTrademark.check(matches(isDisplayed()));
        tools.butterflyButton.check(matches(isDisplayed()));
        tools.personButton.check(matches(isDisplayed()));
        statementsPage.pageTitle.check(matches(isDisplayed()));
        statementsPage.statementList.check(matches(isDisplayed()));
    }
    public void expandStatement() {
        statementsPage.statement.perform(actionOnItemAtPosition(0, click()));
    }
    public void checkDescription() {
        statementsPage.statementDescription.check(matches(isDisplayed()));
    }

}
