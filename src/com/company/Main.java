package com.company;

import java.io.File;
import java.security.KeyStore;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.*;
import java.util.stream.Collectors;

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

// java program to sort hashmap by values;

     class Java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String key = sc.next();
            String value = sc.next();
            map.put(key, Integer.parseInt(value));

        }
        sc.close();
        Map<String, Integer> sortedMap = map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
        System.out.println(sortedMap);
        sc.close();

        }
    }

    //
//java program stream api example
    class stream {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java", "C++", "Java2Novice", "Unix", "MAC");
        list.stream().filter(s -> s.startsWith("J")).forEach(System.out::println);
    }
}

//java program to find the largest number in an array using stream api in java 8
class LargestNumber {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 20, 30, 40, 50);
        int max = list.stream().max(Comparator.comparing(Integer::valueOf)).get();
        System.out.println("Largest Number: " + max);
    }
}
//java prgram to find the smallest number in an array using stream api in java 8
class SmallestNumber {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 20, 30, 40, 50);
        int min = list.stream().min(Comparator.comparing(Integer::valueOf)).get();
        System.out.println("Smallest Number: " + min);
    }
}
//java program in lambda expression in java 8
class LambdaExpression {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java", "C++", "Java2Novice", "Unix", "MAC");
        list.forEach(s -> System.out.println(s));
    }
}
//java program in custom exception in java example in java number format exception in java
class CustomException {
    public static void main(String[] args) {
        try {
            int num = Integer.parseInt("XYZ");
            System.out.println(num);
        } catch (NumberFormatException ex) {
            System.out.println("Number format exception occurred");
        }
    }
}
//java program in custom exception in java example in java number format exception in java with throw
class CustomExceptions {
    public static void main(String[] args) {
        try {
            int num = Integer.parseInt("XYZ");
            System.out.println(num);
        } catch (NumberFormatException ex) {
            System.out.println("Number format exception occurred");
            throw ex;
        }
    }
}
//java leap year program in java with lambda expression in java
class LeapYear {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2012, 2013, 2014, 2015, 2016, 2017, 2018);
        list.stream().filter(year -> {
            if (year % 4 == 0) {
                return true;
            } else {
                return false;
            }
        }).forEach(System.out::println);
    }
}

//java program in file operation in java example in java
class FileOperation {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Java2Novice\\Desktop\\test.txt");
        if (file.exists()) {
            System.out.println("File exists");
        } else {
            System.out.println("File does not exists");
        }
    }
}

//java program date and time in java example in java 8
class DateAndTime {
    public static void main(String[] args) {
        LocalDateTime current = LocalDateTime.now();
        System.out.println("Current Date and Time is: " + current);
        LocalDate date1 = current.toLocalDate();
        System.out.println("date1: " + date1);
        Month month = current.getMonth();
        int day = current.getDayOfMonth();
        int seconds = current.getSecond();
        System.out.println("Month: " + month + ", day: " + day + ", seconds: " + seconds);
        LocalDateTime date2 = current.withDayOfMonth(10).withYear(2012);
        System.out.println("date2: " + date2);

    }
}
//java collection hashmap example
class HashMapExample {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "Java");
        map.put(2, "C++");
        map.put(3, "Java2Novice");
        map.put(4, "Unix");
        map.put(5, "MAC");
        for (Map.Entry m : map.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}
//java program reverse arraylist in java
class ReverseArrayList {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        al.add("Java");
        al.add("C++");
        al.add("Java2Novice");
        al.add("Unix");
        al.add("MAC");
        System.out.println("Before Reverse:");
        for (String temp : al) {
            System.out.println(temp);
        }
        Collections.reverse(al);
        System.out.println("After Reverse:");
        for (String temp : al) {
            System.out.println(temp);
        }
    }
}
