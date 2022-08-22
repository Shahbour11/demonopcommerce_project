package org.example.pages;

import org.example.stepDefinitions.hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P01_register {

    public WebElement registerButton ()
    {
        WebElement registerButton =    hooks.driver.findElement(By.className("ico-register"));
       return  registerButton ;

    }
    public WebElement genderType ()
    {
        WebElement genderType = hooks.driver.findElement(By.id("gender-male"));
        return  genderType ;
    }

    public WebElement firstNameEntered ()
    {
        WebElement firstNameEntered = hooks.driver.findElement(By.id("FirstName"));
        return firstNameEntered ;
    }
    public WebElement lastNameEntered ()
    {
        WebElement lastNameEntered = hooks.driver.findElement(By.id("LastName"));
        return lastNameEntered ;
    }
    public WebElement dateDayEntered ()
    {
        WebElement dateDayEntered = hooks.driver.findElement(By.name(("DateOfBirthDay")));
        return  dateDayEntered ;
    }

    public WebElement dateMonthEntered ()
    {
        WebElement dateMonthEntered = hooks.driver.findElement(By.name(("DateOfBirthMonth")));
        return  dateMonthEntered ;
    }
    public WebElement dateYearEntered ()
    {
        WebElement dateYearEntered = hooks.driver.findElement(By.name(("DateOfBirthYear")));
        return  dateYearEntered ;
    }
    public WebElement emailEntered ()
    {
        WebElement emailEntered = hooks.driver.findElement(By.id("Email"));
        return emailEntered ;
    }
    public WebElement passEntered ()
    {
        WebElement passEntered = hooks.driver.findElement(By.id("Password"));
        return  passEntered ;
    }
    public WebElement confirmPassEntered ()
    {
        WebElement confirmPassEntered = hooks.driver.findElement(By.id("ConfirmPassword"));
        return  confirmPassEntered ;
    }
    public  WebElement regBtnClick ()
    {
        WebElement regBtnClick = hooks.driver.findElement(By.id("register-button"));
        return  regBtnClick ;
    }
    public WebElement successMsg()
    {
        WebElement successMsg = hooks.driver.findElement(By.className("result"));
        return successMsg ;
    }
}
