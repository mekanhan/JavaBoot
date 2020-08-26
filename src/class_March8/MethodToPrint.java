package class_March8;

public class MethodToPrint {
    // Number of chars
    // Number of words
    // Number of lines
    public static void main(String[] args) {
        numOfChars("Java is perfect");
        numOfWords("Java is perfect");
    }

    public static void numOfChars(String sentence){
        int counter=0;
        for (int i=0; i<sentence.length(); i++){
            if (sentence.charAt(i)!=32){
                counter++;
            }
        }
        System.out.println(counter);
    }
    public static void numOfWords(String sentence){
        int counter=0;
        for (int i=0; i<sentence.length(); i++){
            if (sentence.charAt(i)==' '){
                counter++;
            }
        }
        System.out.println(counter+1);
    }
}
