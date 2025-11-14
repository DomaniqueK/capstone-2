# Pizza-Licious 
### "Nique's Pizzeria" is an application that allows staff to manage and process custom pizza orders, side items and drinks. This application demonstrates Object-Oriented Programming(OOP) principles to structure the menu, orders, and checkout process cleanly.

## Key Features 
- Pizza Customization: Customers can select a pizza size (8", 12", or 16") and crust type and then add premium meats and cheeses along with included toppings/sauces.
- Other Products: Drinks and garlic knots
- Real-Time Pricing: The price automatically updates with each selection as you are customizing your order
- Automated Receipt: Once you have checked out, a detailed receipt is automatically saved as a text file.

## Project Structure / Classes
- HomeScreen: Displays the home page and prompts the user to start a new order or exit the application
- OrderScreen: Manages the order flow and customization menus
- Pizza: Handles the base price and calculates the total prices based on size, premium toppings/extras
- Order: Manages the overall running total for the current order
- OtherProducts: Handles adding drinks and or garlic knots to the order
- Checkout: Finalizes the order, displays the final price for the customer and add the confirmed order to the ReceiptWriter
- ReceiptWriter: Writes the completed order details and prices onto a file for record-keeping
- Selections: Holds the constants for all the menu items