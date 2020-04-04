package w3resource;
import java.util.Scanner;
public class Q32 {
    public static void main(String[] args){

        System.out.println("Please enter input 1: ");
        Scanner in1 = new Scanner(System.in);
        int input1 = in1.nextInt();

        System.out.println("Please enter input 2: ");
        Scanner in2 = new Scanner(System.in);
        int input2 = in2.nextInt();

        if (input1 > input2){
            System.out.println(input1 + " > " + input2);
            System.out.println(input1+" != "+ input2);
        }
        else if (input1 < input2){
            System.out.println(input1 + " < " + input2);
            System.out.println(input1+" != "+ input2);
        }
        else if (input1 == input2){
            System.out.println(input1 + " = " + input2);
            System.out.println(input1+" = "+ input2);
        }




    }
}
