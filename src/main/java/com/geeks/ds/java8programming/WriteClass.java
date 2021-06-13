package com.geeks.ds.java8programming;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.stream.Stream;

public class WriteClass {

    public static void main(String[] args) throws IOException {
        File file = new File("Data.txt");
        FileWriter output = new FileWriter(file);
//        for(int i=0; i<5; i++){
//            file.setWritable(i);
//            file.toString();
//        }

        //Stream.of("0","1","2","3,"4). forEach(output::write);

        output.write(new char[]{'0', '1', '2', '3', '4'});

        output.flush();;

    }
}
