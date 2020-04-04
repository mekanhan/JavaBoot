package Assignments;

public class HW_3 {
    public static void main(String[] args){
        //Print numbers from 100-0 with 1/2 step using do while loop: 100, 99.5, 99
        //100 should not contain any decimals so need to use float or else
        int counter=100;
        do{
            System.out.println(counter);
            System.out.println(counter-0.5);
            counter--;
        }
        while(counter>0);

    }
}
