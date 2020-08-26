package class_March12_Review;

import java.util.Arrays;

public class ZeroesAndNonZeroes {
    public static void main(String[] args) {
     int [] numbers = {0,5,4,2,1,0};
     int [] result = zeroes(numbers);
        System.out.println(Arrays.toString(result));
    }


    public static int[] zeroes(int [] array){
        int[] separated =new int[array.length];
        int index=0;
        for (int i=0; i<array.length; i++){
            if (array[i]!=0){
                separated[index]=array[i];
                index++;
            }
        }
        return separated;
    }

}
