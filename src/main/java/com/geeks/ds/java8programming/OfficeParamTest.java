package com.geeks.ds.java8programming;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OfficeParamTest {

    public static void main(String[] args) {
        List<Map<List<Integer>,List<String> >> oficeParamList = new ArrayList<>();
        Map<List<Integer>,List<String>> officeParamMap = new HashMap<>();
        oficeParamList.add(null);
        oficeParamList.add(officeParamMap);
        oficeParamList.add(new HashMap<List<Integer>,List<String>>());

        oficeParamList.forEach(e -> System.out.println(e+ " "));


    }
}
