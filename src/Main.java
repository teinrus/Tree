
import java.util.*;

public class Main {
    public static void main(String[] args) {
        LinkedList<Person> person = new LinkedList<>();

        person.add(new Person("Vany", "Aramov", 12));
        person.add(new Person("Vany", "Ivanov", 12));
        person.add(new Person("Lena", "Ivanova", 15));
        person.add(new Person("Pety", "Petror Ogli ibn Ivanov", 2));
        person.add(new Person("Artut", "Abdurov ogli ibn", 3));

        Collections.sort(person, new PersonCompare<Person>(5));
        System.out.println(person);

        Collections.sort(person, new PersonCompare<Person>(2));
        System.out.println(person);
    }
}
