package Class_March7_Review;
import javax.security.sasl.SaslClient;
import java.util.Scanner;
public class GatesSwitchCase {
    public static void main(String[] args) {
        System.out.println("Choose your destination: \n Europe\n Africa\n Asia\n America\n Please enter your destination: ");
        Scanner dest= new Scanner(System.in);
        String destination= dest.nextLine();
        switch (destination){
            case "Europe":
                System.out.println("Go to Gate A");
                break;
            case "Africa":
                System.out.println("Go to Gate B");
                break;
            case "Asia":
                System.out.println("Go to Gate C");
                break;
            case "America":
                System.out.println("Go to Gate D");
                break;
        }
    }
}
