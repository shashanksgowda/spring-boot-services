package javaapp.Entity;

public class Customer extends User {
    public Customer(String userId, String firstName, String lastName, String phone, String email){
        super(userId, firstName, lastName, phone, email);
        this.setUserType(Constants.User.DRIVER);
    }
}
