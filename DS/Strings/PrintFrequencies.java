package Strings;

import java.util.Map;
import java.util.TreeMap;

public class PrintFrequencies {

    static void printFrequencies(String str) {
        int []count = new int[26];
        for(int i = 0; i< str.length();i++) {
            count[str.charAt(i)-'a'] ++;
        }
        for(int i = 0; i<count.length;i++) {
            if(count[i] >0) {
                System.out.println((char)(i+'a') + ": "+count[i]);
            }
        }
    }

    static TreeMap<Character,Integer> printFrequenciesUsingTreeMap(
            String str, TreeMap<Character,Integer> map,int start) {

        if(start >= str.length()) return map;
        if(map.containsKey(str.charAt(start))) {
           map.put( str.charAt(start),(map.get(str.charAt(start))+1));
        } else {
            map.put( str.charAt(start),1);

        }
        printFrequenciesUsingTreeMap (str, map,start+1);
        return map;

    }
    public static void main(String []args) {
       // printFrequencies("saiprashanthreddy");
        TreeMap<Character,Integer> map = printFrequenciesUsingTreeMap(
                "saiprashanthreddy",new TreeMap<>(),0);

        for(Map.Entry<Character,Integer> entry:map.entrySet()) {
               System.out.println(entry );
        }

    }
}
