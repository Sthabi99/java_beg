/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examples;

/**
 *
 * @author Reggi
 */
public class Employee {

    private String name;
    private int days;
    private double salary;

//    constructor
    public Employee(String name, int days) {
        this.name = name;
        this.days = days;
        calcSalary(days);
        System.out.println(salary);
    }

    public Employee(String name, int days, double salary) {
        this.name = name;
        this.days = days;
        calcSalary(days);

        System.out.println(salary);
    }

//    public void setEmployee(String name, int days) {
//        this.name = name;
//        this.days = days;
//    }
    public double calcSalary(int days) {
        salary = days * 75;

        return salary;

    }

    public void printSalary() {
        System.out.println(salary);
    }
}
