package class_LOOPS;

public class ForLoop3 {
    public static void main(String[] args) {
        for (int i=0; i<100; i++){
            int x = (i%2==0)?i:0;
            System.out.println(x);
        }
        for (int j=0; j<100; j++){
            int x = (j%2==0)?0:j;
            System.out.println(x);
        }
    }
}
