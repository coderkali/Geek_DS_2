package com.geeks.ds;

public class LongestDIverseString {

    public static String longestDiverseStrings(int a, int b, int c) {
        char[] chars = new char[] {'a', 'b', 'c'};
        int[] counter = new int[] { a, b, c};
        StringBuilder sb = new StringBuilder();
        int index = -1;
        int newIndex = -1;
        int exclude = -1;
        while ((newIndex = nextIndex(counter, exclude)) >= 0) {
            exclude = newIndex == index ? newIndex : -1;
            index = newIndex;
            sb.append(chars[index]);
            counter[index]--;
        }

        switch (index){
            default:

        }

        return sb.toString();
    }

    private static int nextIndex(int[] counter, int exclude) {
        int index = -1;
        for (int i = 0; i < counter.length; i++) {
            if (i == exclude) continue;
            else if (counter[i] > 0) {
                if (index == -1 || counter[i] > counter[index]) index = i;
            }
        }
        return index;
    }

//    public static String longestDiverseStrings(int a, int b, int c) {
//        StringBuilder res = new StringBuilder();
//        Map<Character,Integer> kk = new HashMap<>();
//        if(a!=0)
//            kk.put('a',a);
//        if(b!=0)
//            kk.put('b',b);
//        if(c!=0)
//            kk.put('c',c);
//        PriorityQueue<Character> rs= new PriorityQueue<>(new Comparator<Character>(){
//            public int compare(Character a,Character b) {
//                return kk.get(b) - kk.get(a);
//            }
//        });
//        rs.addAll(kk.keySet());
//        while(!rs.isEmpty()){
//            int s = res.length();
//            char cur = rs.poll();
//            if(s-1>=0 && s-2>=0 && res.charAt(s-1) ==cur && res.charAt(s-2) == cur) {
//                if(rs.size()>0){
//                    char nc = rs.poll();
//                    res.append(nc);
//                    int count = kk.get(nc)-1;
//                    if(count <= 0){
//                        kk.put(nc,count);
//                        rs.add(cur);
//                    } else {
//                        kk.put(nc,count);
//                        rs.add(nc);
//                        rs.add(cur);
//                    }
//                }
//
//            } else{
//                int count = kk.get(cur);
//                if(count>=2) {
//                    count-=2;
//                    res.append(cur);
//                    res.append(cur);
//                    kk.put(cur,count);
//                    if(count > 0)
//                        rs.add(cur);
//                }
//                else if(count == 1) {
//                    res.append(cur);
//                    count-=1;
//                    kk.put(cur,count);
//                }
//                else if(count <= 0){
//                    kk.put(cur,count);
//                }
//            }
//
//        }
//        return res.toString();
//    }

    public static void main(String[] args) {
        System.out.println(longestDiverseStrings(6,1,1));
        System.out.println(longestDiverseStrings(1,3,1));
        System.out.println(longestDiverseStrings(0,1,8));
    }
}
