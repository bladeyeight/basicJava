package libraryUsers;

public class kidUser implements LibraryUser {
    public int age;
    public String bookType;

    @Override
    public void registerAccount(){
        if(age < 12){
            System.out.println("You have successfully registered a kids account!");
        } else {
            System.out.println( "Sorry, Age must be less than 12 to register as a kid user");
        }
    }

    @Override
    public void requestBook(){
        if(bookType == "Kids"){
            System.out.println("Book issued successfully, please return the book within 10 days.");

        }else {
            System.out.println("You are allowed to only take kids books.");
        }
    }
}
