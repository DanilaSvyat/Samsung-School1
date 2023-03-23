package com.samsung;

import com.samsung.model.Person;
import com.samsung.sample.Set100Int;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class App {
    public static void main(String[] args) {

        Person person1 = new Person("Valera", 19);
        Person person2 = new Person("Valera1", 19);
        Person person3 = new Person("Valera2", 19);
        Person person4 = new Person("Valera", 11);
        Person person5 = new Person("Valera", 19);

        Set<Person> personSet = new HashSet<>();

        personSet.add(person1);
        personSet.add(person2);
        personSet.add(person3);
        personSet.add(person4);
        personSet.add(person5);

        System.out.println(personSet);

        Set<Person> personSet1 = new TreeSet<>(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return 0;
            }
        });

        personSet1.add(person1);




        /*Set100Int mySet = new Set100Int();

        mySet.add(88);
        mySet.add(7);

        System.out.println((mySet.contains(7)));
        System.out.println((mySet.contains(0)));

        System.out.println(mySet);

        mySet.add(7);
        mySet.remove(88);

        System.out.println(mySet);*/

    }
}
