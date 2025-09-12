package inheritence;

public class main {
    public static void main(String[] args) {
        animal dog = new animal("dog","small",30);
        doAnimalStuff(dog,"20 km/hr");


        dragon d1 = new dragon("Hydra",4000);
        doAnimalStuff(d1,"80 km/hr");

        dragon d2 = new dragon("Wvyren",5500,"Kite like","As hard as Obsidian");
        doAnimalStuff(d2,"120 km/hr");
    }
    public static void  doAnimalStuff(animal Animal, String speed){
        Animal.move(speed);
        Animal.makesNoise();
        System.out.println(Animal);
        System.out.println("- - - - - - - - - -");
    }
}
