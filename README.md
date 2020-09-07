# Collection Exercises 04/09/2020

### Program 1:

Write a Java program to update the specific array element by given element and empty the array list .

*Input: [Apple, Grape, Melon, Berry]
Output: [Kiwi, Grape, Mango, Berry]
Array list after removing all elements [ ]*

  

### Program 2:

Problem Statement: Create ArrayList and Search elements in the List

Define the below static methods in class `FruitsListService`:

  

-   **addFruitsToList(String)** : List<String>
    

	-   Should take a String input containing names of fruits separated by comma(see below), and display a List of the Fruit names    
*"apple,mango,Cherry"*

	-   Should not add duplicate fruits to the list (Same fruit name in upper/lower/mixed should be also considered duplicates)
    

  

 - **searchFruitInList(List<String>, String)** : int
    

  

	 - Should take a fruit list and fruit name to be searched as parameters
    
   - Should display the index of the fruit in the list, if it's found
    
   - Should display “not found”, if the fruit is not found
    
	- Should do a "case-sensitive" search
    

-   **searchFruitInListIgnoreCase(List<String>, String)** : int

	   - Should take a fruit list and fruit name to be searched as parameters
       - Should display the index of the fruit in the list, if it's found
       - Should display “not found”, if the fruit is not found
	    - Should do a "case-insensitive" search
    

### Program 3:

Write a program to calculate the sum of elements of two input arraylists.

  
  

-   **getSumOfListElements(List<Integer> firstList, List<Integer> secondList)**
    
	    -  This method displays the List with the sum of elements of two input lists
    

- Rules

	-   An element in the final displayed list is the sum of elements in input lists at the same index.
    

	-   For example, if L1 and L2 are input lists, and L3 is the final list, then L3.get(n) must be equal to the sum of L1.get(n) and L2.get(n).
    
	-   The sizes of both Lists may differ.
    
	-   Assuming that the sizes of both lists are 's1' and 's2', the new list should be of size equals to largest of s1 and s2.

	-   If L1 is larger than L2 then the last (s1-s2) elements in the returned list should be same as the corresponding elements in the list L1
	-   If any of the list is null, it should be considered as empty list

### Program 4:

Write a program to implement a set interface which sorts the given randomly ordered names in ascending order. Convert the sorted set in to an array list

*Input : Harry Olive Alice Bluto Eugene
Output :
Sorted Set : Alice Bluto Eugene Harry Olive
Array list from Set : Alice Bluto Eugene Harry Olive*

### Program 5:

Given a catalog list and search value, sort the list and search for the given value in sorted list

Create a class named `CatalogSortedListSearch` with the following methods:

+**catalogListSearcher(String)** : String

	- Should take a String as input and display a string as result

	- Should display an error message when the String is null or empty or blank space

	- Should iterate the sorted list to check String existence and display Found or Not Found

+**catalogListSorter(List<String>)** : String

	- Should validate the List and return error message when it is null or empty and contains value like empty or blank space or null

	- Should sort the List using Collections

	- Should return the global class List variable

  

*Example: Sample Input:
[Nike, Puma, Adidas, Reebok, UnderArmour, NBalance, SuperDry] AND reebok
Expected Output:
Found: Reebok
  
Sample Input:
[Nike, Puma, Adidas, Reebok, UnderArmour, NBalance, SuperDry] AND Lee
Expected Output:
"Not Found"
  
Sample Input:
[Nike, Puma, Adidas, Reebok, UnderArmour, null, SuperDry] AND Lee
Expected Output:
"The catalog List contains empty or null or blank space as a value"
  
Sample Input:
null
Expected Output:
"Input is not accepted"
  
Sample Input:
[ ]
Expected Output:
"The catalog list is empty"
  
Sample Input:
[Nike, Puma, Adidas, Reebok, UnderArmour, NBalance, SuperDry]
Expected Output:
[Adidas, NBalance, Nike, Puma, Reebok, SuperDry, UnderArmour]*

### Program 6

Create a class `Patient`

registrationNumber:int

name: String

gender: char

Create a class `PatientService`

Implement the below methods

**Create a set of type Patient**

-   **addPatient(int registrationNumber, String name, char gender)**
	-   Add the patient details to set and display the set
    
-   **searchPatient(int registrationNumber)**
	-   This method searches a patient in the set given

-   **getAllPatientsByGender(char gender)**
	-   This method returns a Set of patients for a given gender in the sorted order of patient name