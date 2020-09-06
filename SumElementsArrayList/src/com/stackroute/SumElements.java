package com.stackroute;

import java.util.ArrayList;
import java.util.List;

public class SumElements {
/*Main method to add numbers of 2 array list */
    public static void main(String[] args) {
        int numOne[] = {1, 4, 6, 8, 20};
        int numTwo[] = {3, 5, 42, 8, 9, 98, 45, 65};
        /*Array to List conversion*/
        ArrayList<Integer> firstList = new ArrayList<>();
        ArrayList<Integer> secondList = new ArrayList<>();
        for (int i = 0; i < numOne.length; i++)
            firstList.add(new Integer(numOne[i]));
        for (int i = 0; i < numTwo.length; i++)
            secondList.add(new Integer(numTwo[i]));
        getSumOfListElements(firstList, secondList);
    }
/*Method to add the 2 lists*/
    public static void getSumOfListElements(List<Integer> firstList, List<Integer> secondList) {
        int len = 0, diff;
        System.out.println("The Elements of first list: "+firstList);
        System.out.println("The Elements of second list: "+secondList);
/*Check if the size of both the list are same or else make them same*/
        if (firstList.size() > secondList.size()) {
            len = firstList.size();
            diff = firstList.size() - secondList.size();
            for (int i = secondList.size(); i < firstList.size(); i++) {
                secondList.add(i, 0);
            }
        } else if (secondList.size() > firstList.size()) {
            len = secondList.size();
            diff = secondList.size() - firstList.size();
            for (int i = firstList.size(); i < secondList.size(); i++) {
                firstList.add(i, 0);
            }
        } else
            len = firstList.size();
/*Adding up the sum and check of there is any null elements on the array list*/
        List<Integer> thirdList = new ArrayList<>();
        for (int i = 0; i < len; i++) {
            if (firstList.get(i) == null) {
                thirdList = firstList;
            } else if (secondList.get(i) == null)
                thirdList = firstList;
            else {
                thirdList.add(firstList.get(i) + secondList.get(i));
            }
        }
        System.out.println("The third list after addition:"+thirdList);
    }
}
