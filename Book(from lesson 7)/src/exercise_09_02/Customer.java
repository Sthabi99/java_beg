package exercise_09_02;

public class Customer {

    private String name;
    private String ssn;

    public Customer(String name, String ssn) {
        this.name = name;
        this.ssn = ssn ;
    
    }

    ;
    
    
    //Add a custom constructor
    
    
    public String getName() {
        return name;
    }

//    public void setName(String n) {
//        name = n;
//    }

    public String getSSN() {
        return ssn;
    }
}
