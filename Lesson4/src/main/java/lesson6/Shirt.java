/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson6;

/**
 *
 * @author Reggi
 */
public class Shirt {

    public int shirtID;
    public double price;
    public char colourCode;

    public static void main(String[] args) {
        int counter = 10;
        Shirt myShirt = new Shirt();
        Shirt yourShirt = new Shirt();

        myShirt.shirtID = 12;
        myShirt.price = 15.99;
        myShirt.colourCode = 'B';

        yourShirt.shirtID = 12;
        yourShirt.price = 15.99;
        yourShirt.colourCode = 'B';

        myShirt = yourShirt;

        myShirt.colourCode = 'R';
        yourShirt.colourCode = 'G';

        System.out.println(myShirt.colourCode);
    }

}
