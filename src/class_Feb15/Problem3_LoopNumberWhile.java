package class_Feb15;

public class Problem3_LoopNumberWhile {
    public static void main(String[] args) {
        //Print given output using java:
        // For loop
        // while loop
        // 1 a b c d
        // 2 a b c d
        // .....

        //for loop
       for (int i=1; i<=6; i++){  //number of lines =
           System.out.print(i+"\t");
           for (char letter ='a'; letter<'e'; letter++){
                System.out.print("\t"+ letter+"\t");

           }
           System.out.println("\n");
       }

//        //while loop
//        int number1=1;
//        while(number1<6) {
//            System.out.println(number1 + " a b c d");
//            number1++;
//        }


    }
}
