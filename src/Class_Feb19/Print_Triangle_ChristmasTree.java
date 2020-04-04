package Class_Feb19;

public class Print_Triangle_ChristmasTree {
    public static void main(String[] args){

        // For Loop
        for(int i=1; i<=10; i++){

            for (int j=10; j>=i; j--){
                System.out.print(" ");
            }
            for (int k=1; k<=i; k++){
                System.out.print("* ");
            }
            
            System.out.println();
        }

        // While Loop
        int i=1;
        while(i<10){
            int  j=10;
            while (j>9){
                System.out.print(" ");
                int k=0;
                while (k<i){
                    System.out.print("* ");
                    k++;
                }
                j--;

            }
            System.out.println();
            i++;
        }

    }

}
