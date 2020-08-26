package class_March15_Constructor;

public class CarInsuranceTest {
    public static void main(String[] args) {
        CarInsurance Test = new CarInsurance();
        System.out.println("Your estimated car insurance is " + Test.makeOffer());
        System.out.printf("Number of Accidents are private, however... " +  Test.ofAccidents);
        System.out.println("\nNumber of tickets are private, however... " +  Test.ofTickets);

    }
}
