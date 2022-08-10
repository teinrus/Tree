import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class PersonCompare<P> implements Comparator<Person> {
    int maxSize;

    public PersonCompare(int maxSize) {
        this.maxSize = maxSize;
    }

    @Override
    public int compare(Person o1, Person o2) {

        TreeSet<String> text = new TreeSet<>(List.of(o1.getSurname().split("\\P{IsAlphabetic}+")));
        TreeSet<String> text2 = new TreeSet<>(List.of(o2.getSurname().split("\\P{IsAlphabetic}+")));


        if (text.size() < maxSize || text2.size() < maxSize) {
            if (text.size() > text2.size()) {
                return -1;
            } else if (text.size() < text2.size()) {
                return 1;
            }
        }
        if (o1.getAge() > o2.getAge()) {
            return -1;
        } else if (o1.getAge() < o2.getAge()) {
            return 1;
        }
        return 0;

    }
}
