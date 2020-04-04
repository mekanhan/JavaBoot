package Class_Feb15;

public class Print_Nested_Calendar_2_FOR_DoWHILE {
    public static void main(String[] args) {
        //Print numbers for 2020 (Assume all months are 30 days)
        for (int month=1; month <13; month++){
            int day=1;
            int year =2020;
            System.out.println("Month: "+month+" \n*********");
            do{
            System.out.println(month+"/"+day+"/"+year);
            day++;
            }
             while(day<31);
        if (month!=12)
        System.out.println("---------");
        }

    }
}
