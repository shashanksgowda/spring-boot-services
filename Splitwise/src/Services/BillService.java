package Services;

import Entity.Bill;
import Entity.Group;

import java.util.Map;

public class BillService {

    private BillService(){

    }
    private static BillService billService;

    public static BillService getInstance(){
        if(billService == null){
            return new BillService();
        }
        return billService;
    }

    public void addBill(double total, String groupId, Map<String, Double> split, Map<String, Double> paidby) {
        Bill bill = new Bill(total, groupId);
        GroupService groupService = new GroupService();
        Group group = groupService.getGroupByGroupId(groupId);
        if(group == null){
            System.out.println("invalid Group name");
        } else {
            bill.getSplit().putAll(split);
            bill.getPaidBy().putAll(paidby);
            groupService.addBill(groupId, bill);
        }

    }
}
