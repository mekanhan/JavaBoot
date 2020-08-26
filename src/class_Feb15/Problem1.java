package class_Feb15;

public class Problem1 {
    public static void main(String[] args){
        //Print numbers from 100-0 with 1/2 step using do while loop: 100, 99.5, 99
        double counter=100;
        do{
            System.out.println(counter);
            counter-=0.5;
        }
        while(counter>0);

    }
}
