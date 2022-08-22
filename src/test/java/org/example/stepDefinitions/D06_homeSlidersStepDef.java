package org.example.stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P04_search;
import org.example.pages.P06_slider;
import org.testng.asserts.SoftAssert;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class D06_homeSlidersStepDef {
    P06_slider slider = new P06_slider() ;

    @When("click on first slider")
    public void clickOnFirstSlider() {
        slider.firstSlider();
        hooks.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }
    @Then("direct user to expected 1ST url")
    public void directUserToExpectedUrl() {
        SoftAssert soft =new SoftAssert();
        String expUrl="https://demo.nopcommerce.com/nokia-lumia-1020";
        String actualUrl= hooks.driver.getCurrentUrl();
        soft.assertEquals(actualUrl,expUrl);
        soft.assertAll();
    }

    @When("click on second slider")
    public void clickOnSecondSlide() {
        slider.secondSlider();
        hooks.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @Then("direct user to expected 2ND url")
    public void directUserToExpectedSecondSlideUrl() {
        SoftAssert soft =new SoftAssert();
        String expUrl="https://demo.nopcommerce.com/iphone-6";
        String actualUrl =hooks.driver.getCurrentUrl();
        soft.assertEquals(actualUrl,expUrl);
        soft.assertAll();
    }

}
