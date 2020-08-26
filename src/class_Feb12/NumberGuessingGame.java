package class_Feb12;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        int numberToGuess = 23;

        Scanner x = new Scanner(System.in);

        int userGuess = 0;


        while(userGuess!= numberToGuess) {          // while userGuess is not equal to numberGuess do:
                System.out.println("Guess the number: ");
                userGuess = x.nextInt();
            if (userGuess > numberToGuess){
                System.out.println("Number is larger");
            }
            else if (userGuess < numberToGuess){
                System.out.println("Number is smaller");
            }
            else {
                System.out.println("Congratulations!!!");
            }
        }
    }
}
