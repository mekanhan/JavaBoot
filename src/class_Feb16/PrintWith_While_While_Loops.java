package class_Feb16;

public class PrintWith_While_While_Loops {
    public static void main(String[] args) {
        int i=1;
        int count;
        char letter='a';                // char must be outside loops in order to print a,b,c...t. If place it in
                                        // inner loop then it will print a,b,c,d, same for every line.

        while (i<6) {
            System.out.print(i);        // number column must be before inner loop starts
            count = 0;
            while(count<1){
                System.out.print("\t" + letter);
                letter++;               //increments to avoid infinite loop
                count++;
            }
            i++;                        //number increment must be put outside with outside loop
            System.out.println();       //to print new line, print must be in outer loop

        }
    }

}
