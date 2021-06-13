package com.geeks.ds.java8;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapvsFlatMap {

    public static void main(String[] args) {
        Map<String, List<String>>  map = new HashMap<>();
        map.put("a", Arrays.asList("test","test1","test3"));
        map.put("b", Arrays.asList("test2","test0","test4"));
        map.put("c", Arrays.asList("test6","test7","test8"));
        map.put("d", Arrays.asList("test11","test12","test13"));

        map.entrySet().stream().flatMap(s -> s.getValue().stream()).forEach(System.out::println);
        map.entrySet().stream().map(s -> s.getValue()).forEach(System.out::println);

        Employee e = new Employee();


        System.out.println(e.getId().toString());
    }
}

class Employee {

    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
