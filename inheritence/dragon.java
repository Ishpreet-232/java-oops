package inheritence;

public class dragon extends animal {

    //we need a default constructor to use super, as due to our own constructor, no implicit constructor is created
    public dragon(){
        super("dragon","humungous",18000);
    }
}
