package Class_Feb15;

public class Problem2_3_FilteringSomeNumbers {
    public static void main(String[] args) {
        //Print given output using java:
        // For loop
        // while loop
        // 1  2  3  4  5
        // 6  7  8  9 10
        //11 12 13 14 15


        //for loop
        int number=2;
        for (int i=1; i<5; i++){
            for (int j=1; j<7; j++){
                if (number>17 && number<23){
                    System.out.print(" " + "\t");
                }
                else {
                    System.out.print(number+"\t");
                }
                number+=2;
            }
            System.out.println();
        }








    }
}
