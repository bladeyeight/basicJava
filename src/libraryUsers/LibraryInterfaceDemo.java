package libraryUsers;

public class LibraryInterfaceDemo {
    public static void main(String[] args) {
        kidUser jimmy = new kidUser();
        jimmy.age = (10);
        jimmy.registerAccount();
        jimmy.age = (18);
        jimmy.registerAccount();
        jimmy.bookType = "Kids";
        jimmy.requestBook();
        jimmy.bookType = "Fiction";
        jimmy.requestBook();

        AdultUser brad = new AdultUser();
        brad.age = 5;
        brad.registerAccount();
        brad.age = 23;
        brad.registerAccount();
        brad.bookType = "Kids";
        brad.requestBook();
        brad.bookType = "Fiction";
        brad.requestBook();
    }
}
