package com.stackroute;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CatalogSortedListSearch {
/*Main method to implement Sort and Search*/
    public static void main(String[] args) {
        System.out.println(catalogListSearcher("[Nike, Puma, Adidas, Reebok, UnderArmour, NBalance, SuperDry] AND reebok"));
        String StrTwo = "Nike, Puma, Adidas, Reebok, UnderArmour, NBalance, SuperDry";
        List<String> listTwo = new ArrayList<String>(Arrays.asList(StrTwo.split(", ")));
        System.out.println("\n" + catalogListSorter(listTwo));
    }
/*Method to display string, convert to list, sort, search*/
    public static String catalogListSearcher(String strn) {
        String output = null;
        if (strn == null || strn.trim().isEmpty()) {
            output = "The catalog List contains empty or null or blank space as a value";
        } else {
            System.out.println(strn);
            String strnSub = strn.substring(strn.indexOf("[") + 1, strn.indexOf("]"));
            List<String> list = new ArrayList<String>(Arrays.asList(strnSub.split(", ")));
            Collections.sort(list);
            String value = strn.substring(strn.indexOf("AND") + 4, strn.length());
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).equalsIgnoreCase(value)) {
                    output = "Found: " + value;
                    break;
                } else {
                    output = "Not Found";
                }
            }
        }
        return output;
    }
/*Method to sort the list*/
    public static String catalogListSorter(List<String> list) {
        String output = "The Catalog list is empty";
        if (!list.isEmpty()) {
            Collections.sort(list);
            output = list.toString();
        }
        return output;
    }
}
