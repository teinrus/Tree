
import java.util.*;

public class Main {
    public static void main(String[] args) {
        LinkedList<Person> person = new LinkedList<>();

        person.add(new Person("Vany", "Aramov", 12));
        person.add(new Person("Vany", "Ivanov", 12));
        person.add(new Person("Lena", "Ivanova", 15));
        person.add(new Person("Pety", "Petror Ogli ibn Ivanov", 2));
        person.add(new Person("Artut", "Abdurov ogli ibn", 3));



            Comparator <Person> personComparator = (Person o1, Person o2) -> {

            TreeSet<String> text = new TreeSet<>(List.of(o1.getSurname().split("\\P{IsAlphabetic}+")));
            TreeSet<String> text2 = new TreeSet<>(List.of(o2.getSurname().split("\\P{IsAlphabetic}+")));

            if (text.size() > text2.size()) {
                return -1;
            } else if (text.size() < text2.size()) {
                return 1;
            }
            if (o1.getAge() > o2.getAge()) {
                return -1;
            } else if (o1.getAge() < o2.getAge()) {
                return 1;
            }
            return 0;
        };



       Collections.sort(person,personComparator);
        System.out.println(person);

        Collections.sort(person, personComparator);
        System.out.println(person);
    }
}
