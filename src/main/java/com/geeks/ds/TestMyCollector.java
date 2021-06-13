package com.geeks.ds;

import java.util.AbstractMap;
import java.util.List;
import java.util.TreeMap;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestMyCollector {

    public static void main(String[] args) {
        Collector<String,?, AbstractMap<Integer,String>> myColector =
                Collector.of(TreeMap::new,
                        (s,t) -> s.put(t.length(),t.toLowerCase()),
        (x,y) -> { x.putAll(y); return x;});
        AbstractMap<Integer,String> coll;

        coll = Stream.of("Bob","Carol","Ted","Bob","Alice").collect(myColector);

        coll.forEach((k,v) -> System.out.println(k + ":"+ v));




    }

}
