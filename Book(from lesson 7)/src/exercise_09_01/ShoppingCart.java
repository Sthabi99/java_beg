package exercise_09_01;

public class ShoppingCart {

    public static void main(String args[]) {

        Customer cust = new Customer();
        // Declare, instantiate, and initialize a Customer object

        cust.setName("Thabiso");
        String custName = cust.getName();
        System.out.println("Name of Customer: " + custName);
        // Print the customer object name
    }
}
