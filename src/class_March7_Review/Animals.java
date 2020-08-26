package class_March7_Review;
import java.util.Scanner;
public class Animals {
    public static void main(String[] args) {

        System.out.println("Does animal breathe? (yes/no) ");
        Scanner input1 = new Scanner(System.in);
        String breathe=input1.nextLine();
        if (breathe.equalsIgnoreCase("yes")){
            System.out.println("Does the animal lay eggs? (yes/no) ");

            String eggs=input1.nextLine();
            if (eggs.equalsIgnoreCase("yes")){
                System.out.println("Bird");
            }
            else {
                System.out.println("Mammal");
            }
        }
        else {
            System.out.println("Fish");
        }
    }
}
