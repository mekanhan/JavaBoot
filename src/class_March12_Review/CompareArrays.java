package class_March12_Review;
import java.util.Arrays;

public class CompareArrays {
    public static void main(String[] args) {
        int arr1 [] = {1,2,3};
        int arr2 [] = {1,3,3};

        if (arr1.length==arr2.length){
            System.out.println("Length is same");
        }
        else {
            System.out.println("Length is not same");
        }
        if (arr1==arr2){
            System.out.println("The values of arrays are Same");
        }
        else {
            System.out.println("The values of arrays are not Same");
        }
        if (Arrays.equals(arr1,arr2)){
            System.out.println("The arrays are equal");
        }
        else {
            System.out.println("The arrays are not equal");
        }


    }

}
