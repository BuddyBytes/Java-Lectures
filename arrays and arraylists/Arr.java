package com.basicsOfJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class Arr {
    public static void main(String[] args) {
        Scanner newObject = new Scanner(System.in);
        // array of primitive
        // syntax
        // dataType[] varName = new datatype[size]
        int[] arrayTest = new int[2];
        arrayTest[0]=1;
        arrayTest[1]=2;
        // or we can create it lik that directly
        int[] arrayTest_1 = {1,5,3,4,70};
        // default value of an array of type int are all 0
        int[] allZeros = new int[5];
        System.out.println(allZeros[0]);// return 0
        // default value of an array of type string are all null
        String[] allNulle = new String[5];
        System.out.println(allNulle[0]);// return null
        /*
            Default value :
            int = 0
            string = null
            boolean = false
            char = \0uFFF
         */

        /*
            all elements of array are objects
            {1,2,5,8} all those elements are noted as objects
            so from that we can conclude that why array are passed by reference
         */
        // Note: we can't use an array without initialize it
        // storing input to array
        for (int i=0;i<allZeros.length;i++)
            allZeros[i]= newObject.nextInt();

        // print all elements of array in the easiest way
        for(int num : allZeros)
            System.out.println(num);

        // passing array to methode
        int[] numbers = {3,4,8,0};
        arrayToMethode(numbers);

        // 2d Arrays

        /*
                1 2 3
                4 5 6
                7 8 9
         */

        // syntax of it
        int[][] matrix = new int[3][];// number of columns are not necessary to mention it
        // the easiest wat
        int[][] matrix_2 = {
                {1,2,3},
                {4,5,6}
        };
        // input in 2d arrays
        int[][] arr = new int[3][3];
        for(int row = 0;row< arr.length;row++){
            for (int columns = 0; columns<arr[row].length;columns++){
                arr[row][columns]= newObject.nextInt();
            }
        }

        // output in 2d arrays
        for(int row = 0;row< arr.length;row++){
            for (int columns = 0; columns<arr[row].length;columns++){
                System.out.println(arr[row][columns]);
            }
            System.out.println();// new line
        }

        // Array list
        // Syntax
        ArrayList<Integer> test = new ArrayList<>();

        // initialize an array list with .asList()
        ArrayList<Integer> myArray = new ArrayList<>(Arrays.asList(1,5,3,6));
        // input in arrayList

        ArrayList<Integer> test_1 = new ArrayList<>();
        for (int i=0;i<=4;i++)
            test_1.add(newObject.nextInt());

        // get an item in arrayList
        System.out.println(test_1.get(/*index example :*/ 0));

        // multi arrayList
        ArrayList<ArrayList<Integer>> multiArrayList = new ArrayList<>();
        // initialize an arrayList
        for (int row = 0; row < 2; row++){
            multiArrayList.add(new ArrayList<>());// 2 array list
        }
        // input in arrayList
        for (int row = 0; row < 2; row++) {
            for (int columns = 0; columns < 2; columns++) {
                multiArrayList.get(row).add(newObject.nextInt());
            }

        }
        //print arrayList
        System.out.println(multiArrayList);

    }




    //------------------------------------------------------------------------------------------------
    // passing array to methode

    static void arrayToMethode(int[] numbers){
        for(int num:numbers)
            System.out.println(num);
    }
}