package assignments;

import java.util.Scanner;
public class Assignment2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Are you subscribed or not (Y/N): ");
        String sample = scanner.next();
        if (sample.equalsIgnoreCase("Y")) {
            System.out.println("What usage you would like to get (0-100): ");
            int usage = scanner.nextInt();
            if (usage > 0 && usage < 100) {
                System.out.println("usage = 10USD");
            } else if (usage == 100) {
                System.out.println("usage = 40USD");
            }
        } else if (sample.equalsIgnoreCase("N")) {
            System.out.println("Please visit subscription page at https://InternationalBrains.com");

        }
    }
}