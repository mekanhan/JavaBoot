package class_March1;

public class Array_Find_Comm_Elem {
    public static void main(String[] args) {
        int[] array1 = {1,2,3,4,5,6,7,8,9};
        int[] array2 = {5,18,3,7,13,4,15,16,2,8};
        findCommons(array1, array2);
    }
        static void findCommons(int a[],int[] b) {
            //find common elements
            for (int i=0; i<a.length;i++){
                for (int j=0; j<b.length; j++){
                    if (a[i]==b[j]){
                        System.out.println(a[i]);
                    }
                }
            }

        }

}