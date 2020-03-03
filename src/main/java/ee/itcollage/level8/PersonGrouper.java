package ee.itcollage.level8;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PersonGrouper {

    // fix tests
    public static Map<String, Person> groupPeopleByIdCode(List<Person> people){
       Map<String, Person> result = new HashMap<String, Person>();
       for (Person person : people) {
           result.put(person.getIdCode(), person);
       }

       return result;
    }
}
