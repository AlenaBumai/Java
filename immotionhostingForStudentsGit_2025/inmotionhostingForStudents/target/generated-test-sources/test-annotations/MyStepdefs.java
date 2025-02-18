import com.stv.factory.factorypages.MainFactoryPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.stv.factory.*;

import static org.testng.AssertJUnit.assertEquals;

public class MyStepdefs {
    @Given("^Main page is loaded$")
    public void mainPageIsLoaded() {
        MainFactoryPage mainFactoryPage = new MainFactoryPage();
       
            boolean actualResult = mainFactoryPage.isMainLogoDisplayed();
            Assert.assertEquals(actualResult, true, "Main Logo isn't visible");

        }

    @When("^The user clicks button Support center$")
    public void theUserClicksButtonSupportCenter() {
        mainFactoryPage.clickLoginButton();
    }

    @Then("^Support center page is loaded$")
    public void supportCenterPageIsLoaded() {
        WebDriver driver = getDriver();
        String newUrl = driver.getCurrentUrl();
        assertEquals("https://www.inmotionhosting.com/support/", newUrl);

    }
}
