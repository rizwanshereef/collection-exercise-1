package com.stackroute;

import java.util.ArrayList;
import java.util.Arrays;

/*Main Class to update and delete elements of an array list*/
public class Main {

    public static void main(String[] args) {
/*Storing strings as array of String*/
        String strn[] = {"Apple", "Grape", "Melon", "Berry"};
        /*Convert String array to ArrayList*/
        ArrayList<String> strnList = new ArrayList<>(Arrays.asList(strn));
        System.out.println("Actual Array: " + strnList);
/*Replacing elements*/
        int len = strnList.size();
        for (int i = 0; i < len; i++) {
            if (strnList.get(i).equals("Apple")) {
                strnList.set(i, "Kiwi");
            } else if (strnList.get(i).equals("Melon")) {
                strnList.set(i, "Mango");
            }

        }
        System.out.println("\nArray after updation: " + strnList);

        /*Clearing elements of the Array List*/
        strnList.clear();
        System.out.println("\nArray after removing all elements: " + strnList);
    }


}
