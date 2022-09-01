import java.util.Comparator;

public class PersonCompare<P extends Person> implements Comparator<P> {
    int maxSize;

    public PersonCompare(int maxSize) {

        this.maxSize = maxSize;
    }

    @Override
    public int compare(P o1, P o2) {

        if (o1.getSurname().split("\\P{IsAlphabetic}+").length<=maxSize||
                o2.getSurname().split("\\P{IsAlphabetic}+").length<=maxSize) {
            if (o1.getSurname().split("\\P{IsAlphabetic}+").length >
                    o2.getSurname().split("\\P{IsAlphabetic}+").length) {
                return -1;
            } else if (o1.getSurname().split("\\P{IsAlphabetic}+").length <
                    o2.getSurname().split("\\P{IsAlphabetic}+").length) {
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