package com.basicsOfJava;

import java.util.Scanner;

public  class DataTypes {

    public static void main(String[] args) {
        // -----------------------------------------Comments-------------------------------------------
        //how to create a comments in java
            // we use "//" and then create what we need

        // -----------------------------------------Compile/run-------------------------------------------
        //how to compile and run java program from the terminal
            //first we need the same name in the file and the principal class
            //we need the main methode where the program should start
            //we create a bytecode of FileName.java file by using command : javac FileName.java
            //we use command : java FileName "Note this is a bytecode file we use it without .java extension"


        // -----------------------------------------com.basicsOfJava.DataTypes-------------------------------------------
        // Byte value : 8-bits
        //short value : 16-bits
        //integers value : 32-bits
        //long value : 64-bits
        // float value = 32-bits
        //double value = 64-bits
        //Boolean com.basicsOfJava.DataTypes value = depends en the jvm
        // String com.basicsOfJava.DataTypes

            // 1: String class
                // String.(some methode)
            // 2: String object
                // String name ;
                    // name.(some methode)

        // -----------------------------------------Note-------------------------------------------
        //Note : every floating number is considering as a double number we should put at the end of float's value : F
            // float number = 45.2F;

        // -----------------------------------------Note-------------------------------------------
        // for calculating the range of some dataTypes we use the following rule
            // [ -2^(numberOfBits -1) , 2^(numberOfBits -1 ) -1 ]

        // -----------------------------------------Example of Data.-------------------------------------------
        byte ex1 =10;
        short ex2 = 20;
        int ex3 = 30;
        long ex4 = 100L;
        double ex5 = 1;
        float ex6 = 4.5F;
        boolean ex7 = true;
        System.out.println(ex3);


        // -----------------------------------------Strings-------------------------------------------
        String test = "this is a demo test";
        String test_1 = "this is a demo test";
        // return the uppercase of the above text
        System.out.println(test.toUpperCase());
        // return true if the length of the text 0 otherwise return false
        boolean empty = test.isEmpty();
        System.out.println(empty);
        // return the character from index
        System.out.println(test.charAt(0));
        // return the index of some given character
        System.out.println(test.indexOf('i'));
        // return concatenation of two strings or more
        String fr = test.concat(test_1);

        // -----------------------------------------Primitive com.basicsOfJava.DataTypes-------------------------------------------
        // the primitive dataTypes can hold a simple value ,and they are :
            // byte , short , int , long , float , double , char
        // in the memory dataTypes can hold one address and inside it her value

        // -----------------------------------------Reference com.basicsOfJava.DataTypes-------------------------------------------
        // String is a an example of a reference dataTypes , because it can hold one address in memory for the address of the value
        // and the other for the value of string
        String name1 = "walid";
        String name2 = "walid";
        // the variable name1 and name2 have the same value for example 1005
        // but if we create an object of type string
        String name3 = new String("walid");
        // here even we have the same content but the value is different

        // -----------------------------------------Scanner Class-------------------------------------------
        // we use scanner class for obtain some input from user
            // we need to call package of java.util.Scanner
            // for creating scanner class we use : Scanner name = new Scanner(System.in)
        Scanner name = new Scanner(System.in);

        // Example

        System.out.println("enter ur number : ");
        // creating new object from scanner class
        Scanner numberFromUser = new Scanner(System.in);
        // getting the input from user
        int numberOfUser = numberFromUser.nextInt();
        //printing the final value
        System.out.println("ur final result is :" + (numberOfUser*2));

        // -----------------------------------------casting-------------------------------------------


        // Casting : change from dataTypes to others
        // implicit casting and explicit casting

        // implicit casting is doing by computers
        // example : from small range to wide range
        // int to double/float/long
        // short/byte to int
        // float to double
        double change = 4;// from int to 4.0

        // explicit casting is doing by us
        // example
        // double to float
        // double/float/long to int
        int change_2 = (int) 4.5;
        float x = (float) change;// from 4 to 4.0F




    }
}