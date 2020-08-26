package class_Feb28;

public class Suggestions_Using_Switch {
    public static void main(String[] args) {
        pickMeFoodRandomly();
    }
    public static void pickMeFoodRandomly(){
       int choice = (int)(Math.random()*3)+1;
        switch (choice){
            case 1:
                System.out.println("Drink Soup");
                break;
            case 2:
                System.out.println("Eat Hamburger");
                break;
            case 3:
                System.out.println("Enjoy Salad");
                break;

        }
    }
}
