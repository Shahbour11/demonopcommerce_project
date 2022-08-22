package org.example.stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P07_followus;
import org.testng.Assert;

import java.util.ArrayList;

public class D07_followUsStepDef {
    P07_followus follow = new P07_followus();

    @When("user opens facebook link")
    public void opensFacebookLink() throws InterruptedException {
        follow.facebook().click();
        Thread.sleep(2000);
    }

    @When("user opens twitter link")
    public void opensTwitterLink() throws InterruptedException {
        follow.twitter().click();
        Thread.sleep(2000);
    }

    @When("user opens rss link")
    public void opensRssLink() throws InterruptedException {
        follow.newRss().click();
        Thread.sleep(2000);
    }

    @When("user opens youtube link")
    public void opensYoutubeLink() throws InterruptedException {
        follow.youtube().click();
        Thread.sleep(2000);
    }

    @Then("{string} is opened in new tab")
    public void linkInNewTab(String url) throws InterruptedException {
        ArrayList<String> tabs = new ArrayList<>(hooks.driver.getWindowHandles());
        hooks.driver.switchTo().window(tabs.get(1));
        Thread.sleep(2000);
        Assert.assertEquals(hooks.driver.getCurrentUrl(), url);
        hooks.driver.close();
        hooks.driver.switchTo().window(tabs.get(0));
    }
}