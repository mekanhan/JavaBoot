package Class_Feb_0;
import java.util.Scanner;

public class TeslaCarPurchase_If_ElseIf {

    /* Design a car purchase system
    Model X MSRP = $30,000
        Options:
                Body package = $5,000
                Sound package = $3,000
     Model Y MSRP = $35,000
        Options:
                Entertainment package = $8,000
                Safety package = $3,000
     */
    public static void main(String[] args){
    Scanner car = new Scanner(System.in);
    System.out.println("Which care you want to buy Model X or Model Y (X/Y)? ");
    String car1 = car.next();

        double SubTotal;
        double SubTotal1_1;
        double SubTotal1_2;
        double SubTotal1_3;
        double SubTotal2;


        // ModelX
        if (car1.equalsIgnoreCase("X")){
                double ModelX = 30000;

                System.out.println("Model X :" + ModelX);
                Scanner a = new Scanner(System.in);

                // if Body Package > Sound Package??
                System.out.println("Would you like to buy Body package (Y/N)? ");
                String car1_2 = a.next();

                if (car1_2.equalsIgnoreCase("Y")){
                    double BodyPackage = 5000;
                    SubTotal = ModelX + BodyPackage;
                    System.out.println("Model X and Body Package: " + SubTotal);
                    //Sound Package
                    System.out.println("Would you like to buy Sound package (Y/N)? ");
                    String car1_3 = a.next();

                    if (car1_3.equalsIgnoreCase("Y")){
                        double SoundPackage = 3000;
                        SubTotal1_1 = SubTotal  + SoundPackage;
                        System.out.println("Model X, Body Package & Sound Package: " + SubTotal1_1);
                    }
                    else if (car1_3.equalsIgnoreCase("N")){
                        SubTotal1_1 = ModelX + BodyPackage;
                        System.out.println("Model X " + SubTotal1_1);
                    }

                }
                // No Body Package > Sound Package
                else if (car1_2.equalsIgnoreCase("N")){
                    SubTotal = ModelX;
                    System.out.println("Model X: " + SubTotal);
                    //Sound Package
                    System.out.println("Would you like to buy Sound Package (Y/N)? ");
                    String car1_3 = a.next();
                    if (car1_3.equalsIgnoreCase("Y")){
                        double SoundPackage = 3000;
                        SubTotal1_1 = SubTotal  + SoundPackage;
                        System.out.println("Model X & Sound Package: " + SubTotal1_1);
                    }
                    else if (car1_2.equalsIgnoreCase("N")){
                        SubTotal1_1 = ModelX;
                        System.out.println("Model X " + SubTotal1_1);
                    }
                }
            }
        // ModelY
        if (car1.equalsIgnoreCase("Y")){
            double ModelY = 35000;

            System.out.println("Model Y :" + ModelY);
            Scanner a = new Scanner(System.in);

            // if Body Package > Sound Package
            System.out.println("Would you like to buy Body package (Y/N)? ");
            String car1_2 = a.next();

            if (car1_2.equalsIgnoreCase("Y")){
                double BodyPackage = 5000;
                SubTotal = ModelY + BodyPackage;
                System.out.println("Model Y and Body Package: " + SubTotal);
                //Sound Package
                System.out.println("Would you like to buy Sound package (Y/N)? ");
                String car1_3 = a.next();

                if (car1_3.equalsIgnoreCase("Y")){
                    double SoundPackage = 3000;
                    SubTotal1_1 = SubTotal  + SoundPackage;
                    System.out.println("Model X, Body Package & Sound Package: " + SubTotal1_1);
                }
                else if (car1_3.equalsIgnoreCase("N")){
                    SubTotal1_1 = ModelY + BodyPackage;
                    System.out.println("Model X " + SubTotal1_1);
                }

            }
            // No Body Package > Sound Package
            else if (car1_2.equalsIgnoreCase("N")){
                SubTotal = ModelY;
                System.out.println("Model Y: " + SubTotal);
                //Sound Package
                System.out.println("Would you like to buy Sound Package (Y/N)? ");
                String car1_3 = a.next();
                if (car1_3.equalsIgnoreCase("Y")){
                    double SoundPackage = 3000;
                    SubTotal1_1 = SubTotal  + SoundPackage;
                    System.out.println("Model Y & Sound Package: " + SubTotal1_1);
                }
                else if (car1_2.equalsIgnoreCase("N")){
                    SubTotal1_1 = ModelY;
                    System.out.println("Model X " + SubTotal1_1);
                }
            }
        }

            else {
                System.out.println("Please choose only X or Y");

            }


    }


}

