package Class_Feb12;

public class Nested_For_If_ElseIf {
    public static void main(String[] args) {

        //Print Hello World like: Hello (outer loop) and World World World (inner loop)
        /* for (int i = 0; i<1; i++) {
            System.out.println("Hello ");
            for (int j=1; j<4; j++)
                System.out.println("world");
        }
         */
         /*   //Print Hello World like: Hello Hello Hello (inner loop) and World (outer loop)
        for (int j=1; j<4; j++) {
            System.out.println("Hello ");
        }
        System.out.println("World");
        */

        //Print Hello World like: Hello Hello Hello (inner loop) and World (outer loop)
        for (int j=1; j<4; j++) {
            System.out.println("Hello ");
        }
            for (int i=1; i<2; i++) {
                System.out.println("World");
            }



    }
}
