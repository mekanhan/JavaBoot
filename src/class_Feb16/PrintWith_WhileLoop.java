package class_Feb16;

public class PrintWith_WhileLoop {
    public static void main(String[] args) {
        int i=1;
        while (i<6) {
            System.out.print(i);        // number column must be before inner loop starts
            char letter='a';
            while(letter<'e'){
                System.out.print("\t" + letter);
                letter++;               //increments to avoid infinite loop
            }
            i++;                        //number increment must be put outside with outside loop
            System.out.println();       //to print new line, print must be in outer loop

        }
    }

}
