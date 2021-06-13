package com.geeks.ds.hackerrank;

import java.util.HashMap;
import java.util.Objects;

public class Person {
    private String surname;
    private String name;

    public Person(String surname, String name) {
        this.surname = surname;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return surname.equals(person.surname) && name.equals(person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(surname, name);
    }

    public static void main(String[] args) {
        HashMap<Person,String> personStringHashMap = new HashMap<>();
        Person person1 = new Person("Smith","John");
        Person person2 = new Person("Smith","John");

        personStringHashMap.put(person1,"person1");
        System.out.println(personStringHashMap.get(person2));
    }
}
