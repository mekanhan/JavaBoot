package assignments;

public class HW_3_Calendar_1_FOR_LOOP {
    public static void main(String[] args) {
        //Print numbers for 2020 (Assume all months are 30 days)

        for (int month=1; month <13; month++) {
            int year = 2020;
            int day=1;
            System.out.println("Month: " + month + " \n*********");
            while (day<31) {
                System.out.println(month + "/" + day + "/" + year);
                day++;
            }

            if (month != 12)
                System.out.printf("----------\n");

        }
    }
}
