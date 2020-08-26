package class_Feb_0;
import java.util.Scanner;
public class StringCompare4_equals {
    public static void main(String[] args){

        String C, R, T;
        Scanner Shape = new Scanner(System.in);
        System.out.print("What is the shape? (C-Circle , R-Rectangle, T-Triangle): ");
        String input =Shape.nextLine();         //Remember nexLine for string

        if (input.equals("C")){
            Scanner radius = new Scanner(System.in);
            System.out.print("What is the radius?: ");
            int radius1;
            int input1 =radius.nextInt();
            System.out.println((input1*2*3.14));
        }
        else if(input.equals("R")){
            Scanner width = new Scanner(System.in);
            System.out.print("What is the width?: ");
            int width1;
            int input1 =width.nextInt();
            Scanner height = new Scanner(System.in);
            System.out.print("What is the height?: ");
            int height1;
            int input2 =height.nextInt();
            System.out.println(input1*input2);
        }
        else if(input.equals("T")){
            Scanner edge1 = new Scanner(System.in);
            System.out.print("What is the edge 1?: ");
            int edge1_1;
            int input1 =edge1.nextInt();
            Scanner edge2 = new Scanner(System.in);
            System.out.print("What is the edge 2?: ");
            int edge2_2;
            int input2 =edge2.nextInt();
            Scanner edge3 = new Scanner(System.in);
            System.out.print("What is the edge 3?: ");
            int edge3_3;
            int input3 =edge3.nextInt();
            System.out.println(input1+input2+input3);
        }
        else{
            System.out.println("Please input C, R, or T");
        }
    }
}
