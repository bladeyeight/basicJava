package SoftwareDeveloperClubProjects;


import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ClubMemberApp implements SoftwareDeveloperClub{
    public static void main(String[] args) throws IOException
    {
        ArrayList<ClubMember> clubMembers = new ArrayList<>();
        SoftwareDeveloperClub.scanMembers(clubMembers);
        Scanner s = new Scanner(System.in);
        displayMenu();
        int choice = s.nextInt();
        chooseMenu(choice, s, clubMembers);
    }
    public static void displayMenu(){
        System.out.println("Select from the following menu: ");
        System.out.println("1: Display Members");
        System.out.println("2: Remove Member");
        System.out.println("3: Add Member");
        System.out.println("4: Quit");
    }
    public static void chooseMenu(int choice, Scanner s, ArrayList<ClubMember> clubMembers) throws IOException{
        if (choice == 1){
            displayMembers(clubMembers);
            System.out.println(clubMembers.size());
            int nextChoice = s.nextInt();

            chooseMenu(nextChoice, s, clubMembers);

        }else if (choice == 2){
            System.out.println("Which member do you want to remove?");
            String member = s.next();
            removeMember(member, clubMembers);
            int nextChoice = s.nextInt();
            chooseMenu(nextChoice, s, clubMembers);
        }else if (choice == 3){
            addMember(clubMembers);
            int nextChoice = s.nextInt();
            chooseMenu(nextChoice, s, clubMembers);
        }else if (choice == 4){
            return;
        }
    }

    public static void removeMember(String member, ArrayList<ClubMember> clubMembers){
        for (int i = 0; i <clubMembers.size(); i++){
            if (clubMembers.get(i).getName().equalsIgnoreCase(member)){
                clubMembers.remove(i);
            }
        }
    }
    public static void displayMembers(ArrayList<ClubMember> clubMembers){
        for(int x = 0; x < clubMembers.size(); x++){
//                    System.out.println(clubMembers.get(x).getName());
            clubMembers.get(x).showMember();
//                System.out.println("\n");
        }
    }
    public static void addMember(ArrayList<ClubMember> clubMembers){
        Scanner sc = new Scanner(System.in);
        System.out.println("What is the desired member name?");
        String dname = sc.next();
        System.out.println("What is the desired member city?");
        String dcity = sc.next();
        System.out.println("What is the desired member state?");
        String dstate = sc.next();
        System.out.println("What is the desired member favorite language?");
        String dlanguage = sc.next();
        String dlocation= (dcity + ", " + dstate);
        ClubMember inc = new ClubMember(dname, dlocation, dlanguage);
        clubMembers.add(inc);
    }

}
