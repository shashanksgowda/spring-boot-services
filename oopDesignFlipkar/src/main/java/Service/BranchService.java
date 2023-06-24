package Service;

import Entity.Branch;
import Entity.Vehicle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class BranchService {

    private static BranchService branchService = null;

    private BranchService(){

    }

    public static BranchService getInstance(){
        if(branchService == null){
            return new BranchService();
        }
        return branchService;
    }
    public static HashMap<String, Branch> branches = new HashMap();

    public void add(Branch branch) {
        branches.put(branch.getId(), branch);
    }

    public void update(Branch branch) {
        this.add(branch);
    }

    public void remove(Branch branch) {
        branches.remove(branch.getId());
    }

    public void addVehicle(Branch branch, List<Vehicle> vehicle){
        if(Branch.vehicles.containsKey(branch.getId())){
            Branch.vehicles.get(branch.getId()).addAll(vehicle);
        } else {
            Branch.vehicles.put(branch.getId(), vehicle);
        }
    }

    public List<Vehicle> getAllVehicles(Branch branch){
       return Branch.vehicles.get(branch.getId());
    }
}
