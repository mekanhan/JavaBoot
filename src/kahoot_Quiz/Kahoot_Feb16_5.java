package kahoot_Quiz;


public class Kahoot_Feb16_5 {
    public static void main(String[] args) {

        int a;
        int b = 5;

        for(a=b++; a!=b; ++a){
            System.out.println(a+" "+b);
            ++b;
            if(a>6){
                a=0;
                b=1;
            }
        }
    }
}
