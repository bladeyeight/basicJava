package com.teksystems;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
////        Question 1
//        for (int i = 0; i < 11; i++){
//            System.out.println(i);
//        }
////        Question 2
//        int x = 0;
//        do{
//            x += 10;
//            System.out.println(x);
//        }
//        while (x < 91);
////        Question 3
//        int k = 0;
//        do{
//            k++;
//            System.out.println(k);
//        }
//        while(k < 10);
////        Question 4
//        for (int i = 0; i < 101; i++){
//            if (i> 25 && i<75){
//                continue;
//            }
//            if (i % 5 == 0){
//                System.out.println(i);
//                }
//        }
////        Question 5
//        for (int i = 0; i < 101; i++){
//            if (i % 5 == 0){
//                System.out.println(i);
//            }
//            if (i == 51){
//                break;
//            }
//        }
//        Question 6
//        for (int week = 1; week < 3; week++){
//            System.out.println("Week " + week);
//            for(int day = 1; day < 6; day++){
//                System.out.println("Day "+ day);
//            }
//        }
////        Question 7
//
//        for (int i = 10; i <201; i++){
//            String p = Integer.toString(i);
//            char last = p.charAt(p.length() - 1);
//            char first = p.charAt(0);
//            if(first == last){
//                System.out.println(i);
//            }
//        }
////        Question 8
//        int firstNum = 0;
//        int nextNum = 1;
//        for (int i = 0; i <11; i++){
//            System.out.println(firstNum + " ");
//            int sum = firstNum + nextNum;
//            firstNum = nextNum;
//            nextNum = sum;
//        }
//        Question 9
        for (int i = 0; i <6; i++){
            for(int j = 0; j<6; j++){
                System.out.println("Inner loop: i: "+ i + " j: " + j);
            }
        }
    }
}
