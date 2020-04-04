package Class_Feb16;

public class PrintNumbers_InnerFor_OuterFor_Loops {
    public static void main(String[] args){
    /* Print numbers from 10-99 using nested loop
    example
    1(outer loop) 0(inner loop) = 10
    1(outer loop) 1(inner loop) = 11
    ...
    */
         for (int i=1; i<=9; i++){

             for (int j=0; j<10; j++){
                 System.out.print(i+""+j);       // i value must be inside of the inner loop

                 System.out.println();
             }

         }

    }
}
