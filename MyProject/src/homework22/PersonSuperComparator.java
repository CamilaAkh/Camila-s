package homework22;

import java.util.Comparator;

public class PersonSuperComparator implements Comparator<Person> {

    public int compare(Person p1, Person p2) {
        int c = p1.getName().compareTo(p2.getName());
        if(c!=0){
            return c;
        }
        else {
            return (p1.getAge()-p2.getAge());
        }
    }
}
