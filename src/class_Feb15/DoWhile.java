package class_Feb15;

public class DoWhile {
    public static void main(String[] args){
        int counter=10;      //declared and initialized
        do {
            System.out.println("counter: " +counter);
            counter++;
        }
        while(counter<=10);
        System.out.println("With while loop");

        int counter2=10;

        while(counter2<=10){          // if 10<10 is false because not equal
            System.out.println(counter);
            counter2++;
        }
    }
}
