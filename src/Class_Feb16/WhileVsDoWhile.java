package Class_Feb16;

public class WhileVsDoWhile {
    public static void main(String[] args) {
        do{
            System.out.println("We are in love with Java");
        }
        while(false);

        boolean sentinel=true;
        while(sentinel){
            System.out.println("Nooo");
            sentinel=false;             //this line prevents from infinite loop
        }
    }
}
