package Class_Feb_0;
import java.util.Scanner;

public class StorePurchase_If_elseIf_equals {
    public static void main(String[] args){

        Scanner a = new Scanner(System.in);
        System.out.print("Size ? (S/M/L): " );
        String size = a.next();
        System.out.println("Member? (Y/N): ");
        String member = a.next();
        if (member.equals("Y")){
            System.out.printf("OK");
        }
        else {
            System.out.println("You have no discounts :(");
        }

        if (size.equals("S") ){
            System.out.println("$9.99");
            }
        else if (size.equals("M")){
            System.out.println("$10.99");
        }
        else if (size.compareToIgnoreCase("L")==0){
            System.out.println("$11.99");
        }
        else  {
            System.out.println("Sorry only S/M/L");
        }

    }

}
