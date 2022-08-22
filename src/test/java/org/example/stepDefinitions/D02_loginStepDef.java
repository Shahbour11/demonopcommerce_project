package org.example.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P02_login;
import org.openqa.selenium.support.Color;
import org.testng.asserts.SoftAssert;

public class D02_loginStepDef {
    P02_login login = new P02_login() ;

    @Given("user go to login page")
    public void userGoToLoginPage()
    {
       login.loginButton().click();
    }
    @When("login with \"valid\" \"test@example.com\" and \"P@ssw0rd\"")
    public  void enterValidEmailAndPass()
    {
        login.emailEntered().sendKeys("Omar@example.com");
        login.passEntered().sendKeys("P@ssw0rd");
    }
    @When("user login with \"invalid\" \"test@example.com\" and \"P@ssw0rd\"")
    public  void enterInvalidEmailAndPass()
    {
        login.emailEntered().sendKeys("test@example.com");
        login.passEntered().sendKeys("P@ssw0rd");
    }

    @And("user press on login button")
    public void enterLoginBtn()
    {
        login.loginBtnClick().click();
    }
    @Then("user login to the system successfully")
    public void loginSucess()
    {
        SoftAssert softAssert = new SoftAssert() ;
        softAssert.assertEquals(hooks.driver.getCurrentUrl(),"https://demo.nopcommerce.com/","1st Assertion");

        softAssert.assertTrue(login.myAccountTab().isDisplayed() ,"2nd assertion");

        softAssert.assertAll();
    }
    @Then("user could not login to the system")
    public void loginFail()
    {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(login.failedMessage().getText().contains("Login was unsuccessful."),"1st Assertion");

        String expected_color = "#e4434b" ;
        String actual_color =  Color.fromString(login.failedMessage().getCssValue("color")).asHex();
        softAssert.assertTrue(actual_color.contains(expected_color), "#e4434b");
        softAssert.assertAll();
    }
}
