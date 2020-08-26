package class_March14_Constructor;
import java.util.Scanner;
public class selfishnessLevel {
    public static void main(String[] args) {
        selfishnessLevel();
    }
    public static void selfishnessLevel(){
        Scanner x=new Scanner(System.in);
        String [] questions={"Q1:", "Q2:", "Q3:", "Q4:"};
        int sum=0;
        int [] answers=new int [questions.length];
        for(int i=0; i<questions.length; i++){
            System.out.println(questions[i]);
            answers[i]=x.nextInt();
            sum+=answers[i];
        }
        if(sum<=10){
            System.out.println("not selfish");

        }
        else if(sum>11 && sum<=30){
            System.out.println("selfish");
        }
        else if(sum>30){
            System.out.println("super selfish");
        }
        else{
            System.out.println("undefined");
        }

    }
}