package class_LOOPS;

public class ForLoops1 {
    public static void main(String[] args) {
        long y = 1;
        for (int i=0; i<100; i++){
            char x = (char) y;
            System.out.println(x);
            y=y+1;
        }
    }
}
