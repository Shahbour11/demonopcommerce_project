package org.example.pages;

import org.example.stepDefinitions.hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P03_homePage {
  public WebElement currencyChange()
  {
    WebElement currencyChange = hooks.driver.findElement(By.id("customerCurrency"));
    return currencyChange ;
  }
  public List<WebElement> currencyCheck()
  {
    List<WebElement> currencyCheck = (List<WebElement>) hooks.driver.findElements(By.className("price"));
    return (List<WebElement>) currencyCheck;
  }

}
