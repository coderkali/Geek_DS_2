package com.geeks.ds;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Optional;

public class FileClass {

    public static void main(String[] args) throws IOException {
        Optional<String> f = Optional.of("file1.java");
        File f1 = new File(f.get());
        FileOutputStream iout = new FileOutputStream(f1);

        new Runnable(){


            @Override
            public void run() {

            }
        };
    }
}
