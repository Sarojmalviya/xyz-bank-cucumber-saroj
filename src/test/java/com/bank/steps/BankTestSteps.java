package com.bank.steps;

import com.bank.pages.AccountPage;
import com.bank.pages.AddCustomerPage;
import com.bank.pages.CustomerLoginPage;
import com.bank.pages.OpenAccountPagexyz;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BankTestSteps {
    @When("I click on {string} Tab")
    public void iClickOnTab(String arg0) {
        new AddCustomerPage().clickOnAddCustomer();
    }

    @And("I enter FirstName")
    public void iEnterFirstName() {
        new AddCustomerPage().addFirstName("Abc");
    }

    @And("I enter Last Name")
    public void iEnterLastName() {
        new AddCustomerPage().setAddLastName("xyz");
    }

    @And("I enter Postcode")
    public void iEnterPostcode() {
        new AddCustomerPage().enterPostCode("Ha03Sx");
    }

    @And("I click on {string} Button")
    public void iClickOnButton(String arg0) {
        new AddCustomerPage().clickOnAddCustomerButton();
    }

    @And("popup display")
    public void popupDisplay() {
        new AddCustomerPage().popupDisplay();
    }

    @Then("I verify message {string}")
    public void iVerifyMessage(String arg0) {
        new AddCustomerPage().verifyMessageInPopupWindow();
    }

    @And("I click on ok button on popup.")
    public void iClickOnOkButtonOnPopup() {
        new AddCustomerPage().clickOnOkButtInPopup();
    }

    @When("I click on Open Account Tab")
    public void iClickOnOpenAccountTab() {
        new OpenAccountPagexyz().clickOnOpenAccountTab();
    }

    @And("I search customer that created in first test")
    public void iSearchCustomerThatCreatedInFirstTest() {
        new OpenAccountPagexyz().selectCustomerCreatedFromDropDownList();
    }

    @And("I search currency {string}")
    public void iSearchCurrency(String arg0) {
        new OpenAccountPagexyz().selectCurrencyFromDropDownList();
    }

    @And("I click on process button")
    public void iClickOnProcessButton() {
        new  OpenAccountPagexyz().clickOnProcessButton();
    }

    @When("I click on customer login tab")
    public void iClickOnCustomerLoginTab() {
        new CustomerLoginPage().clickOnCustomerLogin();
    }

    @And("I search customer that i have created")
    public void iSearchCustomerThatIHaveCreated() {
        new CustomerLoginPage().searchCustomerField();
    }

    @And("I click on login button")
    public void iClickOnLoginButton() {
        new CustomerLoginPage().clickOnLoginButton();
    }

    @Then("I verify Logout tab is displayed")
    public void iVerifyLogoutTabIsDisplayed() {
        new CustomerLoginPage().verifyLogOut();
    }

    @And("I click on Logout")
    public void iClickOnLogout() {
        new CustomerLoginPage().clickOnLogOut();
    }

    @Then("I verify Your Name text displayed")
    public void iVerifyYourNameTextDisplayed() {
        new CustomerLoginPage().verifyName();
    }

    @And("I click on deposit Tab")
    public void iClickOnDepositTab() {
        new AccountPage().clickOnDepositeTab();
    }

    @And("I enter amount {int}")
    public void iEnterAmount(int arg0) {
        new AccountPage().enter100InAmountField();
    }

    @And("I click on deposit button")
    public void iClickOnDepositButton() {
        new AccountPage().clickOnDepositeButton();
    }

    @Then("I verify message Deposit Successful")
    public void iVerifyMessageDepositSuccessful() {
        new AccountPage().verifyDepositTransactionSuccessful();
    }

    @And("I click on Withdrawl Tab")
    public void iClickOnWithdrawlTab() {
        new AccountPage().ClickOnWithdrawTab();
    }

    @And("I enter  withdrawl Amount {int}")
    public void iEnterWithdrawlAmount(int arg0) {
        new AccountPage().enterAmountInWithdrawField();
    }

    @And("I click on Withdraw button")
    public void iClickOnWithdrawButton() {
        new AccountPage().clickOnWithdrawButton();
    }

    @Then("I verify withdrawl  message {string}")
    public void iVerifyWithdrawlMessage(String arg0) {
        new AccountPage().verifywithdrawlTransactionSuccessful();
    }
}
