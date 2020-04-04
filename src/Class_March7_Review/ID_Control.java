package Class_March7_Review;
import java.util.Scanner;
public class ID_Control {
    public static void main(String[] args) {
        System.out.println("Do you have ID? (Y/N)");
        Scanner scan = new Scanner(System.in);
        String IdNumber = scan.nextLine();

        if (IdNumber.equalsIgnoreCase("y")){
            System.out.println("Access permitted...");
        }
        else{
            System.out.println("Access denied...");
        }
    }

}
