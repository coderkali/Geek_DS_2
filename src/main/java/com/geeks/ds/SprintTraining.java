package com.geeks.ds;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SprintTraining
    {
        public  static int GetMostVisited(int markerCount, int[] sprints)
        {
            int[] incremental = new int[markerCount + 2];
            for (int i = 0; i < sprints.length - 1; i++)
            {
                int start = Math.min(sprints[i], sprints[i + 1]);
                int end = Math.max(sprints[i], sprints[i + 1]);
                incremental[start]++;
                int temp = start;
                while(end!=start){
                    if(start==temp){
                        incremental[end]++;
                    }else{
                        incremental[start]++;
                    }
                    start++;
                }
            }




            int[] scores = new int[markerCount + 1];
            int score = 0;
            for (int i = 1; i < markerCount + 1; i++)
            {
                score += incremental[i];
                scores[i] = score;
            }

            Map<Integer,Integer> result = new HashMap<>();
            for (int i = 1; i < markerCount + 1; i++)
            {
                if (scores[i] > result.get(i))
                {
                    result = new HashMap(i, scores[i]);
                }
            }
            return result.get(0);
        }




        public static void main(String[] args) {
            int[] arr = {2,4,1,3};
            System.out.println(SprintTraining.GetMostVisited(5,arr));
        }

        //choclate  :: 15
        //cheese :: 300.90
        // tomato :: 23.44


    }
