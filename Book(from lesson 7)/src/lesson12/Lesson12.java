/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lesson12;

/**
 *
 * @author Reggi
 */
public class Lesson12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cars bmw = new Cars(2000,"Blue");
        Brand merc = new Brand(320,"Green","All wheel");
        bmw.showCarsPrice();
        merc.showCarsPrice();
        merc.showCar();
    }
    
}
