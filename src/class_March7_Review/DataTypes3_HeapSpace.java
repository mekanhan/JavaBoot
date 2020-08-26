package class_March7_Review;

public class DataTypes3_HeapSpace {
    public static void main(String[] args) {
        double [][] largeDouble = new double[9999][9999];
        System.out.println(largeDouble.length);

        byte [] [] largeByte = new byte [9999][9999];
        System.out.println(largeByte.length);

        //byte= 1 byte
        //double = 8 byte
    }
}
