package org.example.pages;

import org.example.stepDefinitions.hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P02_login {

    public WebElement loginButton ()
    {
        WebElement loginButton = hooks.driver.findElement(By.linkText("Log in"));
        return  loginButton ;
    }
    public WebElement emailEntered ()
    {
        WebElement emailEntered = hooks.driver.findElement(By.id("Email"));
        return  emailEntered ;
    }
    public WebElement passEntered ()
    {
        WebElement passEntered = hooks.driver.findElement(By.id("Password"));
        return  passEntered ;
    }
    public WebElement loginBtnClick ()
    {
        WebElement loginBtnClick = hooks.driver.findElement(By.cssSelector(".login-button"));
        return  loginBtnClick ;
    }
    public WebElement myAccountTab ()
    {
        WebElement myAccountTab = hooks.driver.findElement(By.cssSelector(".ico-account"));
        return  myAccountTab ;
    }
    public WebElement failedMessage ()
    {
        WebElement failedMessage = hooks.driver.findElement(By.className("message-error"));
        return failedMessage ;
    }
}
