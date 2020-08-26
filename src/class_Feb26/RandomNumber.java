package class_Feb26;

public class RandomNumber {
    public static void main(String[] args){
        generatePass();
    }
        public static void generatePass(){
            for (int i=0; i<100; i++){
                System.out.println(100+ (int)(Math.random()*100) );
            }
        }

}
