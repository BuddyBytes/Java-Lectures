package com.basicsOfJava;

import java.awt.*;
import java.util.Scanner;
public class Methode {
    public static void main(String[] args) {
        /*
        what is the SCOPE ?
        The scope of a variable is the part of the program
        where the variable can be referenced / used
        - A variable defined inside a method is called a local variable .
        - The scope of a local variable starts from its declaration and continues to
        the end of the block that contains the variable .
        - A local variable must be declared and assigned a value before it can be
        used .
        - Parameters are also local variables , their scope is the whole method .

        Example :

        public class com.basicsOfJava.Methode {
        public static void main(String[] args) {

            if(..)
                int i = 4;// this variable we can't use it outside if because it's a local var
                statement
            for(int i=0;...;...) // this variable we can't use it outside the for loop because it's a local var
                statement

            Note that : the i variable in if is not the same as in for loop ,so we need to pay attention to this
         */

        // ---------------------------------------- void methode ----------------------------------------------
        // void methode is a methode which can't return anything
        // example
        /*
         public static void SayHi(){
               System.out.println(4);
         }// this methode will print 4 and don't return any value
         */

        SayHi();// print 4

        // ---------------------------------------- returning methode -----------------------------------------
        // returning methode is a methode which can return a value
        // example
        System.out.println(printNumber());// return the value of 4 and returning it

        // -------------------------------------- passing arg by value-----------------------------------------

        int ByValue = 1;
        passingByValue(ByValue);// print 2
        System.out.println(ByValue);// print 1

        // so as we see we take a copy from the ByValue variable

        // --------------------------------- passing arg by reference -----------------------------------------
        Point ByRef = new Point();
        ByRef.x = 1;
        ByRef.y = 2;
        System.out.println(ByRef.x + "," + ByRef.y);// print " 1 , 2 "
        passingByRef(ByRef);
        System.out.println(ByRef.x + "," + ByRef.y);// print " 2 , 1 "
        // so here we are using the address of variable on the memory

        // --------------------------------- overloading methode ---------------------------------------------
        // writing the same methode with the different parameters
        overLoadingFun();// print "hi"
        overLoadingFun(4);// print "hi its 4"

        // --------------------------------- first exercises --- ---------------------------------------------
        System.out.println(nameOfUser());
        System.out.println(ageOfUser());

        // --------------------------------- Second exercises --- ---------------------------------------------
        isPrime(1,50);// return all prime numbers between 1 and 50
    }

    public static void SayHi(){
        System.out.println(4);
    }

    public static int printNumber(){
        return 4;
    }

    public static void passingByValue(int ByValue){
        ByValue++;
        System.out.println(ByValue);
    }

    public static void passingByRef(Point ByRef){
        ByRef.x = 2;
        ByRef.y = 1;
    }

    // --------------------------------- overloading methode ---------------------------------------------

    public static void overLoadingFun(){
        System.out.println("hi");
    }

    public static void overLoadingFun(int prm){
        System.out.println("hi its :" + prm);
    }

    // --------------------------------- first exercises --- ---------------------------------------------
    // get user name and age
    public static String nameOfUser(){
        Scanner newScanner = new Scanner(System.in);
        System.out.println("type ur name :");
        return newScanner.nextLine();
    }
    public static int ageOfUser(){
        Scanner newScanner = new Scanner(System.in);
        System.out.println("type ur age :");
        return newScanner.nextInt();
    }

    // --------------------------------- Second exercises --- ---------------------------------------------
    // find prime number between 1 and 50
    public static void isPrime(int start,int end){
        int counter=0;
        for(int i=start;i<=end;i++){
            if(i==1)
                continue;
            else if (i==2) {
                System.out.println(2);
                continue;
            }
            for(int j=1;j<=i;j++){
                if(i%j==0)
                    counter++;
            }
            if(counter<=2){
                System.out.println(i);
            }
            counter=0;
        }
    }



}