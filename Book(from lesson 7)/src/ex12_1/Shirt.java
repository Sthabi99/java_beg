/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex12_1;

/**
 *
 * @author Reggi
 */
public class Shirt extends Item {

    private char size;
    private char gender;

    public Shirt(char size, char gender) {
        super(id, desc, price, nextId);
        setSize(size);
        setGender(gender);

    }
public Shirt() {
        super(id, desc, price, nextId);
        setSize('A');
        setGender('N');

    }
    private void setSize(char size) {
        this.size = size;
    }

    public char getSize() {
        return size;
    }

    private void setGender(char gender) {
        this.size = size;
    }

    public char getGender() {
        return gender;
    }

    public void displayShirt() {
        System.out.println("\tSize: " + getSize());
        System.out.println("\tGender: " + getGender());
    }
}
