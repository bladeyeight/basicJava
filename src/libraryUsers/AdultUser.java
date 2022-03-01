package libraryUsers;

public class AdultUser implements LibraryUser{
    public int age;
    public String bookType;

    @Override
    public void registerAccount(){
        if(age > 12){
            System.out.println("You have successfully registered an adult account!");
        } else {
            System.out.println( "Sorry, Age must be greater than 12 to register as an adult user");
        }
    }

    @Override
    public void requestBook(){
        if(bookType == "Fiction"){
            System.out.println("Book issued successfully, please return the book within 10 days.");

        }else {
            System.out.println("You are allowed to only take adult fiction books.");
        }
    }
}
