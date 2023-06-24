package Services;

public interface BalanceServiceInterface {

    //Person to group
    double printBalanceWithGroup(String email, String groupId);

    double printBalanceWithAnotherPerson(String firstPersonId , String secondPersonId);

    double printBalanceAcrossAllGroups(String personId);

}
