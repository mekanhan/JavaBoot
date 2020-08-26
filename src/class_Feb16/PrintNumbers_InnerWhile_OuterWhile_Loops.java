package class_Feb16;

public class PrintNumbers_InnerWhile_OuterWhile_Loops {
    public static void main(String[] args){
    /* Print numbers from 10-99 using nested loop
    example
    1(outer loop) 0(inner loop) = 10
    1(outer loop) 1(inner loop) = 11
    ...
    */
        int i=1;
        int j;
        while(i<10){
            j=0;
            while(j<10){
                System.out.println(i+""+j);     // i value must be inside of the inner loop
                j++;
            }
            i++;
        }

    }
}
