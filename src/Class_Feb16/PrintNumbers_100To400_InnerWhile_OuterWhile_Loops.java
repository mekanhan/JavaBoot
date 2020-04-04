package Class_Feb16;

public class PrintNumbers_100To400_InnerWhile_OuterWhile_Loops {
    public static void main(String[] args){
    /* Print numbers from 100-399 using nested loop
    example
    1(outer loop) 0(middle) 0(inner loop) = 100
    1(outer loop) 0(middle) 1(inner loop) = 101
    ...
    */
        int i=1;
        int j, k;
        while(i<4){
            j=0;
            while(j<10){
                k=0;
                while(k<10){
                    System.out.println(i+""+j+""+k);     // i,j values must be inside of the inner loop
                k++;
                }
                j++;
            }
            i++;
        }

    }
}
