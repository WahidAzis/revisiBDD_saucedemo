package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pageObject.SalesPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class SalesSteps {
    private WebDriver webDriver;

    public SalesSteps(){
        super(); //For execution Hooks
        this.webDriver = Hooks.webDriver;
    }

    @Then("User already on sales page")
    public void verifySalesPage() {
        SalesPage salesPage = new SalesPage(webDriver);
        Assert.assertTrue(salesPage.verifySalesPage());
    }

    //Used for sort Product
    @When("User sort product list by {string}")
    public void sortProduct(String sort) {
        SalesPage salesPage = new SalesPage(webDriver);
        salesPage.setSortProduct(sort);
    }

    //Used on Sales Feature
    @And("User add 2 product to cart")
    public void click2Product() throws InterruptedException {
        SalesPage salesPage = new SalesPage(webDriver);
        salesPage.clickProduct1();
        salesPage.clickProduct2();
        Thread.sleep(1000);
    }

    //Used on Set Order Feature
    @And("User add {string} and {string} to cart")
    public void add2Product(String product1, String product2) {
        SalesPage salesPage = new SalesPage(webDriver);
        salesPage.addProduct(product1, product2);
    }

    @And("User click icon cart")
    public void clickCart() throws InterruptedException {
        SalesPage salesPage = new SalesPage(webDriver);
        salesPage.clickCart();
        Thread.sleep(1000);
    }
}
