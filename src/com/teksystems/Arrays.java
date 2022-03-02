// This is a basic program on Java
//
// Try to modify and run it and check out
// the output in the terminal below
//
// Happy coding! :-)
package com.teksystems;
import java.util.*;

public class Arrays {
    public static void main(String[] args) {
//      Question 1
      int[] xArray = new int[3];
      xArray[0] = 0;
      xArray[1] = 1;
      xArray[2] = 2;
      System.out.printf("%3d %3d %3d\n", xArray[0], xArray[1], xArray[2]);
//      Question 2
      int[] yArray = new int[] {13,5,7,68,2};
      System.out.println(yArray[yArray.length/2]);
//      Question 3
      String[] sArray = new String[]{"red", "green", "blue", "yellow"};
      System.out.println(sArray.length);
      String bArray[] = sArray.clone();
      for (int i = 0; i < bArray.length; i++){
        System.out.println(bArray[i]);
        }
//      Question 4
      int [] myArray = new int[] {1, 2,3,4,5};
      System.out.println(myArray[0]);
      System.out.println(myArray[myArray.length -1]);
      //System.out.println(myArray[myArray.length]);
      // myArray[5] = 6;
//      Question 5
      int [] loopArray = new int [5];
      for (int i = 0; i < loopArray.length; i++){
        loopArray[i] = i;
        System.out.print(loopArray[i]);
      }
//      Question 6
      System.out.println("\n");
      int [] multArray = new int [] {1, 2,3,4,5};
      for (int i = 0; i < multArray.length; i++){
        multArray[i] = multArray[i] * 2;
        System.out.println(multArray[i]);
      }
//      Question 7
      int [] noMid = new int[] {1,2,3,4,5};
      for (int i = 0; i < noMid.length; i++){
        if(noMid[i] != noMid[2] ){
          System.out.print(noMid[i]);
        }
      }
      System.out.println("\n");
//      Question 8
    String [] swap = new String [] {"one", "two", "three", "four", "five"};
      swap[2] = "one";
      swap[0] = "three";
//       Question 9
      int[] arr = new int [] {4,2,9,13,1,0};
      java.util.Arrays.sort(arr);
      System.out.println(arr[0]);
      System.out.println(arr[5]);
//      Question 10

      ArrayList<Object> myArr = new ArrayList<Object>();
      myArr.add(3);
      myArr.add("Jafer");
      myArr.add("Sam");
      myArr.add("Mike");
      myArr.add(8.05);

      for (int i = 0; i <myArr.size(); i++){
        System.out.println(myArr.get(i));
      }
      
      
      
      
    }
}
