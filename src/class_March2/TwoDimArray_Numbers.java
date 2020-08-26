package class_March2;

public class TwoDimArray_Numbers {
    public static void main(String[] args){
        int[][] arr=new int[3][3];

        for (int i=0; i<arr.length; i++){
            for (int j=0; j<arr[i].length; j++){
                arr[i][j]=(int)(Math.random()*10);
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
