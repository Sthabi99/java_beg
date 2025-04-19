/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Example_5;

/**
 *
 * @author Reggi
 */
public class Bank_Methods {

    private int balance = 0;

    public void deposit(int amountD) {
        balance += amountD;
    }

    public void withdraw(int amountW) {
        if (amountW > balance) {
            System.out.println("Insufficient funds");}
            else if(amountW<0){System.out.println("invalid amount");}
         else if(amountW < balance){ balance -=amountW;}
    };


public int getBalance() {
        return balance;
    }

    public void displayBalance() {
        System.out.println("your balance is :" + balance);
    }

    public void displayMain() {
        System.out.println("Do you want to deposit,withdraw or check balance");
    }
};