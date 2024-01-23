/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exer_04_1;

/**
 *
 * @author Reggi
 */
public class ShoppingCart {
//    Exercise 4-1:
//
//1.  Declare and initialize 2 String variables: custName and itemDesc
//2.  Declare a String variable called message.  Do not initialize it.
//3.  Assign the message variable with a concatenation of the custName and itemDesc.  
//     Include a String literal that results in a complete sentence.  
//     (example: "Mary Smith wants to purchase a Shirt")
//4.  Print the message to the System output.
//5.  Run the code.

    public static void main(String[] args) {
        String custName = "Messi";
        String itemDesc = " Balond'or";
        String message;
        message = "The" + itemDesc + " was won by " + custName;
        System.out.println(message);
    }
}
