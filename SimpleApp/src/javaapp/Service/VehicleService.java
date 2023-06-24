package javaapp.Service;

import javaapp.Entity.Vehicle;

import java.util.HashMap;

public class VehicleService {

    public static HashMap<String, Vehicle> vehicles = new HashMap();

    public void add(Vehicle vehicle){
        vehicles.put(vehicle.getId(), vehicle);
    }
    public void update(Vehicle vehicle){
        this.add(vehicle);
    }
    public void Delete(Vehicle vehicle){
        vehicles.remove(vehicle.getId());
    }
}
