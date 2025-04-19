/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Example2;

/**
 *
 * @author Reggi
 */
public class Example {

    private int id;
    private String name;

    Example(String name,int id) {
        this.id = id;
        this.name = name;
    }

    ;
    
    public void setID(int id) {
        checksetID(id);
    };

    public int getID() {
        return this.id;
    }

     private void checksetID(int id) {
        if (id < 0) {
            System.out.println("Please put correct ID");
        } else {
            this.id = id;
            System.out.printf("\nYour ID is %d", id);
        }
    }

    public void showName() {
        System.out.println("your name is  :" + this.name);
    }

    public void showId() {
        System.out.println("your ID is :" + this.id);
    }
}
