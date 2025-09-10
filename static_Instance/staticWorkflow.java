package static_Instance;

public class staticWorkflow {
    public static void main(String[] args) {
        chess india = new chess("Praggnanandha Rameshbabu");
        chess america = new chess("Fabiano Caruana");
        System.out.println(india.getName());
        System.out.println(america.getName());
        /* result is Fabiano Caruana two times, why??
        * static variable does not create a new instance each time, rather shares it, so when it is modified it remains same
        * this could be useful for defining constant like pi, log or even use in databases, but most of the time, instance is better
        * just by removing static from name in chess, now it's an instance variable, which creates diff instances and stores value
        * so result is both names of pragg and fabi
        */
        chess.candidates("Praggnanandha","Fabiano");
        /* what this statement does, it call a static method, by definition - static void does not need to be initialised
        * no need to use new keyword, they are used when there is no need to use instance variables
        * they can be called just by using class name. method name
         */
    }
}
