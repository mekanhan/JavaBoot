package Class_March2;

public class TwoDimArray_TenByTen {
    public static void main(String[] args) {
        int[][] arrInt = new int[10][10];
        int counter = 1;
        for (int i = 0; i < arrInt.length; i++) {
            for (int j = 0; j < arrInt[i].length; j++) {
                arrInt[i][j] = counter;
                counter++;
                System.out.print("\t" + arrInt[i][j]);
            }
            System.out.println();
        }
    }
}
