package Class_Feb_0;
import java.util.*;


public class JavaPointCalc {
    public static void main(String[] args){

        Scanner JavaCalc = new Scanner(System.in);
        System.out.println("Please enter your age\n");
        int age = JavaCalc.nextInt();
        System.out.println("Please enter your Java score\n");
        int javaScore = JavaCalc.nextInt();


        if ( (age >= 20 && age <=30) && (javaScore>=80)){
            System.out.println((age*1.5 + javaScore*4.5));
        }
        else if ( (age >= 20 && age <= 30) && (javaScore<80)){
            System.out.println(age*1.5 + javaScore*3.5);
        }
        else if ( (age>30) && (javaScore>=80)){
            System.out.println(1.1*age + javaScore*4.5);
        }
        else if ( (age<31) && javaScore <80) {
            System.out.println(age*1.1 + javaScore*3.5);
        }
        else {
            System.out.println("Please enter a valid age or java Score");
        }

    }
}
