package com.geeks.ds;

public class PolicyTest {

    public static void main(String[] args) {
        Policy[] polices = {new Policy("Smith","Internal"),new Policy("Doe","Internal"),new Policy("John","Internal")};
        for(Policy policy : polices){
            if(policy.getType().equals("Internal")){
                System.out.println(policy.getName());
            }
        }
    }
}

class Policy {
    String name,type ;

    public Policy(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }
}
