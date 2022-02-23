package com.teksystems;

public class Main {

    public static void main(String[] args) {
	// Question 1
        int x = 5;
        int y = 11;
        int sum;

        sum = x+y;
        System.out.println("Question 1: " + sum);
//     Question 2

        double m = 3.9;
        double n = 6.8;
        double sumDouble;

        sumDouble = m + n;

        System.out.println("Question 2: " + sumDouble);

//     Question 3
        int o = 6;
        double p = 7.3;
        double intDouble;

        intDouble = o + p;

        System.out.println("Question 3: " + intDouble + " intDouble has to be a double");
//      Question 4
        int d = 5;
        double c = 9.4;
        double divide;

        divide = c/d;

        System.out.println("Question 4: " + divide);
//      Question 5
        double q = 17.9543;
        double r = 82.43;
        double quotient;

        quotient = r/q;

        System.out.println("Question 5: " + quotient);

//        Core Java Conditional Statements
//        Question 1
        int v;
        v = 7;
        if(v < 10){
            System.out.println("Less than 10");
            v = 15;
        }
//        Question 2
        int v1;
        v1 = 15;
        if (v1 < 10){
            System.out.println("Less than 10");
        }else if (v1 > 10){
            System.out.println("Greater than 10");
        }

//        Question 3
        int v2;
        v2 = 15;
        if (v2 < 10){
            System.out.println("Less than 10");
        }else if (v2 < 20 && v2 > 10){
            System.out.println("Between 10 and 20");
        } else if (v2 >= 20){
            System.out.println("Greater than or equal to 20");
        }
    }
}
