package Services;

import Entity.Person;

import java.util.List;

public interface GroupServiceInterface {
    void createGroup(String groupId, List<Person> members);
}
