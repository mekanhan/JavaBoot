package Class_March2;

public class Array_Random {
    /*
    Create random int array and print all elements using for each loop
    Create random String array and print all elements using for each loop
     */
    public static void main(String[] args){
        int [] arrayNumbers= new int[10];
        for(int i=0; i<arrayNumbers.length; i++){
            arrayNumbers[i]=(int)(Math.random()*1000);
        }
        for (int number:arrayNumbers){
            System.out.println(number);
        }
    }

}
