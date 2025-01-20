package se.lexicon;

/*

Array
1. Write a program which will store elements in an array of type ‘int’ and print it out.
Expected output: 11 23 39 etc.

2. Create a program and create a method with name ‘indexOf’ which will find and return the index of an element in the array.
If the element doesn’t exist your method should return -1 as value. Expected output: Index position of number 5 is: 2.

3. Write a program which will sort string array.
Expected output: String array: [Paris, London, New York, Stockholm]
Sort string array: [London, New York, Paris, Stockholm]

4. Write a program which will copy the elements of one array into another array.
Expected output: Elements from first array: 1 15 20
Elements from second array: 1 15 20

5. Create a two-dimensional string array [2][2]. Assign values to the
2-dimentional array containing any Country and City. Expected output: France Paris
Sweden Stockholm

6. Write a program which will set up an array to hold the next values in this order: 43, 5, 23, 17, 2, 14 and print the average of these 6 numbers. Expected output: Average is: 17.3

7. Write a program which will set up an array to hold 10 numbers and print out only the uneven numbers. Expected output: Array: 1 2 4 7 9 12
Odd Array: 1 7 9

8. Write a program which will remove the duplicate elements of a given array [20, 20, 40, 20, 30, 40, 50, 60, 50]. Expected output: Array: 20 20 40 20 30 40 50 60 50
Array without duplicate values: 20 40 30 50 60

9. Write a method which will add elements in an array. Remember that arrays are fixed in size so you need to come up with a solution to “expand” the array.

10. Write a program which will represent multiplication table stored in multidimensional array. Hint: You have two-dimensional array with values [[1,2,3,4,5,6,7,8,9,10], [1,2,3,4,5,6,7,8,9,10]]

11. Write a program that ask the user for an integer and repeat that question until user give you a specific value that user already has been told about as a message in your program.
Store these values in an array and print that array.
After that reverse the array elements so that the first element becomes the last element, the second element becomes the second to last element, etc.
Do not just reverse the order in which they are printed. You need to change the way they are stored in the array.

12. Write a program which will print the diagonal elements of two-dimensional array. Expected output: 1 4 9

13. Create two arrays with arbitrary size and fill one with random numbers.
Then copy over the numbers from the array with random numbers so that the even numbers are located in the rear (the right side) part of the array
 and the odd numbers are located in the front part (the left side).

 */


import java.util.ArrayList;
import java.util.Arrays;

public class Main{


    public static void main(String[] args) {

/*



-----------------
        String[] arrayToStringNumbers = { "11 23 39"

        };
        System.out.println(Arrays.toString(arrayToStringNumbers));
------------------

        }
    public static int findIndexOfNum5(int arr[], int t){

        int index = Arrays.binarySearch(arr, t);
        return (index < 0) ? -1 : index;
    }

    public static void main(String[] args) {
        int[] a = {1,2,5,4,3,6,7};
        int t = 5;
        System.out.println(findIndexOfNum5(a, t));
    }
 */

        Integer[] array1 = {1,2,5,3,4,6};
        int index = Arrays.asList(array1).indexOf(5);
        System.out.println(index);
        if (index > array1.length){

        }


        //Why is the outcome -7 if the element isnt found? And if i seatch for "3" result is -3..
        char arr[] = {1,2,5,3,4,6};
        char search = 3;
        int result = Arrays.binarySearch(arr, search);
        System.out.println(result);
        if (result > search) {

        }

    }
}





