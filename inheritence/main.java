package inheritence;

public class main {
    public static void main(String[] args) {
        animal dog = new animal("dog","small",30);
        doAnimalStuff(dog,"20 km/hr");


        dragon d1 = new dragon();
        doAnimalStuff(d1,"80 km/hr");

    }
    public static void  doAnimalStuff(animal Animal, String speed){
        Animal.move(speed);
        Animal.makesNoise();
        System.out.println(Animal);
        System.out.println("- - - - - - - - - -");
    }
}
