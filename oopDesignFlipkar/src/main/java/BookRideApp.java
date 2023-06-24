import Entity.Branch;
import Entity.Constants;
import Entity.Driver;
import Entity.Vehicle;
import Service.BranchService;

import java.util.Arrays;

public class BookRideApp {
    public static void main(String args[]) {
        Driver driver = new Driver("USER1001", "John", "Doe", "9999", "");
        Driver driver2 = new Driver("USER1002", "Mike", "Brown", "9991", "");

        Vehicle vehicle = new Vehicle("VH1001", "KA01P1223", driver, Constants.Vehicle.MINI);
        Vehicle vehicle2 = new Vehicle("VH1002", "KA02P1223", driver, Constants.Vehicle.MINI);
        Branch branch = new Branch("BR1001", "KORMANGALA");

        BranchService branchService = BranchService.getInstance();

        branchService.addVehicle(branch, Arrays.asList(vehicle, vehicle2));

        BranchService branchService1 = BranchService.getInstance();

        Vehicle vehicle3 = new Vehicle("VH1002", "KA02P1223", driver, Constants.Vehicle.MINI);
        branchService1.addVehicle(branch, Arrays.asList(vehicle3));

        for(Vehicle vehicle1 : branchService1.getAllVehicles(branch)){
            System.out.println(vehicle1);
        }
    }
}
