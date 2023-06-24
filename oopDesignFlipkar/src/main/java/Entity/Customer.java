package Entity;

public class Customer extends User {
    public Customer(){
        super();
        this.setUserType(Constants.User.DRIVER);
    }
}
