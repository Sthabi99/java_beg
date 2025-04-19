/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Practice_11;

import java.util.ArrayList;

public class practice_11 {

    public static void main(String[] args) {
        String combName = "Thabiso,Kutloano,Daniel,Keke,Anthony";

        // Print the full comma-separated names string
        System.out.println("Combined Names: " + combName);

        // Split the string into an array
        String[] sepName = combName.split(",");

        // Print the third-to-last name
        System.out.println("Third-last name: " + sepName[sepName.length - 3]);

        // Print all names using a for loop
        System.out.println("\n--- Separated Names ---");
        for (int i = 0; i < sepName.length; i++) {
            System.out.println(sepName[i]);
        }

        System.out.println("DONE with SepNames\n");

        // Populate an ArrayList with the names
        ArrayList<String> namesA = new ArrayList();
        for (int x = 0; x < sepName.length; x++) {
            namesA.add(sepName[x]);
        }

        // Show what's in the ArrayList
        System.out.println("--- ArrayList Contents ---");
        for (int y = 0; y < 4; y++) {
            System.out.println(namesA);
        }
    }
}
