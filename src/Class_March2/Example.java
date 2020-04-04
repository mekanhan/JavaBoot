package Class_March2;

public class Example {
    public static void main(String[] args) {
        int []arr={53,84,265,239,4};
        System.out.println(findMax(arr));

    }
    static int findMax(int [] arr){

    int length=arr.length;
    int max= arr[0];
        for (int i=0; i<length; i++){
        if (arr[i]>max){
            max=arr[i];

        }

        }
        return max;
    }

}
