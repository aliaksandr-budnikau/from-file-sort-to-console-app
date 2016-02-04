package ru.itsphere.fromfilesorttoconsole;

import java.util.Comparator;

/**
 * http://it-channel.ru/
 *
 * @author Budnikov Aleksandr
 */
public class SecondNameComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return o1.getSecondName().compareTo(o2.getSecondName());
    }
}
