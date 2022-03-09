package SoftwareDeveloperClubProjects;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ScannerTrial {
    public static void main(String[] args) throws IOException {
        Scanner s = null;
        FileReader inputStream = null;
        File readin = new File("C:\\Users\\samue\\IdeaProjects\\CoreJavaBasics\\src\\members.txt");
        try {
            inputStream = new FileReader(readin);
            s = new Scanner(inputStream);
            ArrayList<ClubMember> clubMembers = new ArrayList<>();
            while (s.hasNextLine()) {
            }
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
            if (s != null) {
                s.close();
            }
        }
    }
}
