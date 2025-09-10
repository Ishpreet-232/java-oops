package constructor_Chaining_Overloading;

public class Customer {
    private String name;
    private double creditLimit;
    private String email;
    public Customer(){
        this("Ishin",10000.00,"ishin232@gmail.com");
        //constructor chaining can be done with this only
        System.out.println("Constructor with No args called!!");
        // as seen, constructor with no or less arguments can only call one with more arguments
        // this line is executed, the print statement
    }
    public Customer(String name,String email){
        this(name,20000.00,email);
        System.out.println("Constructor with 2 args called!!!");
    }
    public Customer(String name,double creditLimit,String email){
        this.name=name;
        this.creditLimit=creditLimit;
        this.email=email;
    }
    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
