package class_March4;

public class Array10x10 {
    public static void main(String[] args) {
        int [][]numbers = new int [10][10];
        printRowSums(numbers);

    }
        public static void  printRowSums(int[][] arr){
            for (int i=0; i<arr.length; i++){
            int sum=0;
                for (int j=0; j<arr[i].length; j++) {
                    sum=sum+arr[i][j];
                }
                System.out.println("Sum of row " +i+" : "+sum);
            }
        }

}
