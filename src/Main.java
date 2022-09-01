import java.util.Collections;
import java.util.LinkedList;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        LinkedList<Person> person = new LinkedList<>();

        person.add(new Person("Vany", "Aramov", 18));
        person.add(new Person("Vany", "Ivanov", 12));
        person.add(new Person("Lena", "Ivanova", 19));
        person.add(new Person("Pety", "Petror Ogli ibn Ivanov", 2));
        person.add(new Person("Artut", "Abdurov ogli ibn", 3));

        Collections.sort(person, new PersonCompare<>(5));
        System.out.println(person);

        Collections.sort(person, new PersonCompare<>(2));
        System.out.println(person);

        Predicate<Person> personPredicate = pers -> pers.getAge() < 18;

        person.removeIf(personPredicate);
        System.out.println(person);
    }
}
