package class_Feb28;

public class Suggestions {
    public static void main(String[] args) {
        pickMeFoodRandomly();
    }
    public static void pickMeFoodRandomly(){
        int choice = (int)(Math.random()*3)+1;
        if (choice==1){
            System.out.println("Drink Soup");
        }
        if (choice==2){
            System.out.println("Eat Hamburger");
        }
        if (choice==3){
            System.out.println("Enjoy Salad");
        }

    }
}
