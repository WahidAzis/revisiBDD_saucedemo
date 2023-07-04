package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pageObject.LogoutPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;


public class LogoutSteps {
    private WebDriver webDriver;

    public LogoutSteps() {
        super(); //For execution Hooks
        this.webDriver = Hooks.webDriver;
    }

    @And("User is already on the last page")
    public void verifyCheckoutEndPage() {
        LogoutPage logoutPage = new LogoutPage(webDriver);
        Assert.assertTrue(logoutPage.verifyChekOutEndPage());
    }
    @When("User click popup menu button")
    public void clckBtnMenu() throws InterruptedException {
        LogoutPage logoutPage = new LogoutPage(webDriver);
        logoutPage.clickBtnMenu();
        Thread.sleep(1000);
    }
    @And("User click logout option")
    public void clckBtnLogout() {
        LogoutPage logoutPage = new LogoutPage(webDriver);
        logoutPage.clickBtnLogout();
    }
    @Then("User return to login page")
    public void verifBackToLgnPage() {
        LogoutPage logoutPage = new LogoutPage(webDriver);
        Assert.assertTrue(logoutPage.verifyBacktoLoginPage());
    }
}
