package fakhri.chaerul.insan;

import fakhri.chaerul.insan.data.Person;
import fakhri.chaerul.insan.data.PersonComparator;

import java.util.*;

public class SortedSetApp {
    public static void main(String[] args) {

        SortedSet<Person> people = new TreeSet<>(new PersonComparator().reversed());

        people.add(new Person("Fakhri"));
        people.add(new Person("Budi"));
        people.add(new Person("Susi"));

        for (Person person : people) {
            System.out.println(person.getName());
        }

        SortedSet<Person> sortedSet = Collections.unmodifiableSortedSet(people);
//        sortedSet.add(new Person("Fakhri")); // ERROR karna sudah dirubah unmodifiable
    }
}
