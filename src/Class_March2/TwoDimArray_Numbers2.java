package Class_March2;

public class TwoDimArray_Numbers2 {
    public static void main(String[] args) {

        String word = "";
        int wordLength = (int) (Math.random() * 6 + 1);
        for (int i = 0; i < wordLength; i++) {
            word += (char) ((int) (Math.random() * 26 + 97));
        }
    }
}


