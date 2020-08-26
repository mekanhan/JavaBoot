package class_Feb_0;

public class Grades_Else_ElseIf {
    public static void main(String[] args){

        //0-49 fail
        //50-59 D
        //60-69 C
        //70-79 B
        //80-89 A
        //90-100 A+
        int Grade = 101;

        if (Grade<0){
            System.out.println("Value cannot be below zero");
        }
        else if (Grade<50){
            System.out.println("Fail");
        }
        else if (Grade<60){
            System.out.println("D");
        }
        else if (Grade<70){
            System.out.println("C");
        }
        else if (Grade<80){
            System.out.println("B");
        }
        else if (Grade<90){
            System.out.println("A");
        }
        else if (Grade<101){
            System.out.println("A+");
        }
        else {
            System.out.println("Grade cannot be greater than 101");
        }
    }
}
