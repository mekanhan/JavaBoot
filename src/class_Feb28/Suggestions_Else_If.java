package class_Feb28;

public class Suggestions_Else_If {
    public static void main(String[] args) {
        pickMeFoodRandomly();
        decideCloth();
    }
    public static void pickMeFoodRandomly(){
        int choice = (int)(Math.random()*3)+1;
        if (choice==1){
            System.out.println("Drink Soup");
        }
        else if (choice==2){
            System.out.println("Eat Hamburger");
        }
        else if (choice==3){
            System.out.println("Enjoy Salad");
        }
        else   {
            System.out.println("Not valid");
        }

    }

    public static void  decideCloth(){
        int decision = (int)(Math.random()*3+1);
        if (decision==1){
            System.out.println("Red shirt");
        }
        else if (decision==2){
            System.out.println("Blue shirt");
        }
        else if (decision==3){
            System.out.println("Black shirt");
        }
        else  {
            System.out.println("Not valid");
        }
    }
}
