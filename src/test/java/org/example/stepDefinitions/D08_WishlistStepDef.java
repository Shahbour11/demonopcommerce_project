package org.example.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P08_wishlist;
import org.openqa.selenium.By;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class D08_WishlistStepDef {

    P08_wishlist wishlist = new P08_wishlist() ;
    @Given("User add an item to wishlist")
    public void addItem() {
        wishlist.addItem().click();
    }

    @Then("user will see a green success message")
    public void msgWithBackgroundClr() {
        SoftAssert soft = new SoftAssert();
        String expClr="rgba(75, 176, 122, 1)" ;
        String actualClr = wishlist.getMsgClr();
        Color.fromString(actualClr).asHex() ;
        soft.assertTrue(wishlist.getMsg().isDisplayed());
        soft.assertEquals(actualClr, expClr);
        soft.assertAll();
    }

    @When("User waits after adding the item")
    public void userWaitsAfterAddItem() {
        WebDriverWait wait = new WebDriverWait(hooks.driver, Duration.ofSeconds(10));

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("bar-notification")));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("bar-notification")));
    }

    @And("User navigates to his wishlist")
    public void goToWishlist() {
        wishlist.navigateToWishlist().click();
    }

    @Then("The quantity value is greater than zero")
    public void quantityValue() {
        String value = wishlist.getAmount().getAttribute("value");
        Assert.assertNotSame(value, "0");
    }
}
