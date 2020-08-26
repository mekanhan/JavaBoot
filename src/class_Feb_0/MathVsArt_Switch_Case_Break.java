package class_Feb_0;
import java.util.Scanner;

public class MathVsArt_Switch_Case_Break {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Math or Art?:");
        String n = x.nextLine();
        switch(n) {
            case "Math":
                System.out.println("Tutor?: (Yes/No)");
                String nx = x.nextLine();
                switch(nx){
                    case "Yes":
                        System.out.println("Ok");
                        break;
                    case "No":
                        System.out.println("Study yourself");
                        break;
                    default:
                        System.out.println("No info!");
                        break;
                }
                break;
            case "Art":
                System.out.println("Nice Choice");
                break;
            default:
                System.out.println("No info!");
                break;
        }
    }
}
