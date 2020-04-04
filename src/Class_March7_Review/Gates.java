package Class_March7_Review;

public class Gates {
    public static void main(String[] args) {
        String destination= "Africa";
        if (destination.equalsIgnoreCase("Europe")){
            System.out.println("To Gate A");
        }
        else if (destination.equalsIgnoreCase("Africa")){
            System.out.println("To Gate B");
        }
        else if (destination.equalsIgnoreCase("Asia")){
            System.out.println("To Gate C");
        }
        else if (destination.equalsIgnoreCase("America")){
            System.out.println("To Gate D");
        }
        else {
            System.out.println("Please re-enter your destination");
        }
    }
}
