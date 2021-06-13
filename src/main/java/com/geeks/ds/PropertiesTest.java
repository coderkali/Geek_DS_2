package com.geeks.ds;

import java.util.*;
import java.util.stream.Collectors;

public class PropertiesTest {

    public static void main(String[] args) {
        Properties properties = new Properties();
        properties.put("5","abc");
        properties.put("3","xyz");
        properties.put("2","pqr");
        properties.put("1","wer");
        properties.put("4","iop");

        HashMap<String,String> map = new HashMap<>();


        Set<Map.Entry<Object, Object>> entries = properties.entrySet();

        for (Map.Entry<Object, Object> entry : entries) {
            map.put(entry.getKey().toString(),entry.getValue().toString());
        }

        LinkedHashMap<String, String> collect = map.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue, LinkedHashMap::new));

    }


}
