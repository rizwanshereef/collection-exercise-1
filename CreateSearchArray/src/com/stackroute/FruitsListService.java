package com.stackroute;

import java.util.*;
/*Main class to add and search the elements on the list*/
public class FruitsListService {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String strn = "Apple,apple,Orange,banana,Banana";
        ArrayList<String> list= addFruitsToList(strn);
        System.out.println("Enter the value to be searched case Sensitive:");
        String value = scan.nextLine();
        if(searchFruitList(list,value)==0){
            System.out.println("Element not found");
        }
        System.out.println("\nEnter the value to be searched case insensitive:");
        String valueTwo = scan.nextLine();
        if(!searchFruitListIgnoreCase(valueTwo,list)){
            System.out.println("Element not found");
        }

    }
/*Method to add the string to the list without adding duplicate elements*/
    public static ArrayList<String> addFruitsToList(String strn) {

        String strnLow = strn.toLowerCase();
        ArrayList<String> list = new ArrayList<>(Arrays.asList(strnLow.split(",")));
        ArrayList<String> listOne = new ArrayList<>(Arrays.asList(strn.split(",")));
        for(int i=0,j=0; i<list.size();i++,j++)
        {
            if(list.get(i).contains(list.get(i+1))){
                listOne.remove(i+1);
                list.remove(i+1);
            }
        }
        System.out.println(listOne);
        return  listOne;
    }
/*Method to search case sensitive String on the list*/
    public static int searchFruitList(List<String> list, String value){
        int post = 0;
        int flag =0;
        for(int i =0; i<list.size();i++){
            if(list.get(i).equals(value)){
                post =i;
                flag=1;
                break;
            }
            else
                flag =0;
        }
        if(flag ==1)
            System.out.println("Element "+value +" found at Index: "+post);
        return flag;
    }
    /*Method to search case insensitive String on the list*/
    public static boolean searchFruitListIgnoreCase(String valueTwo, List<String> list)
    {
        for(int i =0; i<list.size();i++)
        {
            if(list.get(i).equalsIgnoreCase(valueTwo))
            {
                System.out.println("Element "+valueTwo +" found at Index: "+i);
                return(true);

            }
        }
        return(false);
    }
}