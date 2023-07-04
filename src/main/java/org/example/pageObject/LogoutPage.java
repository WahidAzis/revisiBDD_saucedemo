package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage {
    public static WebDriver driver;

    public LogoutPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//div[@id='page_wrapper']")
    private WebElement verifEndPageCheckout;

    @FindBy(id = "react-burger-menu-btn")
    private WebElement btnMenu;

    @FindBy(id = "logout_sidebar_link")
    private WebElement btnLogout;

    @FindBy(xpath = "//div[@class='login_logo']")
    private WebElement verifBacktoLoginPage;

    public boolean verifyChekOutEndPage() {
        return verifEndPageCheckout.isDisplayed();
    }
    public void clickBtnMenu(){
        btnMenu.click();
    }
    public void clickBtnLogout() {
        btnLogout.click();
    }
    public boolean verifyBacktoLoginPage() {
        return verifBacktoLoginPage.isDisplayed();
    }
}
