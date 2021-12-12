package com.geeks.ds;

import java.util.stream.Stream;

public class StremTest {

    public static void main(String[] args) {
        Stream.of("R","O","B").peek(System.out::print).forEach(System.out::print);
    }
}
