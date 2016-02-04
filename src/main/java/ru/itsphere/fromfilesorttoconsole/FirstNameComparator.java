package ru.itsphere.fromfilesorttoconsole;

import java.util.Comparator;

/**
 * http://it-channel.ru/
 *
 * @author Budnikov Aleksandr
 */
public class FirstNameComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return o1.getFirstName().compareTo(o2.getFirstName());
    }
}
