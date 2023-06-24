package Entity;

public abstract class User {
    private String userId;
    private String firstName;
    private String lastName;
    private String phone;
    private String email;
    private Constants.User userType;

    public User(String userId, String firstName, String lastName, String phone, String email) {
        this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.email = email;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Constants.User getUserType() {
        return userType;
    }

    public void setUserType(Constants.User userType) {
        this.userType = userType;
    }
}
