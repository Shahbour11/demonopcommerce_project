package org.example.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P01_register;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class D01_registerStepDef {
    P01_register reg = new P01_register();

    @Given("user go to register page")

    public void stepOne()
    {

       reg.registerButton().click();
    }
   @When("user select gender type")

   public void stepTwo()
   {
       reg.genderType().click();
   }
   @And("user enter first name \"automation\" and last name \"tester\"")

    public void stepThree()
   {
       reg.firstNameEntered().sendKeys("automation");
       reg.lastNameEntered().sendKeys("tester");
   }
   @And("user enter date of birth")

    public void stepFour()
   {
      Select daydropdown = new Select(reg.dateDayEntered());
      daydropdown.selectByVisibleText("26");

      Select monthdropdown = new Select(reg.dateMonthEntered());
      monthdropdown.selectByVisibleText("September");

      Select yeardropdown = new Select(reg.dateYearEntered());
      yeardropdown.selectByVisibleText("1998");

   }
    @And("user enter email \"test@example.com\" field")

    public void  stepFive ()
    {
       reg.emailEntered().sendKeys("Omar@example.com");
    }
    @And("user fills Password fields \"P@ssw0rd\" \"P@ssw0rd\"")

    public void stepSix()
    {
      reg.passEntered().sendKeys("P@ssw0rd");
      reg.confirmPassEntered().sendKeys("P@ssw0rd");
    }
    @And("user clicks on register button")

    public void  stepSeven()
    {
      reg.regBtnClick().click();
    }
    @Then("success message is displayed")
    public void stepEight()
    {
        SoftAssert soft = new SoftAssert() ;
        String expected_msg = "Your registration completed" ;
        String actual_msg = reg.successMsg().getText() ;
        soft.assertTrue(actual_msg.contains(expected_msg),"firstassertiontrue");
        String expected_color = "rgba(76, 177, 124, 1)";
        String actual_color = reg.successMsg().getCssValue("color") ;
        soft.assertTrue(actual_color.contains(expected_color), "rgba(76, 177, 124, 1");
        soft.assertAll();
    }

}
