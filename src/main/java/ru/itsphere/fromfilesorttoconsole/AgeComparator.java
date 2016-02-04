package ru.itsphere.fromfilesorttoconsole;

import java.util.Comparator;

/**
 * http://it-channel.ru/
 *
 * @author Budnikov Aleksandr
 */
public class AgeComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        Integer age1 = o1.getAge();
        Integer age2 = o2.getAge();
        return age1.compareTo(age2);
    }
}
