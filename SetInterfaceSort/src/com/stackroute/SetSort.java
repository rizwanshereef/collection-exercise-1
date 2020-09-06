package com.stackroute;

import java.util.*;

public class SetSort {

    public static void main(String[] args) {
        Set<String> str = new HashSet<String>();
        /*Adding string to Set*/
        str.add("Harry");
        str.add("Olive");
        str.add("Alice");
        str.add("Bluto");
        str.add("Eugene");
        System.out.println("String in HashSet: \n" + str);
        /*Converting hashSet to TreeSet for sorting*/
        TreeSet<String> treeSet = new TreeSet<>(str);
        System.out.println("\nString sorted using TreeSet: \n" + treeSet);
        int len = treeSet.size();
        /*Converting Set to List*/
        ArrayList<String> strList = new ArrayList<String>();
        for (String strOne : treeSet) {
            strList.add(strOne);
        }
        System.out.println("\nString after converting to ArraayList:\n" + strList);

    }
}
