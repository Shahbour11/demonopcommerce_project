package org.example.pages;

import org.example.stepDefinitions.hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class P05_hover {

    public List hoverCategories()
    {
        List hoverCategories = hooks.driver.findElements(By.xpath("//ul[@class=\"top-menu notmobile\"]/li"));
        return  hoverCategories ;
    }

    int mainItemIndex ;
    public boolean hasChildren(WebElement node) {
        return node.findElements(By.xpath("./descendant-or-self::*")).size() > 2;
    }
    public void hoverCategoriesMenu() {
        Actions action = new Actions(hooks.driver);
        List<WebElement> lis = hooks.driver.findElements(By.xpath("//ul[@class='top-menu notmobile']/li"));

        mainItemIndex = (int) (Math.random() * lis.size());

        WebElement mainLi = lis.get(mainItemIndex);
        action.moveToElement(mainLi).perform();
        boolean isHasChild = hasChildren(mainLi);
    }

    public String goSubCategory() {

        String subTitle;
        boolean isHasChild = false;
        if (isHasChild) {
            isHasChild = false;
            List<WebElement> as = hooks.driver.findElements(By.xpath(String.format("//ul[@class='top-menu notmobile']/li[position()=%d]//ul//li", mainItemIndex + 1)));

            int subCategoryIndex = (int) (Math.random() * as.size());
            subTitle = as.get(subCategoryIndex).getText();
            as.get(subCategoryIndex).click();
        } else {
            WebElement catNoChild = hooks.driver.findElement(By.xpath(String.format("//ul[@class='top-menu notmobile']/li[position()=%d]//a", mainItemIndex + 1)));
            subTitle = catNoChild.getText();
            catNoChild.click();
        }

        return subTitle;
    }
    public WebElement goPageTitle() {
        return hooks.driver.findElement(By.xpath("//div[@class='page-title']//h1"));
    }
}
