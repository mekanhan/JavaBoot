package assignments;

import java.util.Scanner;
public class Assignment3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What's your computer skills (Java/SQL/Cloud: ");
        String skill = scanner.next();

        if(skill.equalsIgnoreCase("java")) {
            System.out.println("Your QA score: 0-100" );
            String javaScore = scanner.next();

        }
        else if (skill.equalsIgnoreCase ("sql")){
            System.out.println("Hackerrank Score?" );
            String hackerRankScore = scanner.next();
        }
        else if (skill.equalsIgnoreCase ("cloud"))
        {
            System.out.println(("Certification? (Y/N) "));
            String certification = scanner.next();
        }
        else
        {
            System.out.println("enter Java / Sql / Cloud");
        }
    }
}