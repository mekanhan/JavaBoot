package class_March4;

public class Array_OCA {
    public static void main(String[] args) {
//
//       array1 [last]=array2[0]
//       array1 [last-i]=array2[0+i]
        int [] array= {1,2,3,4,5,6,7,8};
        int count=1;
        int length=array.length;
        for (int i=length; i>0; i--){
            int array1=i;
            System.out.print(array1);
        }
        System.out.println("\n");
        for (int j=1; j<=length; j++){
            int array2=j;
            System.out.print(array2);
        }

    }
}
