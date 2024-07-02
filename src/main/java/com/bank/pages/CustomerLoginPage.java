package com.bank.pages;

import com.bank.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class CustomerLoginPage extends Utility {
    private static final Logger log = LogManager.getLogger(CustomerLoginPage.class.getName());
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Customer Login')]")
    WebElement customerLogin;
    @CacheLookup
    @FindBy(xpath = "//select[@id='userSelect']")
    WebElement customerField;
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Login')]")
    WebElement loginButton;
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Logout')]")
    WebElement vlogout;
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Logout')]")
    WebElement logout;
    @CacheLookup
    @FindBy(xpath = "//label[contains(text(),'Your Name :')]")
    WebElement name;

    public void clickOnCustomerLogin() {
        clickOnElement(customerLogin);
        log.info("click on customer" + customerLogin.toString());
    }
    public void searchCustomerField() {
        selectByVisibleTextFromDropDown(customerField, "Hermoine Granger");
        log.info("search customer" + customerField.toString());
    }
    public void clickOnLoginButton() {
        clickOnElement(loginButton);
        log.info("click on login " + loginButton.toString());
    }
    public String verifyLogOut() {
        log.info("verify logout " + vlogout.toString());
        return getTextFromElement(vlogout);
    }
    public void clickOnLogOut() {
        clickOnElement(vlogout);
        log.info("click on logout " + logout.toString());
    }
    public void verifyName() {
        clickOnElement(name);
        log.info("verify name " + name.toString());
    }

}
