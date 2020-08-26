package class_March4;

public class Review2 {

    public static int [][] arrInt(int x){
        int [][] arrInt = new int[x][x];
        int counter=1;
        for (int i=0; i<x; i++){
            for (int j=0; j<x; j++){
                arrInt[i][j]=counter;
                counter++;
            }
        }
        return arrInt;
    }
    public static void main(String[] args) {
        int [][] arrPrint  = arrInt(10);
        for (int i=0; i<arrPrint.length; i++){
            for (int j=0; j<arrPrint[i].length; j++){
                System.out.print("\t"+arrPrint[i][j]);
            }
            System.out.println();

        }


    }

}
