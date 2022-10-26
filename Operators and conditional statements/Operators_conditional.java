package com.basicsOfJava;

import java.util.Scanner;

public class Operators_conditional {

    public static void main(String[] args) {
        String name;
        // the value name will be stored in the name variable inside the system methode
        System.out.println(name="walid");

        // sum operator
        System.out.println("sum is  : "+ 1 +6);// the output is not (sum is : 7)
        // for getting the right input we should put 1+6 inside the parentheses (1+6:
        System.out.println("sum is : " + (1+6));// the output is (sum is : 7)

        // pre-decrement and pre-increment
        // example (++i) and (--i)
        int i_1 = 1;
        System.out.println(++i_1);//return i=2
        int i_2 = 1;
        System.out.println(--i_2);//return i=0

        // post-increment and post-decrement
        int i_3 = 1;
        System.out.println(i_3++);// return i=1 and then change tha value of i_3 to 2
        int i_4 = 1;
        System.out.println(i_4--);// return i=1 and then change value to 0


        // ---------------------------------division actions------------------------------------
        // int / int
        int numberByNumber = 1/2; // return 0

        // double with value int
        double doubleByInt = 1 / 2; // first dividing 1/2 and return 0 and converting it to double 0.0

        // dividing a float by a float cause nothing
        double fByf = 1.02F / 2.04F; // double = float and float to double : implicit casting

        // dividing an integer by a double
        double intByDouble = 1 / 2.0; // return 0.5
        double doubleByInt_2 = 2.0 / 2 ;// return 1.0
        // error dividing
        // int intByDouble_2 = 2.0 / 1;  error because double has a wide range than int

        // dividing a double by a float
        double doubleByFloat = 1.02F / 2.4F;
        // error dividing
        // float floatByDouble = 1.0F / 4.0; error because double has a wide range than float

        // ---------------------------------relation operators------------------------------------

        // all this operator produce a boolean value
            // equality operator ==
            // inequality operator !=
            // greater than operator >
            // smaller than operator <
            // greater than or equal >=
            // smaller than or equals <=

        // ---------------------------------logical operators------------------------------------

        // all this operator produce a boolean value
            // logical and operator &&
            // logical or operator ||
            // logical not operator !


        // ---------------------------------conditional statements------------------------------------

        // conditional operator
        // cas 1
        // expression 1 ( boolean expression ) expression 2 ? expression 1 : expression 2
        // cas 2
        // expression 1 ( boolean expression ) expression 2 ? expression 2 : expression 1

        // example
        String nameOfUser = "walid";

        String value = nameOfUser.isEmpty() ? "nothing here " : "name exist";
        System.out.println(value);// return "name exist"

        // example of program for checking if the number or odd

        System.out.println("enter ur number :");
        Scanner newScanner = new Scanner(System.in);
        int numberFromUser = newScanner.nextInt();// getting the number from user
        System.out.println(numberFromUser%2==0 ? "the number is even" : "the number is odd");// return the result
        /*
          The code starts by creating a new Scanner object.
          The next line gets the user's input and assigns it to an int variable called numberFromUser.
          Next, the code checks if the number is even or odd using %2==0.
          If it is even, then "the number is even" will be printed; otherwise, "the number is odd" will be printed.
          The code attempts to return the result of whether the number entered by the user is even or odd.
         */

        // ---------------------------------if statements------------------------------------
        // logical syntax

        // one statement
        if(true)
            System.out.println(4);

        // many statement
        if (true){
            System.out.println(4);
            int a = 5;
        }

        // ---------------------------------else statements------------------------------------

        // one statement
        if(true)
            System.out.println(4);
        else
            System.out.println(5);

        // many statement
        if (true){
            System.out.println(4);
            int a = 5;
        }
        else{
            System.out.println(12);
        }

        // ---------------------------------nested if statements------------------------------------

        // logical syntax
        if (true){
            System.out.println(12);
        }
        else if (4==1) {
            System.out.println(7);
        }
        else {
            System.out.println("end");
        }

        // ---------------------------------switch statements------------------------------------

        // logical syntax
        int expression = 1;
        switch (expression){
            case 4:
                // execute the statement if expression equal the expression 1
                System.out.println("not equals");
            case 1:
                // execute the statement if expression equal the expression 2
                System.out.println("equals");
            default:
                // execute the statement if expression equal the default statements
                System.out.println("non of them");
        }

        // ---------------------------------difference between switch and if------------------------------------

        // if we have multiple statements in if and the first condition is true the rest of code will be exit
        // example
        int ifVsSwitch = 1;
        if(ifVsSwitch==1)
            System.out.println(4);
        else
            System.out.println(5);
        // so the result is 4 and the program will be ended


        // but in switch statements if we have multiple statements and one them is equal the expression , switch statement will continue print the rest of code
        // for ending that we use break keyword

        int exp = 1;
        switch(exp){
            case 1:
                System.out.println("done");
                break;
            case 2:
                System.out.println("write more");
        }

        // return done and stop the execution
    }
}
