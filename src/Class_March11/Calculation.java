package Class_March11;

public class Calculation {
    public static void main(String[] args) {

    }
    public static void doCalculation(int firstNumber, int secondNumber, String operation){
        if (operation.equalsIgnoreCase("add")){
            System.out.println(firstNumber+secondNumber);
        }
        else if (operation.equalsIgnoreCase("subst")){
            System.out.println(firstNumber-secondNumber);
        }
        else if (operation.equalsIgnoreCase("multiplication")){
            System.out.println(firstNumber*secondNumber);
        }
    }
}
