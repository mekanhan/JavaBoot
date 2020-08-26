package class_March1;

public class Array_Divide {
    public static void main(String[] args) {


        int a[]= {1,2,3,4,5,6,7,8,9};
        int length=a.length;


        for (int i=a[0]; i<a.length-4; i++){
            System.out.print(i);
        }
        System.out.println("\n");
        
        for (int j=a[4]; j<length; j++){
            System.out.print(a[j]);
        }



    }
}