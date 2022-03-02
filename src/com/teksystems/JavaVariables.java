package com.teksystems;

public class JavaVariables {

    public static void main(String[] args) {
//        Question 1
        int x = 5;
        int y = 11;
        int sum;

        sum = x + y;
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

        divide = c / d;

        System.out.println("Question 4: " + divide);
//      Question 5
        double q = 17.9543;
        double r = 82.43;
        double quotient;

        quotient = r / q;
        System.out.println(quotient);

        int result = (int) quotient;
        System.out.println(result);



//        Question 6
        int b = 5;
        int w = 6;
        int e = 6/5;
        System.out.println(e);
        double f = (double) w;
        f =  e;
        System.out.println(e);

//        Question 7
        final int MAX_NUMBER = 100;
        System.out.println(6 * MAX_NUMBER);

//        Question 8
        int coffee = 3;
        int coke = 3;
        int water = 1;
        int subtotal;
        double totalSale;
        final double SALES_TAX = .15;
        subtotal = (3* coffee) + (4* coke) + (2* water);
        totalSale = subtotal + SALES_TAX;
        System.out.println(totalSale);

    }
}
