# 🍽️ Orders Menu App

A simple Android **Jetpack Compose** project that demonstrates an interactive restaurant menu ordering system.

---

## ✨ Features

- 📋 **Menu Display**: Shows a list of dishes with their names.  
- ➕➖ **Increase/Decrease Orders**: Each dish has `+` and `−` buttons to adjust the order quantity.  
- 🎨 **Stock Highlighting**:
  - Item name stays **black** if stock is available.  
  - Item name turns **red** when stock runs out.  
- ✅ **Place Order**:
  - Pressing the **"Make Order"** button finalizes the chosen items.  
  - A **Toast** message displays the ordered items.  
  - Stock is updated accordingly.  

---

## 🛠️ Tech Stack

- **Language**: Kotlin  
- **UI Toolkit**: Jetpack Compose  
- **State Management**: `mutableStateOf`, `derivedStateOf`, `mutableStateMapOf`  
- **Android Components**: `ComponentActivity`, `Toast`  

---

## 📂 Code Structure

- **MainActivity.kt** – Core logic for displaying the menu, handling stock, and updating UI.  
- **Menu Item Rows** – Each dish is represented in a `Row` with:  
  - Dish name (`Text`)  
  - `"+"` button (`TextButton`)  
  - Ordered count (`Text`)  
  - `"−"` button (`TextButton`)  

👉 When stock reaches `0`, the dish text is colored **red** using a `derivedStateOf` check.  

---

## 🚀 Example Usage

1. Open the app.  
2. Increase quantities using the `"+"` button.  
3. Decrease quantities using the `"−"` button.  
4. Click **"Make Order"** to finalize.  
5. A **Toast** will display ordered items, and stock for that dish will decrease.  

---
