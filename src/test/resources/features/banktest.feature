Feature: Bank Manager functionality
  @sanity @smoke @regression
  Scenario: Bank Manager Should Add Customer Successfully
    When I click on "Add Customer" Tab
    And I enter FirstName
    And I enter Last Name
    And I enter Postcode
    And I click on "Add Customer" Button
    And popup display
    Then I verify message "Customer added Successfully"
    And I click on ok button on popup.
  @smoke @regression
  Scenario: Bank Manager Should Open Account Successfully
    When I click on Open Account Tab
    And I search customer that created in first test
    And I search currency "Pound"
    And I click on process button
    And popup display
    Then I verify message "Account created successfully"
    And I click on ok button on popup.
  @regression
  Scenario: Customer should Login And Logout Successfully
    When I click on customer login tab
    And I search customer that i have created
    And I click on login button
    Then I verify Logout tab is displayed
    And I click on Logout
    Then I verify Your Name text displayed

  @regression
  Scenario: Customer Should Deposit Money Successfully
    When I click on customer login tab
    And I search customer that i have created
    And I click on login button
    And I click on deposit Tab
    And I enter amount 100
    And I click on deposit button
    Then I verify message Deposit Successful
  @regression
  Scenario: Customer Should withdraw Money SuccessfullyWhen I click on customer login tab
    And I search customer that i have created
    And I click on login button
    And I click on Withdrawl Tab
    And I enter  withdrawl Amount 50
    And I click on Withdraw button
    Then I verify withdrawl  message "Transaction Successful"