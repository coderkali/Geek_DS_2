package com.geeks.ds;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TeamFormation2 {


    public static int countTeams(List<Integer> skills, int minPlayers, int minLevel, int maxLevel){
        int allowedPlayers=0;
        for(Integer playerSkill: skills)
        {
            if(playerSkill>=minLevel && playerSkill<=maxLevel)
                allowedPlayers++;
        }
        int x=allowedPlayers, c=1;
        int ans=0;
        for(int i=1;i<=allowedPlayers;++i){
            c=(c*(x-i+1))/i;
            if(i>=minPlayers)
                ans+=c;
        }
        return ans;
    }


    public static void main(String []args){
        List<Integer> skills = new ArrayList<>(
                Arrays.asList(12, 4 ,6, 13,5,10));
        int minLevel=4, maxLevel=10, minPlayers=3;


        System.out.println(countTeams(skills, minPlayers, minLevel, maxLevel));
    }
}
