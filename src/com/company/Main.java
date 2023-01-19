package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Hello World");

    }
}


 //java program to reverse a string using recursion in java without using library function in java
        class ReverseStringRecursion {
            public static void main(String[] args) {
                String str = "Java2Novice";
                System.out.println("Original String: " + str);
                System.out.println("Reverse String: " + reverseString(str));
            }
            public static String reverseString(String str) {
                if (str.isEmpty())
                    return str;
                //Calling Function Recursively
                return reverseString(str.substring(1)) + str.charAt(0);
            }
        }

       // java program hashmap sort arraylist
    class ArrayListSort {
        public static void main(String[] args) {
            ArrayList<String> al = new ArrayList<String>();
            al.add("Java");
            al.add("C++");
            al.add("Java2Novice");
            al.add("Unix");
            al.add("MAC");
            System.out.println("Before Sorting:");
            for (String temp : al) {
                System.out.println(temp);
            }
            Collections.sort(al);
            System.out.println("After Sorting:");
            for (String temp : al) {
                System.out.println(temp);
            }
        }
    }