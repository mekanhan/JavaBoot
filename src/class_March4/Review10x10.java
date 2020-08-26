package class_March4;

public class Review10x10 {
    public static void main(String[] args) {
        int [][] arrNum= arrInt(10);
        for (int i=0; i<arrNum.length; i++){
            for (int j=0; j<arrNum[i].length; j++){
                System.out.print("\t" + arrNum[i][j]);
            }
            System.out.println();
        }

    }

    public static int [][] arrInt(int x){
        int Number [][] = new int [x][x];
        int counter=1;
        for (int i=0; i<x; i++){
            for (int j=0; j<x; j++){
                Number[i][j]=counter;
                counter++;
            }
        }
        return Number;


    }
}
