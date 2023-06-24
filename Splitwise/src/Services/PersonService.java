package Services;

import Entity.Person;

import java.util.HashMap;

public class PersonService implements PersonServiceInterface {

    private static HashMap<String, Person> personList = new HashMap<>();

    public HashMap<String, Person> getPersonList() {
        return personList;
    }

    @Override
    public void addUser(String username, String email) {
        if(personList.containsKey(email)){
            System.out.println("Person Exists");
        } else {
            Person person = new Person(username, email);
            personList.put(email, person);
        }
    }
}
