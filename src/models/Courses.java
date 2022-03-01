package models;

public class Courses {
//    fields
    private int code;
    private String courseName;
    private String iName;

//    Constructors
    public Courses(int code, String courseName, String iName){
        this.code = code;
        this.courseName = courseName;
        this.iName = iName;

    }
//    Methods
//    Getters and Setters
//    Override Methods object ex toString

    @Override
    public String toString(){
        return String.format("Course code: %-5s Course Name: %-14s Course Instructor: %s\n", this.code, this.courseName, this.iName);
    }
}
