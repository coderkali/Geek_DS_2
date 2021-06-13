package com.geeks.ds.java8;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.Buffer;
import java.util.Arrays;

public class SendDocument {
    {
        System.out.println("In Send Document");
    }

    public SendDocument() {
        System.out.println("Start To Send Document");

    }

}

class EmailDocument extends SendDocument {
    static {
        System.out.println("In EmailDocument");
    }

    public EmailDocument() {
        System.out.println("Start to Email DOcument");
    }

    {
        System.out.println("Email Document Is Progress");
    }

    static {
        System.out.println("Email Document IS Complete");
    }
}

class ProcessDocument extends EmailDocument {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("The Process Document Before End");
        new ProcessDocument();
        System.out.println("Document has been processed and send");


        Arrays.asList("red","green","blue")
                .stream()
                .filter(s -> !s.startsWith("b"))
                .forEach(System.out::println);


        BufferedReader inputstream = new BufferedReader(new FileReader("tt"));




    }
}
