package Entity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Group {

    private static List<Person> personList = new ArrayList<>();

    private static List<Bill> bills = new ArrayList<>();

    private String groupID;
    private double totalContribution;
    private HashMap<String, Person> individualContribution;

    public Group(){

    }

    public Group(String groupID, List<Person> personList) {
        this.groupID = groupID;
        this.personList = personList;
    }


    public String getGroupID() {
        return groupID;
    }

    public void setGroupID(String groupID) {
        this.groupID = groupID;
    }

    public double getTotalContribution() {
        return totalContribution;
    }

    public void setTotalContribution(double totalContribution) {
        this.totalContribution = totalContribution;
    }

    public HashMap<String, Person> getIndividualContribution() {
        return individualContribution;
    }

    public void setIndividualContribution(HashMap<String, Person> individualContribution) {
        this.individualContribution = individualContribution;
    }

    public static List<Person> getPersonList() {
        return personList;
    }

    public static List<Bill> getBills() {
        return bills;
    }



    @Override
    public String toString() {
        return "Group{" +
                "groupID='" + groupID + '\'' +
                ", personList=" + personList +
                ", totalContribution=" + totalContribution +
                ", individualContribution=" + individualContribution +
                '}';
    }
}
