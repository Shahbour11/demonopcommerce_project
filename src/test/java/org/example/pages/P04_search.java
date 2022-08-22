package org.example.pages;

import org.example.stepDefinitions.hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P04_search {

    public WebElement searchBox()
    {
        WebElement searchBox = hooks.driver.findElement(By.id("small-searchterms"));
        return searchBox ;
    }
    public WebElement searchBtn()
    {
        WebElement searchBtn = hooks.driver.findElement(By.cssSelector(".search-box-button"));
        return searchBtn ;
    }
    public String url()
    {
        String url = hooks.driver.getCurrentUrl() ;
        return url ;
    }
    public List<WebElement> resultsOfSearch()
    {
        List<WebElement> resultsOFSearch = hooks.driver.findElements(By.cssSelector(".item-box"));
        return resultsOFSearch ;
    }
    public WebElement skuResult()
    {
        WebElement skuResult = hooks.driver.findElement(By.className("product-title")) ;
        return skuResult ;
    }
    public WebElement skuPage()
    {
        WebElement skuPage = hooks.driver.findElement(By.className("sku"));
        return skuPage ;
    }
}
