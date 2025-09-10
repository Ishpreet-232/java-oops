package constructor_Chaining_Overloading;

public class index {
    public static void main(String[] args) {
        Customer C1 = new Customer(); // created an object( or instance ) of customer class
        // c1 references to the object created, for example new constructor_Chaining_Overloading.Customer(); creates instance of class but with no reference to it
        System.out.println(C1.getCreditLimit());
    }
}
