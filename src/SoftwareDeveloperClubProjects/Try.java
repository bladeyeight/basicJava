package SoftwareDeveloperClubProjects;

import java.util.Scanner;

public class Try {


    public static void main(String[] args) {

        // Initialize Scanner object
        String [] a = new String[]{"12", "3", "55", "123"};
        String b = "abcdefgh";
        Scanner scan = new Scanner(b);
        // Printing the tokenized Strings
        for (int i =0; i < 12; i++){
            String g = scan.next();
            System.out.println(g);

        }
        // closing the scanner stream
        scan.close();

    }

    }
