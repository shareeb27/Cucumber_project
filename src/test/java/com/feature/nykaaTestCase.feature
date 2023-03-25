Feature: Purchasing Products In Nykaa Application

Scenario: Url Page Module 
Given user Lanuch the application

Scenario: Login Procedure Module

When user click the signup button
When user Click The Signin button
When user Enter The Phone Number in input Field
Then user Click The proceed button 
When user Get and Pass The Otp
When user Click The Verify button

Scenario: Selecting Catagories 

When user Move To Popups Element
When user Click The Headphones Element
Then Browser switch to Window Handling Method

Scenario: Selecting Products

When user Selects the Product Element
Then Browser switch to Window Handling Methods
Then user adds the Product to Add to Cart button
When user Click The Bag 
When user Switch to iFrame 
When user Click to Proceed button

Scenario: Address Process

 When user Add Email or New Address
 When user Enter House Number In The Feild
 When user Enter AreaName In The feild
 When user Enter Name In The Feild
 When user Enter PhoneNumber In The Feild
 When user Enter Pincode In The Feild
 
 Scenario: Payment Process
 
 When user Click Ship to Address button
 When user Click on Cash on Delivery
 When user Place a Order  