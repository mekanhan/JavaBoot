package class_Feb19;

public class Print_Triangle {
    public static void main(String[] args){
        char myChar='*';
        char myChar1='*';
        for(char i=0; i<10; i++){
            for(char j=1; j<i; j++){
                System.out.print("*\t");
            }
            System.out.println("\n");
        }
    }

}
