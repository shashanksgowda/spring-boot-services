package Entity;

public class Driver extends User{

    public Driver(String userId, String firstName, String lastName, String phone, String email){
        super(userId, firstName, lastName, phone, email);
        this.setUserType(Constants.User.DRIVER);
    }
}
