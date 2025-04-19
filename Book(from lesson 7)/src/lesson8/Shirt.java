/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson8;

/**
 *
 * @author Reggi
 */
public class Shirt {

    public String description = "-description required";
    public char colourCode = 'U';
    public double price;

    public Shirt() {
        System.out.println("In Shirt Constructor");
        description = "-description required";
        colourCode = 'U';
        price = 0.0;
    }

    public void display() {
        System.out.println("Shirt Description: " + description);
        System.out.println("Shirt Colour Code : " + colourCode);
        System.out.println("Shirt price: " + price);

    }

};
