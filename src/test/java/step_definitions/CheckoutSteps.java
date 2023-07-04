package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pageObject.CheckoutPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class CheckoutSteps {
    private WebDriver webDriver;

    public CheckoutSteps(){
        super(); //For execution Hooks
        this.webDriver = Hooks.webDriver;
    }

    @Then("User already on Checkout Information Page")
    public void verifyCheckoutForm() {
        CheckoutPage checkoutPage = new CheckoutPage(webDriver);
        Assert.assertTrue(checkoutPage.verifyCheckoutForm());
    }

    @When("User input {string} as a firstName, input {string} as lastName and input {string} as postCode")
    public void inputCredential(String firstName, String lastName, String postalCode) {
        CheckoutPage checkoutPage = new CheckoutPage(webDriver);
        checkoutPage.setFirstName(firstName);
        checkoutPage.setLastName(lastName);
        checkoutPage.setPostalCode(postalCode);
    }

    @And("User click Continue Button")
    public void clickContinue() throws InterruptedException {
        CheckoutPage checkoutPage = new CheckoutPage(webDriver);
        checkoutPage.ContinueCheckout();
        Thread.sleep(1000);
    }

    @Then("User already on Checkout Overview")
    public void verifyCheckoutOverview() {
        CheckoutPage checkoutPage = new CheckoutPage(webDriver);
        Assert.assertTrue(checkoutPage.verifyCheckoutOverview());
    }

    @And("User click on Finish Button")
    public void finishButton() throws InterruptedException {
        CheckoutPage checkoutPage = new CheckoutPage(webDriver);
        checkoutPage.clickFinishButton();
        Thread.sleep(1000);
    }

    @And("User already on Success Page")
    public void verifySuccessPage() {
        CheckoutPage checkoutPage = new CheckoutPage(webDriver);
        Assert.assertTrue(checkoutPage.verifySuccessPage());
    }

}
