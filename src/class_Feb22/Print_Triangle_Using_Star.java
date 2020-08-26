package class_Feb22;

public class Print_Triangle_Using_Star {
    public static void main(String[] args){


        for (int i=1; i<10; i++){

            for (int j=10; j>=i; j--){
                System.out.print("1");
            }
            for (int k=1; k<=i; k++){
                System.out.print("* ");
            }
            for (int g=10; g>=i; g--){
                System.out.print("3");
            }

            System.out.println();
        }

    }

}
