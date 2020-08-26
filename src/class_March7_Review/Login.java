package class_March7_Review;
import java.util.Scanner;
public class Login {
    public static void main(String[] args) {
        String userName="user";
        String password = "password";
        Scanner scanner = new Scanner(System.in);
        System.out.print("Username: ");
        String user = scanner.next();
        System.out.print("Password: ");
        String pass = scanner.next();

        if (user.equals(user) && password.equals(pass)){
            System.out.println("Welcome to your page");
            }
        else {
            System.out.println("Username or password is invalid");
        }
    }
}
