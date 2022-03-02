package com.teksystems;

import java.util.Scanner;

public class ControlFlow {
    public static void main(String[] args) {
//    Question 1
        int x = 15;
        if (x < 10) {
            System.out.println("Less than 10");
        }
//    Question 2
        int y = 15;
        if (x < 10) {
            System.out.println("Less than 10");
        } else {
            System.out.println("Greater than 10");
        }
//        Question 3
        int u = 50;
        if ( u < 10){
            System.out.println("Less than 10");
        } else if (u<20 && u > 10){
            System.out.println("Between 10 and 20");
        }else if(u> 20) {
            System.out.println("Greater than 20");
        }
//        Question 4
        int o = 5;
        if ( o < 10 || o > 20 ){
            System.out.println("Out of Range");
        }else {
            System.out.println("In Range");
        }

//        Question 5

//        Scanner s = new Scanner(System.in);
//        int m = s.nextInt();
//        if (m >= 90){
//            System.out.println("A");
//        } else if (m>=80 && m < 90){
//            System.out.println("B");
//        }else if (m>=70 && m < 80){
//            System.out.println("C");
//        }else if (m>=60 && m < 70){
//            System.out.println("D");
//        }else if (m<60 && m > 0){
//            System.out.println("F");
//        }else if (m<0 || m>100){
//            System.out.println("Score out of Range");
//        }
//    Question 6
        Scanner s = new Scanner(System.in);
        int q = s.nextInt();
            switch(q){
                case 1:
                    System.out.println("Sunday");
                    break;
                case 2:
                    System.out.println("Monday");
                    break;
                case 3:
                    System.out.println("Tuesday");
                    break;
                case 4:
                    System.out.println("Wednesday");
                    break;
                case 5:
                    System.out.println("Thursday");
                    break;
                case 6:
                    System.out.println("Friday");
                    break;
                case 7:
                    System.out.println("Saturday");
                    break;
                default:
                    System.out.println("Theres only 7 days in a week");

            }
    }
}
