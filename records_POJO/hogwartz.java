package records_POJO;

public class hogwartz {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            PDCStudent firstYear = new PDCStudent(i,
                    switch(i){
                        case 1 -> "Harry";
                        case 2 -> "Hermione";
                        case 3 -> "Ron";
                        case 4 -> "Draco";
                        case 5 -> "Luna";
                        default -> "Anonamous";
                    },
                    switch(i){
                        case 1 -> "Gryphindor";
                        case 2 -> "Gryphindor";
                        case 3 -> "Gryphindor";
                        case 4 -> "Slytherin";
                        case 5 -> "Ravenclaw";
                        default -> "Anonamous";
                },
                    switch(i){
                        case 1 -> "Pheonix Hair";
                        case 2 -> "dragon heartstring core";
                        case 3 -> "unicorn hair";
                        case 4 -> "unicorn hair";
                        case 5 -> "ebony wood";
                        default -> "Anonamous";
                    });
            System.out.println(firstYear);
        }
        Student new1 = new Student(6,"Ishin","Ravenclaw","Pheonix Hair");
        PDCStudent new2 = new PDCStudent(7,"Isshin","Hupplepuff","Dragon Hair Mixed");

        System.out.println(new1.getName()+" is in "+new1.getHouse());
        System.out.println(new2.name()+ " is in "+new2.house());

        // for accessing getter or setter, in record we can simply use field name✅, as shown above - note : as record are immutable,
        // there are no setters ❌
    }
}
