package Class_Feb_0;

import java.util.Scanner;

public class Electric_Bill {
    public static void main(String[] args){

        //Calculate the electric bill according to total electric usage as kw
        // <500 = $0.3/kw
        // 500 - 1000 = $0.4/kw
        // 1000 - 2000  = $0.5/kW
        // 2000 > = $0.6/kW
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please enter Total electric bill:\n");
        int TotalKW = myScanner.nextInt();

        if (TotalKW<501) {
            System.out.println("$" + 500*0.3);
        }
        else if ( (TotalKW>501) && (TotalKW<1001)){
            System.out.println("$" + TotalKW*0.4);
        }
        else if ( (TotalKW>1002) && (TotalKW<2001)){
            System.out.println("$" + TotalKW*0.5);
        }
        else {
            System.out.println("$" + TotalKW*0.5);
        }
            // Alternative way without system output
        System.out.println("alternative calculation w/6o System output");
        double electricBill;
        if (TotalKW<501) {
            electricBill = TotalKW*0.3;
        }
        else if ( (TotalKW>501) && (TotalKW<1001)){
            electricBill = TotalKW*0.4;

        }
        else if ( (TotalKW>1002) && (TotalKW<2001)){
            electricBill = TotalKW*0.5;
        }
        else {
            electricBill = TotalKW*0.6;
        }
        System.out.format("$%.2f", electricBill);
    }
}
