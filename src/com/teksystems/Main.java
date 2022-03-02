package com.teksystems;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Main {

    public static void main(String[] args) {
//	// Question 1
//        int x = 5;
//        int y = 11;
//        int sum;
//
//        sum = x+y;
//        System.out.println("Question 1: " + sum);
////     Question 2
//
//        double m = 3.9;
//        double n = 6.8;
//        double sumDouble;
//
//        sumDouble = m + n;
//
//        System.out.println("Question 2: " + sumDouble);
//
////     Question 3
//        int o = 6;
//        double p = 7.3;
//        double intDouble;
//
//        intDouble = o + p;
//
//        System.out.println("Question 3: " + intDouble + " intDouble has to be a double");
////      Question 4
//        int d = 5;
//        double c = 9.4;
//        double divide;
//
//        divide = c/d;
//
//        System.out.println("Question 4: " + divide);
////      Question 5
//        double q = 17.9543;
//        double r = 82.43;
//        double quotient;
//
//        quotient = r/q;
//
//        System.out.println("Question 5: " + quotient);
//
////        Core Java Conditional Statements
////        Question 1
//        int v;
//        v = 7;
//        if(v < 10){
//            System.out.println("Less than 10");
//            v = 15;
//        }
////        Question 2
//        int v1;
//        v1 = 15;
//        if (v1 < 10){
//            System.out.println("Less than 10");
//        }else if (v1 > 10){
//            System.out.println("Greater than 10");
//        }
//
////        Question 3
//        int v2;
//        v2 = 15;
//        if (v2 < 10){
//            System.out.println("Less than 10");
//        }else if (v2 < 20 && v2 > 10){
//            System.out.println("Between 10 and 20");
//        } else if (v2 >= 20){
//            System.out.println("Greater than or equal to 20");
//        }
//
//        String[] arr = new String[3];
//
//        for (int i = 0; i < arr.length; i++){
//            System.out.println(arr[i]);
//        }
//
//        String[][] arr1 = {
//                {"Sam0", "Sam1", "Sam2"},
//                {"Brian0", "Brian1", "Brian2"},
//                {"Esther0", "Esther1", "Esther2"}
//        };
//
//        for (String[] row:arr1){
//            for(String col:row){
//                System.out.println(col);
//            }
//        }
//        String name = "Sam";
//        name = "Bob";
//        System.out.println(name);

//        Random r = new Random();
//        int[]  myArr = new int[100];
//        System.out.println(r.nextInt());
//
//        for (int i = 0; i < myArr.length; i++){
//            myArr[i] = r.nextInt();
//        }
//        System.out.println(Arrays.toString(myArr));
//        System.out.println(myArr.length);
//        Scanner input = new Scanner(System.in);
//        Vehicle v1 = new Vehicle("123", 4, "blue");
//        v1.color = "blue";
//        v1.doors = 4;
//        v1. vin = "ABC12344";

//        String fullName = "samuel, j, perry";
//        String [] name = fullName.split(",");
//        for (int i = 0; i < name.length; i++){
//            System.out.printf("Index: %d value: %s\n", i, name[i]);
//        }

//        File file = new File("coursesInfo.txt");
//
//        try {
//            fileWrite.createNewFile();
//        } catch (IOException e){
//            e.printStackTrace();
//        }
//        if (file.exists()){
//            System.out.println("File Exists: " + file.exists());
//
//            try {
//                Scanner input = new Scanner(file);
//                FileWriter fw = new FileWriter(fileWrite);
//                while(input.hasNextLine()){
//                    String[] names = input.nextLine().split(",");
////                    System.out.printf("Course code: %-5s Course Name: %-14s Course Instructor: %s\n", names[0], names[1], names[2]);
//                    String s = String.format("Course code: %-5s Course Name: %-14s Course Instructor: %s\n", names[0], names[1], names[2]);
//                    fw.write(s);
//                }
//            } catch (FileNotFoundException e) {
//                e.printStackTrace();
//            }
//        }

//        ArrayList<String> list = new ArrayList<String>();
//
//        list.add("hello");
//        list.add("world");
//        list.add("again");
//
//
//        System.out.println(list);
//        list.remove(2);
//        list.set(1, list.get(1).toUpperCase());
//        System.out.println(list);

//        Map<Integer, String> myMap = new HashMap<Integer, String>();
//        myMap.put(101, "Java");
//        myMap.put(102, "CSS");
//        myMap.put(103, "HTML");
//        myMap.put(104, "Spring Boot");
//
//        System.out.println(myMap);
//
//        ArrayList<Integer> myList = new ArrayList();
//        static int getSum(int m){
//            int sum = 0;
//            for (int x = 0; x < myList.size(); x++ ){
//                sum =+ myList.get(x);
//
//            }
//            return sum;
//
//        }
//      int[] myArray = new int[] {4,8,12,16};
//        List<String > ll = new LinkedList<String>();
//        List<String> list = new LinkedList<String>(ll);
//        System.out.println(list);

//        Queue<String> s  = new LinkedList<>();
//        s.add("Jafer");
//        s.add("Sam");
//        s.add("Bob");
//
//        String ss = s.poll();
//        System.out.println(ss);
//        System.out.println(s);

//        List<String> places = Arrays.asList("One", "Two", "Three");
//        System.out.println(places);

//        Map <Integer, String> map = new LinkedHashMap<Integer, String>();
//        map.put(60, "Jafer");
//        map.put(32, "Ralph");
//        map.put(31, "Sam");
//        System.out.println(map);
//
//        map.forEach((k,v) -> System.out.printf("k: %-3d v: %s\n", k ,v));
//
//        for (Integer s: map.keySet()){
//            System.out.printf("k: %d v: %s \n" , s, map.get(s));
//        }

//        Scanner s = new Scanner(System.in);
//        System.out.print("Enter any number: ");
//        int p = s.nextInt();
//        System.out.println("Your number is " + p);













    }
}
