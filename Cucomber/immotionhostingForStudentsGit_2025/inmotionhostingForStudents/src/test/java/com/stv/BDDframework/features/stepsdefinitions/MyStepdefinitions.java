package com.stv.BDDframework.features.stepsdefinitions;

import com.stv.factory.factorypages.MainFactoryPage;
import com.stv.factory.factorypages.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import static com.stv.factory.factorytests.BasicFactoryTest.getDriver;
import static org.testng.AssertJUnit.assertEquals;

public class MyStepdefinitions {
    @Given("^Main page is loaded$")
    MainFactoryPage mainFactoryPage = new MainFactoryPage();
    public void mainPageIsLoaded() {

            boolean actualResult = mainFactoryPage.isMainLogoDisplayed();
            Assert.assertEquals(actualResult, true, "Main Logo isn't visible");
        }

    @When("^The user clicks button Support center$")
    public void theUserClicksButtonSupportCenter() {
        mainFactoryPage.clickSupportButton();
    }

    @Then("^Support center page is loaded$")
    public void supportCenterPageIsLoaded() {
        SupportFactoryPage supportFactoryPage=new SupportFactoryPage();
        assertEquals(supportFactoryPage.returnSupportPageLink(), getDriver().getCurrentUrl());

    }
}
