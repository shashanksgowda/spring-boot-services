package javaapp;

import javaapp.Entity.Branch;
import javaapp.Entity.Constants;
import javaapp.Entity.Driver;
import javaapp.Entity.Vehicle;
import javaapp.Service.BranchService;

import java.util.ArrayList;
import java.util.Arrays;

public class BookRideApp {
    public static void main(String args[]) {
        Driver driver = new Driver("USER1001", "John", "Doe", "9999", "");
        Driver driver2 = new Driver("USER1002", "Mike", "Brown", "9991", "");

        Vehicle vehicle = new Vehicle("VH1001", "KA01P1223", driver, Constants.Vehicle.MINI);
        Vehicle vehicle2 = new Vehicle("VH1002", "KA02P1224", driver2, Constants.Vehicle.MINI);
        Branch branch = new Branch("BR1001", "KORMANGALA");

        BranchService branchService = BranchService.getInstance();

        ArrayList temp = new ArrayList() {{
           add(vehicle);
           add(vehicle2);
        }};
        branchService.addVehicle(branch, temp);

        BranchService branchService1 = BranchService.getInstance();

        Vehicle vehicle3 = new Vehicle("VH1003", "KA02P1225", driver, Constants.Vehicle.MINI);

        temp = new ArrayList();
        temp.add(vehicle3);
        branchService1.addVehicle(branch, temp);

        for(Vehicle vehicle1 : branchService1.getAllVehicles(branch)){
            System.out.println(vehicle1);
        }
    }
}
