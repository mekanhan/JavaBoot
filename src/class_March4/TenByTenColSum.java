package class_March4;

public class TenByTenColSum {
    public static void main(String[] args) {
//        int[][] numbers= Array10x10.geneateArray(arraSize:3);
//        printSumOfColumns(numbers);
    }
    public static void printSumOfColumns(int [][] arr){
        for (int i=0; i<arr.length; i++){
            int sum=0;
            for (int j=0; j<arr[i].length; j++){
                sum = sum + arr[j][i];
            }
            System.out.println(sum);
        }
    }
}
