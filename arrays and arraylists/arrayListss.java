package com.basicsOfJava;

import java.util.ArrayList;
import java.util.Arrays;

public class arrayListss {
    public static void main(String[] args) {
        // the array list is resizable
        // syntax
        ArrayList<Integer> test = new ArrayList<>();

        // for adding elements we use .add() function

        test.add(4);

        // we can use also .asList() function
        ArrayList<Integer> test1 = new ArrayList<>(
                Arrays.asList(
                        1,4,5,8
                )
        );

        // remove by index
        test.remove(1);

        // remove by value

        test.remove(4);

        // length of arrayList

        test.size();
    }
}
