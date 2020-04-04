package Class_March1;

public class Array_Max {
    public static void main(String[] args) {
        int arrayNumbers [] ={99,5,7,253,6,9};
        System.out.println(findMax(arrayNumbers));
    }
    static int findMax(int [] arr){
        int max=arr[5];
        for (int i=0; i<arr.length; i++){
            if (arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
}
