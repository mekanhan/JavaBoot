package Class_March4;

import java.lang.reflect.Array;

public class StringArray {
    public static void main(String[] args) {
        //How many characters in Array String?

        }

    public static int Sentence(String sentence) {
        String[] Array = {"I Love Java"};
        int count = 0;
        for (int i = 1; i < Array.length; i++) {
            if (sentence.charAt(i) == ' '){
                count++;
            }
        }
        return count;
    }





}

