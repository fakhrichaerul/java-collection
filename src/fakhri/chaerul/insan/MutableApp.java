package fakhri.chaerul.insan;

import fakhri.chaerul.insan.data.Person;

public class MutableApp {
    public static void main(String[] args) {

        Person person = new Person("fakhri/chaerul/insan");

        person.addHobby("Naik Gunung");
        person.addHobby("Bersepeda");

//        doSomethingWithHobby(person.getHobbies());

        for (String hobby : person.getHobbies()) {
            System.out.println(hobby);
        }
    }

    //ERROR
//    public static void doSomethingWithHobby(List<String> hobbies) {
//        hobbies.add("bukan hobby");
//    }
}
