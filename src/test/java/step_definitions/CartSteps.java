package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pageObject.CartPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class CartSteps {
    private WebDriver webDriver;

    public CartSteps(){
        super(); //For execution Hooks
        this.webDriver = Hooks.webDriver;
    }

    @Then("User already on cart page")
    public void verifyCartPage() {
        CartPage cartPage = new CartPage(webDriver);
        Assert.assertTrue(cartPage.verifyCartPage());
    }

    @When("User remove product {string}")
    public void removeProduct(String nameProduct) {
        CartPage cartPage = new CartPage(webDriver);
        cartPage.removeProduct(nameProduct);
    }

    @And("User click checkout button")
    public void clickButtonCheckout() {
        CartPage cartPage = new CartPage(webDriver);
        cartPage.clickCheckout();
    }
}
