package Class_Feb19;

public class Print_Triangle_Flipped {
    public static void main(String[] args){
        char myChar='*';
        char myChar1='*';

        for(char i=0; i<10; i++){

            for(char j=10; j>i; j--){
                System.out.print("*\t");
            }
            System.out.println("\n");
        }
    }

}
