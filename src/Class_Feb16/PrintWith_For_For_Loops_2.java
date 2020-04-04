package Class_Feb16;

public class PrintWith_For_For_Loops_2 {
    public static void main(String[] args){
        int i=1;


        for (i=1; i<6; i++){
            System.out.print(i);
            int count=1;
            char letter='a';
            for(count=1; count<5; count++){
                System.out.print("\t"+letter);
                letter++;
            }
            System.out.println();
            i++;
        }

    }

}
