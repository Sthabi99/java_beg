/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex05_1;

/**
 *
 * @author Reggi
 */
//public static void main(String[] args) {
//        String custName = "Messi";
//        String itemDesc = " Balond'or";
//        String message;
//        message = "The" + itemDesc + " was won by " + custName;
//        System.out.println(message);
//    }
public class ShoppingCart {

    public static void main(String[] args) {
        String custName = "Mary Smith";
        String itemDesc = "Shirt";

        // numeric fields
        double price = 21.99;
        int quantity = 1;
        double tax = 1.04;
        double total;
        String message = custName + " wants to purchase " + quantity + " " + itemDesc;

        // Calculating total cost
        total = (price * quantity) * tax;

        // Declare outOfStock variable and initialize it
        boolean outOfStock = false;

        // Test quantity and modify message if quantity > 1.  
        if (quantity > 1) {
            message = message + "s";
        }

        // Test outOfStock and notify user in either case.  
        if (outOfStock) {
            System.out.println("Sorry we are out of stock");
        } else {
            System.out.println(message);
            System.out.println("Total is "+ total);
        }

    }

}
