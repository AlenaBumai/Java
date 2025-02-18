package com.stv.factory.factorypages;

import com.stv.factory.factorytests.MainFactoryTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainFactoryPage extends FactoryPage {

    @FindBy(css = "*[alt ='InMotion Hosting Logo']")
    private WebElement immotionLogo;

    @FindBy(id = "navbarNavDropdown")
    private WebElement navigationPanel;

    @FindBy(xpath = "//button[contains(text(), 'Accept All Cookies')]")
    private WebElement acceptAllCookiesButton;

    // кнопка login
    @FindBy(css = "#navbarNavDropdown > div.nav-item.btn-login-container > a")
    WebElement loginButton;

    // кнопка support
    @FindBy(xpath = "*[@id=\"imh-main-menu\"]/div/nav/div/div[2]/ul/li[4]/a")
    WebElement supportButton;





    public WebElement getNavigationPanel() {
        return navigationPanel;
    }

    public MainFactoryPage acceptAllCookiesIfVisible() {
        if (acceptAllCookiesButton.isEnabled())
            acceptAllCookiesButton.click();
        return this;
    }

    public boolean isMainLogoDisplayed() {
        acceptAllCookiesIfVisible();
        return immotionLogo.isDisplayed();
    }

    public boolean isNavigationPanelDisplayed() {
        return navigationPanel.isDisplayed();
    }

    // *клик по  login
    public void clickLoginButton() {
        loginButton.click();
    }


// клик по support
public void clickSupportButton() {
    supportButton.click();
}

}
