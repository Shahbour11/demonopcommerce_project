package org.example.stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.eo.Se;
import org.example.pages.P03_homePage;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;


public class D03_currenciesStepDef {

    P03_homePage cuurency = new P03_homePage() ;
    SoftAssert soft = new SoftAssert();
@When("Select Euro currency from the dropdown list")
    public void stepOne()
{
  cuurency.currencyChange().click();
    Select dropDown = new Select(cuurency.currencyChange()) ;
    dropDown.selectByVisibleText("Euro");
}
@Then("Prices changes with symbol {string}")
   public void stepTwo(String symbol)
{

  for (int i=0 ; i<4 ; i++)
  {
      String price = cuurency.currencyCheck().get(i).getText();
      soft.assertTrue(price.contains(symbol)) ;

  }
    soft.assertAll();
}
}
