package Class_Feb26;

public class ElectricBill {
    public static void main(String[] args) {
        System.out.println(decideElectricBill(500));
    }
    public static String decideElectricBill(int consumption) {

    /*
    Take consumption as parameter
    if consumption is between 500-1000 return "Good job"
    1000-1500 "not bad"
    1500+ "Start saving energy"
     */
        String decision;
        if (consumption>=500 && consumption<=1000){
            decision= "Good job";
        }
        else if(consumption>=1001 && consumption<=1500){
            decision="Not bad";
        }
        else if(consumption>1501){
            decision="Start Saving Energy";
        }

        else {
            decision="Invalid";
        }
        return decision;
    }


}
