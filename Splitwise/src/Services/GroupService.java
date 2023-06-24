package Services;

import Entity.Bill;
import Entity.Group;
import Entity.Person;

import java.util.HashMap;
import java.util.List;

public class GroupService implements GroupServiceInterface{

    private static HashMap<String, Group> groupList = new HashMap();
    @Override
    public void createGroup(String groupId, List<Person> members) {
        if(groupList.containsKey(groupId)){
            System.out.println("Group name already exist");
        } else {
            //create a new group
            Group group = new Group(groupId, members);
            groupList.put(groupId, group);
        }
    }

    public Group getGroupByGroupId(String groupId) {
        return groupList.get(groupId);
    }
    public void addBill(String groupId, Bill bill){
        Group tmpGroup = groupList.get(groupId);
        tmpGroup.getBills().add(bill);
    }
    public HashMap<String, Group> getGroupList() {
        return groupList;
    }
}
