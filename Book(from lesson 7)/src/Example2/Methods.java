/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Example2;

import java.util.Scanner;

public class Methods {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);  // ✅ Correct Scanner

        Example person = new Example("Thabiso", 45);

        person.showName();
        person.showId();

        System.out.print("Enter new ID: ");
        int newId = userInput.nextInt();  // ✅ Gets int from user

        person.setID(newId);
        person.showId();

        userInput.close();  // ✅ Close scanner when done
    }
}
