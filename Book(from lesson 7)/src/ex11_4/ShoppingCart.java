package ex11_4;

import java.util.ArrayList;

public class ShoppingCart {

    public static void main(String[] args) {
        // Declare, instantiate, and initialize an ArrayList of Strings.  Print and test your code.
        ArrayList<String> learnersName = new ArrayList();
        // add (insert) another element at a specific index
        learnersName.add("Thabiso");
        learnersName.add("Reginald");
        learnersName.add(2, "Kojoana");
        // Check for the existence of a specific String element.
        System.out.println(learnersName);
        learnersName.contains("Reginald");
        //   If it exists, remove it.
        if (learnersName.contains("Reginald")) {
            learnersName.remove("Reginald");
            System.out.println(learnersName);
        };
    }
}
