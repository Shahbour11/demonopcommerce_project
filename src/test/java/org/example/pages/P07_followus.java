package org.example.pages;

import org.example.stepDefinitions.hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P07_followus {

    public WebElement facebook(){
        WebElement facebook =  hooks.driver.findElement(By.cssSelector("a[href=\"http://www.facebook.com/nopCommerce\"]"));
        return facebook ;
    }

    public WebElement twitter(){
        WebElement twitter =  hooks.driver.findElement(By.cssSelector("a[href=\"https://twitter.com/nopCommerce\"]"));
        return twitter ;
    }
    public WebElement newRss(){
        WebElement newRss = hooks.driver.findElement(By.cssSelector("a[href=\"/news/rss/1\"]"));
        return newRss ;
    }
    public WebElement youtube(){
       WebElement youtube = hooks.driver.findElement(By.cssSelector("a[href=\"http://www.youtube.com/user/nopCommerce\"]"));
       return youtube ;
    }
}
