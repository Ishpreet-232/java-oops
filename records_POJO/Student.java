package records_POJO;

public class Student {
    private int id;
    private String name;
    private String house;
    private String wand;

    //Pojo ( plain old java object ) also known as bean or java bean ( which is a specific type of pojo )
    // it is also known as data entities, used for providing getter & setter functionality and storing data using private fields
    // due to such nature of code and repetitive code , this code is known as boilerplate code, having constructor & setter for each field

    public Student(int id, String name, String house, String wand) {
        this.id = id;
        this.name = name;
        this.house = house;
        this.wand = wand;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", house='" + house + '\'' +
                ", wand='" + wand + '\'' +
                '}';
    }
    //@ is used for annotations, they are nothing but metadata, which holds more info about the code and gives to compiler
    //@Override is overriden method, a special method, which other classes can implement if they use a specific method signature

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWand() {
        return wand;
    }

    public void setWand(String wand) {
        this.wand = wand;
    }

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }
}
