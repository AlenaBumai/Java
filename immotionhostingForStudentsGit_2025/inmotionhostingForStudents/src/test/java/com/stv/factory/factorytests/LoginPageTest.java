package com.stv.factory.factorytests;

import com.stv.factory.factorypages.LoginFactoryPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.stv.framework.core.utils.Waiters.waitForElementVisible;
import static org.testng.AssertJUnit.assertEquals;
import com.stv.factory.factorypages.*;

import java.time.Duration;

public class LoginPageTest extends BasicFactoryTest{
    MainFactoryPage mainFactoryPage = new MainFactoryPage();
    LoginFactoryPage loginFactoryPage =new LoginFactoryPage();

    @Test (description = "Navigate to Login Page")
        public void navigateToLoginPage(){
            mainFactoryPage.clickLoginButton();
            waitForElementVisible(getDriver(), Duration.ofSeconds(3), loginFactoryPage.getUsernameField());
            Assert.assertTrue(loginFactoryPage.isLoginPageDisplayed(), "Login page didn't open");

        }

    public void testLoginSubmit() {
        loginFactoryPage.setUsername();
        loginFactoryPage.buttonSubmitLoginClick();
//проверка что при вводе только usermane пользователь остался на той же странице
        WebDriver driver = getDriver();
        String newUrl = driver.getCurrentUrl();
            assertEquals("https://secure1.inmotionhosting.com/index/login", newUrl);
        }
}

