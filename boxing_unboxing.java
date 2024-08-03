import java.util.ArrayList;

public class boxing_unboxing {
    public static void main(String[] args) {
        // creating an arraylist by wrapper class of type integer and adding elem to it
        ArrayList<Integer> list1 = new ArrayList<>();

        // Wrapper class: a class the "Wraps" (Stores) primitive data as an
        // object

        //  in the previous version, this line can be written like this
        //   Integer x = new Integer(15); this is means by wrapping value inside Integer.
        int x = 15; // Boxing: it will convert automatic, int to an Integer object

        // in the previous version, this the below line can be written like this
        // Integer y = y.intValue(); this means opening wrapper to get value
        int y = x;

        list1.add(x);
        list1.add(y);

        System.out.println(list1);

        // Boxing: an automatic conversion from primitive data to a
        // wrapped object of an appropriated type
        int z = 30;

        list1.add(z);
        System.out.println(list1);

        // Unboxing: conversion from a wrapped object to its corresponding
        // primitive data type
        // OR getting value from arraylist and store it in its corresponding
        // primitive type
        int w = list1.get(2);
        System.out.println(w);

    }
}
