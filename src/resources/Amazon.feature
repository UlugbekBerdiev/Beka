  #1. Visit amazon.com Page
  #2. Search for Book 'qa testing for beginners'
  #3. Click on 1st item in the listed results
  #4. Before Click on add to cart Add to Cart asset price from Step3.
  #5. Click on Add to Cart.
  #6. Before Click on Proceed to Checkout asset price from Step3.
  #7. Click on proceed to checkout
  #8. On the checkout page assert price from Step3


@test

Feature: Amazon search functionality test

Scenario: As a user, I should not be able to search and add to cart my purchases

  Given User on the amazon main page
  When  User Search for Book 'qa testing for beginners'
  And   Click search button
  Then  User Should be able to click First item in the listed results
  And   User Should be able to click to add to cart
  Then  User should be able to click proceed to checkout

