package class_Feb26;

public class InternetSpeed {
    public static void main(String[] args) {

        System.out.println(internetSp(5));
    }
    public static String internetSp(int speed) {

    /*
    if inet up to 100 return "speed is alright"
     100-300 good speed
     300+ super speed
    1500+ "Start saving energy"
     */
        String decision;
        if (speed>80 && speed<100){
            decision= "Your internet Sucks!";
        }
        else if(speed>=100 && speed<300){
            decision="Not bad bro!";
        }
        else if(speed>=300){
            decision="You have got your own satellite!";
        }

        else {
            decision="I feel bad for you!";
        }
        return decision;
    }


}
