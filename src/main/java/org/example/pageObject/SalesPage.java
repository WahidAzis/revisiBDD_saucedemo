package org.example.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SalesPage {
    public static WebDriver driver;

    public SalesPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//span[@class='title']")
    private WebElement verifySalesPage;

    public boolean verifySalesPage(){
        return verifySalesPage.isDisplayed();
    }

    @FindBy(xpath = "//select[@class='product_sort_container']")
    private WebElement sortProduct;

    public void setSortProduct(String sort){
        Select a = new Select(sortProduct);
        a.selectByVisibleText(sort);
    }

    @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-onesie']")
    private WebElement product1;

    @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-bike-light']")
    private WebElement product2;

    public void clickProduct1(){
        product1.click();
    }

    public void clickProduct2(){
        product2.click();
    }

    public void addProduct(String productName1, String productName2){
        String a = "//div[text()[contains(.,'"+ productName1 +"')]]/ancestor::div[@class='inventory_item_description']//*[contains(@id, 'add-to-cart')]";
        String b = "//div[text()[contains(.,'"+ productName2 +"')]]/ancestor::div[@class='inventory_item_description']//*[contains(@id, 'add-to-cart')]";
        driver.findElement(By.xpath(a)).click();
        driver.findElement(By.xpath(b)).click();
    }

    @FindBy(xpath = "//div[@id='shopping_cart_container']/a[1]")
    private WebElement cartButton;

    public void clickCart(){
        cartButton.isDisplayed();
        cartButton.click();
    }
}
