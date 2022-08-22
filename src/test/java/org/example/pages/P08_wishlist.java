package org.example.pages;

import org.example.stepDefinitions.hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P08_wishlist {

    public WebElement addItem()
    {
        WebElement addItem = hooks.driver.findElement(By.cssSelector(".item-box:nth-child(3) .add-to-wishlist-button"));
        return addItem ;
    }
    public WebElement getMsg()
    {
        WebElement getMsg = hooks.driver.findElement(By.cssSelector(".content"));
        return  getMsg ;
    }
    public String getMsgClr()
    {
        String getMsgClr = hooks.driver.findElement(By.cssSelector(".bar-notification.success")).getCssValue("background-color");
        return getMsgClr ;
    }
    public WebElement navigateToWishlist() {
        WebElement navigateToWishList = hooks.driver.findElement(By.className("wishlist-label"));
        return navigateToWishList ;
    }

    public WebElement getAmount() {
        WebElement getAmount = hooks.driver.findElement(By.className("qty-input"));
        return getAmount ;
    }
}
