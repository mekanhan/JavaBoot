package Class_Feb15;

public class Problem2_LoopNumberWhile {
    public static void main(String[] args) {
        //Print given output using java:
        // For outer loop
        // while inner loop
        // 1  2  3  4
        // 6  7  8  9
        //11 12 13 14

       int counter;
       int number=1;
       for (int i=1; i<=3; i++){  //number of lines = 4
           counter=1;
           while (counter<6){
//               if (number%3==0){
//                   System.out.println();
//               }
//               else {
//                   System.out.println();
//               }
               System.out.print(number+ "\t\t");
               counter++;
               number++;
           }

       }
        System.out.println();


    }
}
