Orders Menu App
This is a simple Android Jetpack Compose project that demonstrates an interactive restaurant menu ordering system.

The app allows users to select food items from a menu, adjust their order quantities, and place an order. It dynamically tracks stock availability and updates menu items once the stock is depleted.

Features
📋 Menu Display: Shows a list of dishes with their names.

➕➖ Increase/Decrease Orders: Each dish has "+" and "−" buttons to adjust the order quantity.

🎨 Stock Highlighting:

Item name stays black if stock is available.

Item name turns red when stock runs out.

✅ Place Order:

Pressing the "Make Order" button finalizes the chosen items.

A toast message displays the ordered items.

Stock is updated accordingly.

Tech Stack
Language: Kotlin

UI Toolkit: Jetpack Compose

State Management: mutableStateOf, derivedStateOf, mutableStateMapOf

Android Components: ComponentActivity, Toast

Code Structure
MainActivity.kt – Core logic for displaying the menu, handling stock, and updating UI.

Menu Item Rows – Each dish is represented in a Row with:

Dish name (Text)

"+" button (TextButton)

Ordered count (Text)

"− button" (TextButton)

When stock reaches 0, the dish text is colored red using a derivedStateOf check.

Example Usage
Open the app.

Increase quantities using the "+" button.

Decrease quantities using the "− button".

Click "Make Order" to finalize.

A Toast will display ordered items, and the stock for that dish will decrease.
