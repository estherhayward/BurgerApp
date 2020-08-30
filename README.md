# Burger App
         
## What this project is about
The aim is to help a burger company manage their process of selling hamburgers.
The application selects the types of burger, some of the additional items to be
added to the burgers and pricing.
         
## User stories
- Create a base hamburger and two other types of hamburgers.
- The basic hamburger should have the following items:
    - Bread type and one meat topping.
    - Up to 4 additional toppings (e.g. lettuce, tomato, carrot, etc) that the customer
      can select to be added to the burger.
    - Each one of these items gets charged an additional price.
    - So you need some way to track how many items got added.
    - The burger has a base price and the additions are all separately priced (up to 4 additions).
    - And calculate the final price (base burger with all the additions).
    - Create a Hamburger class to deal with all the above.
    - The constructor should only include the bread type, meat and price and can also include the name of burger.
- The healthy burger should have the following:
    - It can have 6 additions (toppings) in total.
    - Hint: You probably want to process the two additional items in this new class (subclass of burger),
- The deluxe burger should have the following:
    - Comes with chips and drinks as additions
    - No extra additions are allowed.
    - Add these new additions at the time the deluxe burger is created.
    - Prevent other additions being made.
- All 3 classes should have a method that can be called anytime to show:
    - Base price of the hamburger.
    - Each topping name.
    - Topping price.
    - And a grand total for the burger (base price + all additions).
    - Hint: For the two additional classes this may require you to be looking at the base class for pricing
      and then adding totals to final price.
            
## Goal
- To showcase disciplined git usage
- Apply inheritance and method overriding