package Class_Feb28;

public class Arrays_2 {
    public static void main(String[] args) {
        String[] letters= {"abc","defgh", "qwerty","asd"};
        int count=0;
        for (int i=0; i<letters.length; i++){

            if (letters[i].length()<4){
                count++;
            }
        }
        System.out.print(count);
    }
}
