package Entity;

public class Vehicle {
    private String id;
    private String licenseNum;
    private Driver driver;
    Constants.Vehicle vehicleType;

    public Vehicle(){

    }
    public Vehicle(String id, String licenseNum, Driver driver, Constants.Vehicle vehicleType){
        this.id = id;
        this.licenseNum = licenseNum;
        this.vehicleType = vehicleType;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLicenseNum() {
        return licenseNum;
    }

    public void setLicenseNum(String licenseNum) {
        this.licenseNum = licenseNum;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Constants.Vehicle getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(Constants.Vehicle vehicleType) {
        this.vehicleType = vehicleType;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "id='" + id + '\'' +
                ", licenseNum='" + licenseNum + '\'' +
                ", driver=" + driver +
                ", vehicleType=" + vehicleType +
                '}';
    }
}
