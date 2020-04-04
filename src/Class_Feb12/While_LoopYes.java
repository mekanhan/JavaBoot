package Class_Feb12;
import java.util.Scanner;

public class While_LoopYes {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        String answer = "";

        while(!answer.equalsIgnoreCase("y")) {
            System.out.print("Is Java fun? (y/n) ");
            answer = x.next();

        }
        System.out.println("I knew you like Java!");
    }
}
