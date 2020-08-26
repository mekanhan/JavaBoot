package class_March1;

public class Array_Min {
    public static void main(String[] args) {
        int arrayNumbers [] ={99,5,7,253,6,9};
        System.out.println(findMax(arrayNumbers));
    }
    static int findMax(int [] arr){
        int min=arr[0];
        for (int i=0; i<arr.length; i++){
            if (arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
}
