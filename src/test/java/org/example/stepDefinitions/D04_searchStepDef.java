package org.example.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P04_search;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class D04_searchStepDef {
    P04_search search = new P04_search();

    @When("User enter product name or SKU {}")

    public void stepOne(String termOfSearch) {
        search.searchBox().sendKeys(termOfSearch);
        search.searchBtn().click();
    }

    @Then("Verify URL contains {string}")
    public void stepTwo(String expResult) {

        SoftAssert soft = new SoftAssert();
        String actualResult = search.url();
        soft.assertTrue(actualResult.contains(expResult));
        soft.assertAll();
    }


    @And("Count number of search results")
    public void stepThree() {
        List<WebElement> resultsOfSearch = search.resultsOfSearch();
    }

    @And("Verify each result contains the search term {}")
    public void stepFour(String termOfSearch) {
        List<WebElement> resultsOfSearchList = search.resultsOfSearch();
        for (WebElement result : resultsOfSearchList) {
            Assert.assertTrue(result.getText().toLowerCase().contains(termOfSearch.toLowerCase()));
        }
    }

    @Then("Go to the product page")
    public void stepFive() {
        search.skuResult().click();
    }

    @And("Verify the product page contains the SKU {}")
    public void stepSix(String resultOfSearch) {
        Assert.assertTrue(search.skuPage().getText().contains(resultOfSearch));
    }

}