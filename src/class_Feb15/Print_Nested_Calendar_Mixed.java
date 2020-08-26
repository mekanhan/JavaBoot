package class_Feb15;

public class Print_Nested_Calendar_Mixed {
    public static void main(String[] args) {
        //Print numbers for 2020 (Assume all months are 30 days)

        //while and for implementation
        int month=1;
        while(month<13){
            for (int day=1; day<30; day++){
                System.out.println(month+"/"+day+"/"+"2020");
            }

        }

        //for and while
        int dayWhile;
        for (int monthFor=1; monthFor<13; monthFor++){
            dayWhile=1;
            while(dayWhile<=30){
                System.out.println(monthFor+"-"+dayWhile+"-"+"2020");
                dayWhile++;
            }

        }

    }
}
