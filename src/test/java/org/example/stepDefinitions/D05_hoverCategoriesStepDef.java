package org.example.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P05_hover;
import org.testng.Assert;

public class D05_hoverCategoriesStepDef {
    P05_hover hover = new P05_hover() ;
    @Given("hover on random main category")
    public void user_hover_on_random_main_category_on_the_top_menu() {
        hover.hoverCategories();
    }

    @When("user click on a sub category of product")
    public void user_click_on_a_sub_category_of_product() {
        String goSubCategory = hover.goSubCategory();

    }




    @Then("verify that the category title is match")
    public void verify_if_the_category_title_is_matching()  {
        String expTitle = hover.goSubCategory();
        String actualTitle = hover.goPageTitle().getText();
        Assert.assertTrue(actualTitle.toLowerCase().trim().contains(expTitle.toLowerCase().trim()));
    }
}
