package com.geeks.ds.monthlycost;

import java.util.ArrayList;

public interface OnlineAccount {

    int baseprice=120;
    int regularMoviePrice=45;
    int exclusiveMoviePrice=80;



}

class Account implements OnlineAccount, Comparable<Account>{

    int noOfRegularMovies,noOfExclusiveMovies;
    String ownerName;


    public Account(String ownerName,int noOfExclusiveMovies,int noOfRegularMovies) {
        this.noOfRegularMovies = noOfRegularMovies;
        this.noOfExclusiveMovies = noOfExclusiveMovies;
        this.ownerName = ownerName;
    }

    public int monthlyCost(){
        int monthlyCOst = baseprice+ (noOfRegularMovies*regularMoviePrice) + (noOfExclusiveMovies*exclusiveMoviePrice);
        return monthlyCOst;
    }

    @Override
    public int compareTo(Account o) {
        int currentMonthLyCost = this.monthlyCost();
        int accountMonthlyCOst = o.monthlyCost();
        if(currentMonthLyCost == accountMonthlyCOst){
            return 0;

        }
        if(currentMonthLyCost>accountMonthlyCOst){
            return 1;
        }
        return -1;
    }

    public String toString(){
        return "Owner is "+ownerName+" and monthly cost is "+monthlyCost()+" USD.";

    }


    public static void main(String[] args) {

        String str= "aef";
        String str2 = "axz";

        System.out.println(str.contains(str2));

        ArrayList<Account> accounts = new ArrayList<>();
       Account accoun1=  new Account("Frank",12,6);
        System.out.println(accoun1.monthlyCost());
        Account accoun2=  new Account("David",7,19);
        System.out.println(accoun2.monthlyCost());
        Account accoun3=  new Account("Karen",14,4);
        System.out.println(accoun3.monthlyCost());


        accounts.add(new Account("Frank",12,6));
        accounts.add(new Account("David",7,19));
        accounts.add(new Account("Karen",14,4));



    }
}
