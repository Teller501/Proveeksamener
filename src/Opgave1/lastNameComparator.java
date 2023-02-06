package Opgave1;

import java.util.Comparator;

public class lastNameComparator implements Comparator<HogwartsStudent> {

    public int compare(HogwartsStudent o1, HogwartsStudent o2) {
        return o1.getLastName().compareTo(o2.getLastName());
    }
}
