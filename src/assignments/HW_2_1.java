package assignments;
import java.util.*;
    /*
    Expandable Multiplication Table based on user input
     */
public class HW_2_1 {
    public static void main(String[] args){

        Scanner number = new Scanner(System.in);
        System.out.println("Enter start number: ");
        int start=number.nextInt();
        System.out.println("Enter ending number: ");
        int end=number.nextInt();

        if (start<end) {

            System.out.println("Table range is from " + start + " - " + end);

            for (int j = start; j <= end; j++) {
                System.out.print("\t\t" + j);
            }
            System.out.println('\n');
            for (int x = start; x <= end; x++) {
                System.out.print("--------");

            }
            System.out.println('\n');

            for (int i = start; i <= end; i++) {
                System.out.print(i + "\t|");
                for (int j = start; j <= end; j++) {
                    System.out.print("\t" + (i * j) + "\t");
                }

                System.out.println('\n');
            }
        }

        else {
            System.out.println("End number must be larger than start number");
        }


    }
}
