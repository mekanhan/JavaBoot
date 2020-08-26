package java_OCA_Prep_Feb27;

public class Methods2 {
    public static void main(String[] args) {

        System.out.println("Multiplication result: " + multiply(4, 5) );    //can include multiply method in print
    }

    public static void printDistricts(int maxDistrictCount, String cityName) {
        System.out.println("My city: " + cityName);
        for (int i=0; i<maxDistrictCount; i++){
            System.out.println("District: " + i);
        }
    }
    public static int multiply(int x, int y){
        return x * y;       // another shortcut
    }
    public static String getCityDetails(String cityName){
        String zipCode = "";
        String state= "";
        return zipCode + " " + state;
    }






}
