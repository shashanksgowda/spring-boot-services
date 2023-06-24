import Entity.Group;
import Entity.Person;
import Services.BalanceService;
import Services.BillService;
import Services.GroupService;
import Services.PersonService;

import java.util.*;

public class SplitWiseApp {
    public static void main(String argsp[]){

        Scanner in = new Scanner(System.in);

        //Scenario 1
        Person person1 = new Person("user1", "email1");
        Person person2 = new Person("user2", "email2");

        PersonService personService = new PersonService();
        personService.addUser(person1.getUsername(), person1.getEmail());
        personService.addUser(person2.getUsername(), person2.getEmail());

        List<Person> personList = new ArrayList<>(){{
            add(person1);
            add(person2);
        }};
        Group group1 = new Group("group1", personList);

        GroupService groupService = new GroupService();
        groupService.createGroup(group1.getGroupID(), personList);

        Map<String, Double> split = new HashMap<>(){{
            put("email1", 100.0);
            put("email2", 200.0);
        }};

        Map<String, Double> contribution = new HashMap<>(){{
            put("email1", 300.0);
        }};

        BillService.getInstance().addBill(300, "group1", split, contribution);

        System.out.println(BalanceService.getInstance().printBalanceWithGroup("email1",  "group1"));

        //Scenario 2

        //Scenario 3

    }
}
