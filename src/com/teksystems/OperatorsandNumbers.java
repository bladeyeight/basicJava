package com.teksystems;

public class OperatorsandNumbers {
    public static void main(String[] args) {
//        Question 1 in binary
//        1 is 1
//        8 is 1000
//        33 is 100001
//        78 is 1001110
//        787 is 1100010011
//        33987 is 1000110010010011

//        Question 2
//        0010 is 2
//        1001 is 9
//        0011 0100 is 52
//        0111 0010 is is 114
//        0010 0001 1111 is 543
//        0010 1100 0110 0111 is 3175
//        Question 3
        int x = 2  << 1;
//        4 100
        int s = 9 << 1;
//        18 10010
        int w = 17 << 1;
//        34 100010
        int z = 88 << 1;
//        176 10110000
        System.out.println(Integer.toBinaryString(x));
        System.out.println(Integer.toBinaryString(s));
        System.out.println(Integer.toBinaryString(w));
        System.out.println(Integer.toBinaryString(z));

//        Question 4
        int q = 150 >> 2;
//        37 100101
        int r = 225 >> 2;
//        56 111000
        int y = 1555 >> 2;
//        388 110000100
        int v = 32456 >> 2;
//        8114 1111110110010
        System.out.println(Integer.toBinaryString(q));
        System.out.println(Integer.toBinaryString(r));
        System.out.println(Integer.toBinaryString(y));
        System.out.println(Integer.toBinaryString(v));
//        Question 5
        int u = 7;
        int n = 17;
        int a = u & n;
//        1
        int i = u | n;
//        23
        System.out.println(a);
        System.out.println(i);
//        Question 6
        int p = 4;
        p++;
//        p = 5
//        Question 7
        int t = 7;
        t++;
        System.out.println(t);
        t = t + 1;
        System.out.println(t);
        t += 1;
        System.out.println(t);

//        Question 8
        int e,d;
        e = 5;
        d = 8;
        int sum =  d + e++;
        System.out.println(sum);



    }
}
