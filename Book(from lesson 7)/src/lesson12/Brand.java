/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson12;

/**
 *
 * @author Reggi
 */
public class Brand extends Cars {

    private String wheeltype;

    public Brand(int price, String colour, String wheeltype) {
        super(price, colour);
        this.wheeltype = wheeltype;
    }

    public void showCar() {
        System.out.println("Your wheel type is" + this.wheeltype);
    };


    
    @Override
    public void showCarsPrice() {
        System.out.println("Your car price is : " + this.price);
    };
}
