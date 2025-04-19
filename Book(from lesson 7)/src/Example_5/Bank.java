/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Example_5;

/**
 *
 * @author Reggi
 */
public class Bank {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int balance;
        Bank_Methods meth1 = new Bank_Methods();
        meth1.displayBalance();
        meth1.displayMain();
        meth1.deposit(250);
        meth1.displayBalance();
        meth1.withdraw(150);
        meth1.displayBalance();
        meth1.withdraw(150);
        meth1.displayBalance();
         meth1.withdraw(-150);
        meth1.displayBalance();
       
    }
    
}
