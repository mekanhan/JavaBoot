package class_March4;

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

