package class_March1;

public class Array_Divide_3 {
    public static void main(String[] args) {

        int myArray[]= {1,2,3,4,5,6,7,8,9};
        int arrayLength=myArray.length;
        //to find in the middle

        int half=arrayLength/2+1;
        System.out.println(half);
        int [] firstHalf= new int[half];
        for (int i=1; i<half; i++){
            firstHalf[i]=myArray[i];
            System.out.print(i+", ");
        }
        System.out.println("\ncenter\n");

        int secondHalf = myArray.length-half;
        for (int i=secondHalf; i<myArray.length; i++){
            System.out.print(i+", ");
        }

    }
}