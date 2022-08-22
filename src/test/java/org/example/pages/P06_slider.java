package org.example.pages;

import org.example.stepDefinitions.hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P06_slider {
    public WebElement firstSlider()
    {
        WebElement firstSlider =
                hooks.driver.findElement(By.cssSelector("img[src=\"https://demo.nopcommerce.com/images/thumbs/0000079_banner_1.jpg\"]"));
                return firstSlider;
    }
    public WebElement secondSlider()
    {
        WebElement secondSlider = hooks.driver.findElement(By.cssSelector("img[src=\"https://demo.nopcommerce.com/images/thumbs/0000080_banner_2.jpg\"]"));
        return secondSlider ;
    }
}
