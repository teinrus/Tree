import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class PersonCompare<P> implements Comparator<Person> {
    int maxSize;

    public PersonCompare(int maxSize) {
        this.maxSize = maxSize;
    }

    @Override
    public int compare(Person o1, Person o2) {

        List<String> text = new ArrayList<>(List.of(o1.getSurname().split("\\P{IsAlphabetic}+")));
        List<String> text2 = new ArrayList<>(List.of(o2.getSurname().split("\\P{IsAlphabetic}+")));


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
