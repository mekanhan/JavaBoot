package class_March12_Review;

public class CapitalLetter {
    public static void main(String[] args) {
        String ourSentence="It is Time To Review Java";
        CountCapitals(ourSentence);
    }
    public static int CountCapitals (String sentence){
        int count=0;
        for (int i=0; i<sentence.length(); i++){
            if (sentence.charAt(i)>='A' && sentence.charAt(i)<='Z'){
                count++;
            }
        }
        System.out.println("Total amount of "+ count + " capital letters");
    return count;
    }
}
