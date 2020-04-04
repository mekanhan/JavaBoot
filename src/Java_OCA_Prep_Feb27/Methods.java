package Java_OCA_Prep_Feb27;

public class Methods {
    public static void main(String[] args) {
        int multiplyResult = multiply(4, 5);
        System.out.println(multiplyResult);
    }

    public static void printDistricts(int maxDistrictCount, String cityName) {
        System.out.println("My city: " + cityName);
        for (int i=0; i<maxDistrictCount; i++){
            System.out.println("District: " + i);
        }
    }
    public static int multiply(int x, int y){
        int result = x*y;
        return result;
    }






}
