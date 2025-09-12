package inheritence;

public class dragon extends animal {

    private String wingsStructure;
    private String scaleDurability;

    //we need a default constructor to use super, as due to our own constructor, no implicit constructor is created
    public dragon(String type, double weight){
        this(type,weight,"Bat Like","As tough as Steel"); // here we are using constructor chaining
    } // default values of wings and scale if not given

    public dragon(String type, double weight, String wingsStructure, String scaleDurability) {
        super(type,weight<5000 ? "Small" : (weight<10000 ? "Medium" : "Large"), weight); // has to be the first line
        this.wingsStructure = wingsStructure;
        this.scaleDurability = scaleDurability;
    }

    @Override
    public String toString() {
        return "dragon{" +
                "scaleDurability='" + scaleDurability + '\'' +
                ", wingsStructure='" + wingsStructure + '\'' +
                "} " + super.toString(); // this calls the toString() from the animal class
    }

    //this shows that whenever we create an object of a class, jvm knows that it's more specific than Animal
    public void makesNoise(){ //this method is overriding the one in the base class, used to show different behaviour

    }

    @Override
    public void move(String speed) {
        super.move(speed);
        System.out.println("Dragons can fly, breath fire and protect or destroy like a tank");
        breathFire();
        fly();
    }

    private void breathFire(){
        System.out.println("Roaaarrrrr!");
    }

    private void fly(){
        System.out.println("Woossshhh!!");
    }
}
