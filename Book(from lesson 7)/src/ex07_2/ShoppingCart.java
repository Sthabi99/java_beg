package ex07_2;

//Exercise 7-2
//
//1. Instantiate the StringBuilder object (sb), initializing it
//     to firstName, using the StringBuilder constructor.
//2. Use the append method of the StringBuilder object to append the 
//     last name back onto the first name.  You can just use a String 
//     literal for the last name.  
//     Print the StringBuilder object and test your code.  
//     It should show the full name.
//
//Challenge:  Can you append the last name without using a String literal?
public class ShoppingCart {

    public static void main(String[] args) {
//        String custName = "Steve Smith";
//        String firstName;
//        int spaceIdx;
//        StringBuilder sb;
//       
//        spaceIdx = custName.indexOf(" ");
//        firstName = custName.substring(0, spaceIdx);
//        System.out.println(firstName);
//          
//	//Instantiate and initialize sb to firstName.
//        sb = new StringBuilder(firstName);
//	// Put the full name back together, using StringBuilder append method.
////        sb.append(" Smith");
//        sb.append(custName.substring(spaceIdx));
//	//   You can just enter the String literal for the last name.
//	//   Print the full name.
//        System.out.println(sb);
//
//        int count = 15;
//        int a, b, c, d;
//        a = count++;
//        System.out.println(count);
//        b = count;
//        c = ++count;
//        System.out.println(count);
//        d = count;
//        System.out.println(" a: " + a + " b: "+ b + " c: " + c + " d: " + d);
//         
//        System.out.println(a);
//        System.out.println(count);

//int num1 =55555;
//long num2=66666;
//
//long num3;
//        num3=num1*num2;
//        System.out.println(num3);
//        int num1 = 7;
//        double num2 = 2;
//        double num3;
//        num3 = (num1 / num2);
//        System.out.println(num3);
        //above , temp storage takes larger storage,if you have small storage you lose data.

        byte num1=1;
        byte num2=2;
        byte  num3;
        num3=(byte)(num1+num2);
        System.out.println(num3);
    }
}
