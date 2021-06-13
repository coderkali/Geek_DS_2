package com.geeks.ds;

import java.util.HashMap;
import java.util.Objects;

public class HashMapPersonTest {
    private String surName;
    private String name;

    public HashMapPersonTest(String surName, String name) {
        this.surName = surName;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HashMapPersonTest that = (HashMapPersonTest) o;
        return Objects.equals(surName, that.surName) && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(surName, name);
    }

    public static void main(String[] args) {
        HashMap<HashMapPersonTest,String> personTestStringHashMap = new HashMap<>();
        HashMapPersonTest t1 = new HashMapPersonTest("Smith","John");
        HashMapPersonTest t2 = new HashMapPersonTest("Smith","John");

        personTestStringHashMap.put(t2,"person1");
        System.out.println(personTestStringHashMap.get(t1));

    }
}
