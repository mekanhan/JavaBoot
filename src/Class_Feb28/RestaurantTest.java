package Class_Feb28;
import java.util.*;
public class RestaurantTest {
    public static void main(String[] args) {
        Restaurant.Menu();
        Scanner order = new Scanner(System.in);
        System.out.print("Choose you Soup (1-Lentil, 2-Tomato, 3-Fish");
        int soup=order.nextInt();
        System.out.print("Choose your meal (1-Rice, 2-Chicken, 3-Beef");
        int meal=order.nextInt();
        System.out.print("Choose your salad (1-Ceaser, 2-Waldorf");
        int salad=order.nextInt();

    }
}
