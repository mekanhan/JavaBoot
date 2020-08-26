package class_Feb15;

public class Print_Nested_Calendar_FOR_FOR {
    public static void main(String[] args) {
        //Print numbers for 2020 (Assume all months are 30 days)
        for (int month=0; month <5; month++){
            int year =2020;
            System.out.println("Month: "+month+" \n*********");
            for ( month=0; month<=6; month+=2 ){
                System.out.println("/"+month+"/"+year);
            }
            if (month!=12)
            System.out.printf("----------\n");
        }

    }
}
