package Services;

import Entity.Bill;
import Entity.Group;
import Entity.Person;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BalanceService implements BalanceServiceInterface {

    private static BalanceService balanceService;

    public static BalanceService getInstance(){
        if(balanceService == null){
            return new BalanceService();
        }
        return balanceService;
    }

    @Override
    public double printBalanceWithGroup(String email, String groupId) {

        PersonService personService = new PersonService();
        HashMap<String, Person> personList = personService.getPersonList();

        double toGive = 0;

        if (!personList.containsKey(email)) {
            System.out.println("Invalid User");
            return -1;
        } else {
            GroupService groupService = new GroupService();
            Group group = groupService.getGroupByGroupId(groupId);
            List<Bill> bills = group.getBills();

            for (Bill bill : bills) {
                if (bill.getTotal() != 0 && bill.getSplit().size() != 0) {
                    double eachShare = bill.getTotal() / bill.getSplit().size();
                    double temp = 0;
                    //calculate split
                    /*HashMap<String, Double> expenses = (HashMap<String, Double>) bill.getSplit();
                    if (expenses.size() > 0) {
                        for (Map.Entry<String, Double> entry : expenses.entrySet()) {
                            if (entry.getKey().equalsIgnoreCase(email)) {
                                temp = eachShare - entry.getValue();
                                break;
                            }
                        }
                        toGive += temp;
                    }*/
                    //Calculate contributions
                    HashMap<String, Double> contribution = (HashMap<String, Double>) bill.getPaidBy();
                    if (contribution.size() > 0) {
                        for (Map.Entry<String, Double> entry : contribution.entrySet()) {
                            if (entry.getKey().equalsIgnoreCase(email)) {
                                temp = eachShare - entry.getValue();
                                break;
                            }
                        }
                        toGive += temp;
                    }

                }
            }
        }
        return toGive;
    }

    @Override
    public double printBalanceWithAnotherPerson(String firstPersonId, String secondPersonId) {
        return 0;
    }

    @Override
    public double printBalanceAcrossAllGroups(String personId) {
        return 0;
    }
}
