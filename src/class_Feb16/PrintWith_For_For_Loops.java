package class_Feb16;

public class PrintWith_For_For_Loops {
    public static void main(String[] args){
        int i=1;
        char letter;

        for (i=1; i<6; i++){
            System.out.print(i);
            int count=1;
            for (letter='a'; letter<'e'; letter++) {        //each line will be repetitive a through d

                System.out.print("\t"+letter);
            }
            System.out.println();
        }

    }

}
