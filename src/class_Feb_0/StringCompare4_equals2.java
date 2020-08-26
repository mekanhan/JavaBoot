package class_Feb_0;
import java.util.Scanner;

public class StringCompare4_equals2 {
    public static void main(String[] args){

        double totalC;

        Scanner myScan = new Scanner(System.in);
        System.out.print("What is the shape? (C-Circle , R-Rectangle, T-Triangle): ");
        String shape =myScan.next();
        if (shape.compareToIgnoreCase("c")==0){     //Ignore function is to ignore whether the letter is lower or upper case
            Scanner radius = new Scanner(System.in);
            System.out.print("What is the radius?: ");
            double radius1 = radius.nextDouble();
            totalC = 2*3.14*radius1;
            System.out.format("%.2f", totalC);
        }
        else if (shape.compareToIgnoreCase("r")==0){
            Scanner width = new Scanner(System.in);
            System.out.print("What is the width?: ");
            float width1 = width.nextFloat();
            Scanner height = new Scanner(System.in);
            System.out.print("What is the height?: ");
            float height1 = height.nextFloat();
            System.out.println(width1*height1);
        }
        else if(shape.compareToIgnoreCase("t")==0){
            Scanner edge1 = new Scanner(System.in);
            System.out.print("What is the edge 1?: ");
            float edge1_1 = edge1.nextFloat();
            Scanner edge2 = new Scanner(System.in);
            System.out.print("What is the edge 2?: ");
            float edge2_2 = edge2.nextInt();
            Scanner edge3 = new Scanner(System.in);
            System.out.print("What is the edge 3?: ");
            float edge3_3 = edge3.nextInt();
            System.out.println(edge1_1+edge2_2+edge3_3);
        }
        else {
            System.out.println("Please input C, R, or T");
        }
    }
}
