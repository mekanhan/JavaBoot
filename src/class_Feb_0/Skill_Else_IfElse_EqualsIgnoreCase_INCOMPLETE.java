package class_Feb_0;

import java.util.Scanner;

public class Skill_Else_IfElse_EqualsIgnoreCase_INCOMPLETE {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Please enter your skill set (Java/SQL/Cloud: " );
        String answer = a.next();
        if(answer.equalsIgnoreCase("java")){
            System.out.printf("What is your java score?: ");
            int javaScore = a.nextInt();
        }
        else if(answer.equalsIgnoreCase("SQL")){
            System.out.println("What is your Hackerrenk score? ");
        }
      //  else if (Cloud)
    }
}
