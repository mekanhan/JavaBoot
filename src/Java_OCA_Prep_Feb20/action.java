package Java_OCA_Prep_Feb20;

public class action {
    public static void main(String[] args){
        String action=" ";
        int age=40;
        action = age > 25? "Go" : age > 18? "Go" : "Don't";
        System.out.println(action);
    }
}
