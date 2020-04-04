package Class_Feb_0;

public class StringCompare2 {
    public static void main(String[] args){
        String a = "a";
        String b = "a";
        System.out.println("Using == signs won't compare strings. It will only tell you if it is the same or not");
        if(a==b){
            System.out.println("Hello \n");
        }
        String c = new String( "x");
        String d = new String(  "x");

        if(c==d) {
            System.out.println("World");
        }
        System.out.println("Use .equals to compare strings");
        if(a.equals(b)){
            System.out.println("Hello");
        }
        String e = new String( "x");
        String f = new String(  "x");

        if(c.equals(d)) {
            System.out.println("World");
        }


    }
}
