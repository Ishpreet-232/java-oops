package static_Instance;

public class chess {
    private  String name;

    public chess(String name){
        this.name=name;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void candidates(String a, String b){
        if(a.length()>b.length()){
            System.out.println(a+" is more likely to win the candidates");
        }
        else{
            System.out.println(b+" is more likely to win the candidates");
        }
    }
}
