package com.geeks.ds.java8programming;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;

public class Namer {

    final private String firstName,lastName;
    public Namer(String fn, String ln){
        firstName=fn;
        lastName=ln;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }


}

class Sorter {
    public static void main(String[] args) {
        Consumer<Namer> print = e -> System.out.println(e.getFirstName()+ " "+ e.getLastName());

        List<Namer> names = new ArrayList<>(Arrays.asList(new Namer("Harry","Smith"),
                new Namer("Joe","Smith"),new Namer("Jane","Doe"),
                new Namer("Mary","Jane"), new Namer("Harry","HomeOwner")));


//        Comparator<Namer> groupBy = Comparator.comparing(e -> e.getFirstName());
//        groupBy = groupBy.thenComparing(e -> e.getLastName());
//        names.removeIf(e -> e.getFirstName().equals("Mary"));
//        names.forEach(print);

        Collections.sort(names,(Namer e1,Namer e2) -> e1.getFirstName().compareTo(e2.getFirstName()));
        names.removeIf(e -> e.getFirstName().equals("Mary"));
        for(Namer e: names){
            System.out.println(e.getFirstName()+ " "+e.getLastName());
        }

//        Function<Namer,String> conv = i -> i.getFirstName();
//        Comparator<Namer> comparator = Comparator.comparing(conv);
//        names.sort(comparator.reversed());
//        names.forEach(print);

//        Collections.sort(names, (Namer e1, Namer e2) -> e1.getFirstName().compareTo(e2.getLastName()));
//        names.removeIf(e -> e.getFirstName().equals("Mary"));
//        names.forEach(s -> System.out.println(s.getFirstName()+ " "+ s.getLastName()));

//        Comparator<Namer> groupBy = Comparator.comparing(e -> e.getLastName());
//        groupBy = groupBy.thenComparing(e -> e.getFirstName());
//        names.removeIf(e -> e.getFirstName().equals("Mary"));
//        names.sort(groupBy);
//        names.forEach(print);



    }
}
