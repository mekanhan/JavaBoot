package Class_March2;

import javax.swing.plaf.IconUIResource;

public class TwoDimArray {
    public static void main(String[] args){
        int[][] arr=new int[3][3];
        int counter=1;
        for (int i=0; i<arr.length; i++){
            for (int j=0; j<arr[i].length; j++){
                arr[i][j]=counter;
                counter++;
            }
        }
        for (int i=0; i<arr.length; i++){
            for (int number: arr[i]){
                System.out.print("\t"+number);
            }
            System.out.println();
        }
    }

}
