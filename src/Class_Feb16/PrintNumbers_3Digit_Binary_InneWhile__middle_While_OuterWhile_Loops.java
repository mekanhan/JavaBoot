package Class_Feb16;

public class PrintNumbers_3Digit_Binary_InneWhile__middle_While_OuterWhile_Loops {
    public static void main(String[] args){
    /* Print all binary numbers 0-7 using loop

    */
        int i=0;
        int j, k;
        while(i<2){

            j=0;
            while(j<2){
                k=0;
                while(k<2){
                    System.out.print(i+""+j+""+k);
                    System.out.println();
                k++;
                }
                j++;
            }
            i++;

        }

    }
}
