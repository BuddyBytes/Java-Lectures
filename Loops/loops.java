package com.basicsOfJava;

import java.util.Scanner;
public class loops {
    public static void main(String[] args) {
        /* ------------------------ while loop ---------------------------*/
        // general introduction to loop
        //  com.basicsOfJava.loops are used to execute a block of statements more than once
        // example
        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        System.out.println(4);
        System.out.println(5);
        // The code will print out: 1 2 3 4 5

        // for avoid this way of creating a code we use com.basicsOfJava.loops
        int iOfWhile=1;
        while(iOfWhile<=5){
            System.out.println(iOfWhile);
            iOfWhile++;
        }
        // The code will print the following: 1 2 3 4 5

        /* the type of com.basicsOfJava.loops are
        -while loop
        -do while loop
        -for loop
         we can achieve the same result with them
         So don't be confused
         */

        // while loop logical syntax
        /*
        while(true)
            // statements
            System.out.println("these while loop is used for one statement");
        // more than one statement we use braces
        while(true){
            // statements
            System.out.println("these while loop is used for one statement");
        }
        */
        // example
        System.out.println("enter a number between 1 and 10 :");
        Scanner newObjects = new Scanner(System.in);
        int numberFromUser = newObjects.nextInt();
        while(numberFromUser<1 || numberFromUser>10){
            System.out.println("this number is not between 1 and 10 try again :");
            numberFromUser = newObjects.nextInt();
        }
        System.out.println("this number is between 1 and 10 thanks :");
        /*
        The code asks the user to enter a number between 1 and 10.
        The code then uses a Scanner object to read in the input from the user.
        It also asks for an integer value that is less than or equal to 10, but greater than 1.
        The code attempts to get the user's input and check if it is between 1 and 10.
        If it is, then they are thanked.
        If not, then they are asked to try again.
         */


        /* ------------------------ do while loop ---------------------------*/
        /*
        1: one statement
        do
            statement
        while(boolean expression);

        2: more than one statement
        do{
            statements
        }while(boolean expression);

        the do while keep executing while the boolean expression true
         */

        /* ------------------------ difference between while and do while  ---------------------------*/

        /*
        while loop start checking the boolean expression if it is true and then execute

        do while start printing the first iteration and then checking the first boolean expression

        so if while loop has a false boolean expression then will not print any iteration
        but the do while the first iteration execute even the first condition is not true
         */

        /* ------------------------ for loop ---------------------------*/
        // Logical Syntax
        // for loop : one statement
        for (int iOfLoop=0;iOfLoop<=5;iOfLoop++)
            System.out.println(4);
        // for loop : more than one statement
        for (int iOfLoop=0;iOfLoop<=5;iOfLoop++){
            System.out.println(4);
        }
        // Note that : iOfLoop variable is defined in the for ,so we can't use it outside the loop

        // break and continue keywords
        /*
        the difference between break and continue is that
        when we use break keywords we stop execution of the loop
        but
        when we use continue keywords we just skip the rest of code and start from beginning
         */
        // example of using continue
        for (int iOfLoop=0;iOfLoop<=10;iOfLoop++){
            if(iOfLoop%2==0)
                continue;
            System.out.println(iOfLoop);
        }//return the odd numbers
        /*
        The code starts by declaring a for loop that will iterate from 0 to 10.
        The code then checks if the current iteration is even or odd, and if it's even, it continues on with the next line of code.
        If it's odd, it prints out the number of iterations so far and then stops.
         */


        // Exercise 1 :

        int over100 = 0;
        Scanner newScanner = new Scanner(System.in);


        while(over100<100){
            System.out.println("type ur number");
            int numberFromUs = newScanner.nextInt();
            over100=over100+numberFromUs;
        }
        System.out.println("ur numbers are exceeding the range of 100");

        // Exercise 2 :  check if the given number is a strict number

        int container = 0;
        Scanner newObject = new Scanner(System.in);
        int givenNumber = newObject.nextInt();

        for(int i=1;i<givenNumber;i++){
            if(givenNumber%i==0){
                container = container + i;
            }
        }
        if (givenNumber==container)
            System.out.println(givenNumber +" is a strict number");
        else
            System.out.println(givenNumber +" is a not a strict number");

    }
}
