package com.stv.factory.factorypages;

import static com.stv.framework.core.lib.ImmotionPageURLs.START_URL;
import com.stv.framework.core.drivers.MyDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.junit.Assert.assertEquals;

import static org.testng.AssertJUnit.assertEquals;
public class SupportFactoryPage extends FactoryPage{
    String supportPageLink="https://www.inmotionhosting.com/support/";
    public String returnSupportPageLink(){return supportPageLink;}
}
