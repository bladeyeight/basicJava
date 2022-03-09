package SoftwareDeveloperClubProjects;

public class ClubMember {
    String name;
    String location;
    String language;

    public ClubMember() {
    }

    public ClubMember(String name, String location, String language) {
        this.name = name;
        this.location = location;
        this.language = language;
    }

    public void showMember(){
        System.out.println("Member Name: "+name);
        System.out.println("Location: "+location);
        System.out.println("Favorite Language: "+language);
        System.out.println("---------------------");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}
