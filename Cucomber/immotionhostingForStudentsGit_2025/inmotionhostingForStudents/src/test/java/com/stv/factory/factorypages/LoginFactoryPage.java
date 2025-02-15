package com.stv.factory.factorypages;


import com.stv.framework.core.drivers.MyDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.junit.Assert.assertEquals;

import static org.testng.AssertJUnit.assertEquals;

public class LoginFactoryPage extends FactoryPage{


    @FindBy(id = "username")
    private WebElement usernameInput;

    @FindBy(id = "password")
    private WebElement passwordInput;

    @FindBy(css = "a.forgot-password")
    private WebElement forgotPasswordLink;

    @FindBy(css = "#login-submit")
    private WebElement ButtonSubmit;
//********
    public boolean isLoginPageDisplayed() {

        return usernameInput.isDisplayed() && passwordInput.isDisplayed();
    }
    //********
    public WebElement getUsernameField() {
        return usernameInput;
    }

    public WebElement getPasswordField() {
        return passwordInput;
    }

    public void clickUsernameField() {
        usernameInput.click();
    }

    public void clickPasswordField() {
        passwordInput.click();
    }

    public void clickForgotPasswordLink() {
        forgotPasswordLink.click();
    }

    //********************SubmitLoginClick

    public void buttonSubmitLoginClick(){
        ButtonSubmit.click();
}


//********************setUsername

    public void setUsername(){
        usernameInput.sendKeys("abc@gmail.com");;
    }


//  *********** box-shadow
    public boolean isInputFieldActive(WebElement field) {


        String boxShadow = field.getCssValue("box-shadow");

        boolean isActive = boxShadow != null && !boxShadow.equals("none");
        return isActive;
    }
}


