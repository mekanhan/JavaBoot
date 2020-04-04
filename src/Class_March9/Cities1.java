package Class_March9;

public class Cities1 {
    //Create Array Cities and Randomize it

    public static String[][] randomCities(int x, int y){
        String [] cities = {"Ann Arbor","Fort Worth","Fairfax","Orlando",
                "Denver","Portland","Phoenix","Arlington","Atlanta",
                "Amarillo","Boulder","Chicago","Albany"};

        String[][] randCities = new String[x][y];
        for (int i=0; i<randCities.length; i++){
           for (int j=0; j<randCities.length; j++){
               randCities[i][j]=cities[(int)(Math.random()*cities.length)];
           }
        }
        return randCities;
    }
    public static void printCitiesA(String[][] cities){
        for(String[] x:cities){
            for(String city:x){
                System.out.println(city);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        String [][] myCities = randomCities(3,3);
        printCitiesA(myCities);
    }
}
