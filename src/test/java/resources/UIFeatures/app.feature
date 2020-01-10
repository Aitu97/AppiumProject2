@TECTC-100
Feature:
  Scenario: Negative Scenario
    Given Launch the app.
    And Verify the toast message, when wrong/insufficient input provided


Scenario: Positive Scenario1
Given Launch the app.
And Fill the forms.
Then Verify successful login


Scenario: Positive Scenario2
Given Launch the app.
And Login.
Then Add to cart 1 item (Air Jordan 1 Mid SE). 4. Verify the item in the cart.


Scenario: Positive Scenario2:
Given Launch the app.
And Login.
Then Add to cart 3 items (Air Jordan 9 Retro, Jordan Lift Off, Lebron Soldier 12). 4. Verify the items in the cart.


Scenario: Positive Scenario3:
Given Launch the app.
And Login.
Then Add to cart 2 items (PG 3, Nike SFB Jungle).
Then Verify the items in the cart.
Then Verify the prices in cart are same with listed prices. 6. Verify the total price is correct.


Scenario: Positive Scenario4:
Given Launch the app.
And Login.
Then Add to cart 2 items (PG 3, Nike SFB Jungle).
Then Verify the items in the cart.
Then Verify the prices in cart are same with listed prices. 6. Verify the total price is correct.
Then Remove PG 3 from cart.
Then Verify only 1 item left in the cart..
And Verify the price for the item.
Then Verify total price.

Scenario: Positive Scenario5:
Given Launch the app.

And Login.
Then Add to cart 2 items (Converse All Star, Jordan 6 Rings).
And Verify the items in the cart.
And Verify the prices in cart are same with listed prices.
Then Verify the total price is correct.
Then Tap on the check box in the cart to receive emails.
And Tap on “Visit to the website to complete purchase” button.
And Navigate to www.techtorialacademy.com from mobile browser.
And Verify you are on home page of www.techtorialacademy.com
Then Switch back to mobile application
Then Login.


Scenario: Positive Scenario6:
Given Launch the app.
And Login.
And Add to cart all items.
Then Print out “Terms Of Conditions” to console. 5. Verify all items in the cart.
