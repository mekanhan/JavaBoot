package class_March14_Constructor;

public class Car_Constructor {
    int modelYear;
    String modelName;
    double modelEngine;
    public Car_Constructor(int year, String name, double engine){
        modelYear = year;
        modelName = name;
        modelEngine= engine;

    }

    public static void main(String[] args){
//        Scanner Can't be used with Constructors
//        System.out.println("Advance Car Search: \nModel: \nMake: \nEngine: ");
//        Scanner InYear = new Scanner(System.in);
//        int modelYear = InYear.nextInt();
//        Scanner InMake = new Scanner(System.in);
//        int modelMake = InMake.nextInt();
//        Scanner InEngine = new Scanner(System.in);
//        double modelEngine = InEngine.nextDouble();

        Car_Constructor myCar1 = new Car_Constructor(1987, "Mustang", 3);
        Car_Constructor myCar2 = new Car_Constructor(2020, "Porsche", 4);
        System.out.println(myCar1.modelYear + " " + myCar1.modelName + " " + myCar1.modelEngine);
        System.out.println(myCar2.modelYear + " " + myCar2.modelName + " " + myCar2.modelEngine);
    }
}
