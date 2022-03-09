package SoftwareDeveloperClubProjects;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

interface SoftwareDeveloperClub {

    public static void scanMembers(ArrayList<ClubMember> clubMembers) throws IOException {
        Scanner s = null;
        FileReader inputStream = null;
//        BufferedReader bufferStream = null;
        PrintWriter printStream = null;
        File readin = new File("C:\\Users\\samue\\IdeaProjects\\CoreJavaBasics\\src\\members.txt");


        try {
            inputStream = new FileReader(readin);
//            bufferStream = new BufferedReader(inputStream);
            s = new Scanner(inputStream);

            while (s.hasNextLine()) {
                String r = s.nextLine();
                String words[] = r.split("[*]+");

                ClubMember test = new ClubMember();
                for(int i = 0; i < words.length; i++){

                    if(i == 0){
                        test.setName(words[i]);
                    }
                    if(i==1){
                       String loc= (words[i]) + ", " + (words[i+1]);
                       test.setLocation(loc);
                    }
                    if(i==2){
                        continue;
                    }
                    if (i==3){
                        test.setLanguage(words[i]);
                    }

                }
                clubMembers.add(test);


            }
            clubMembers.remove(0);
//            for(int x = 0; x < clubMembers.size(); x++){
////                    System.out.println(clubMembers.get(x).getName());
//                clubMembers.get(x).showMember();
////                System.out.println("\n");
//            }

        } finally {
            if (inputStream != null) {
                    inputStream.close();
                }
//                if (bufferStream != null) {
//                    bufferStream.close();
//                }
            if (s != null) {
                s.close();
            }
        }

    }

//    public static void showMember(Object cm){
//        System.out.println("Member Name: "+cm.);
//        System.out.println("Location: "+cm.location);
//        System.out.println("Favorite Language: "+cm.language);
//    }
}
