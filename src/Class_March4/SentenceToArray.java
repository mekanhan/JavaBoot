package Class_March4;
// This class linked to ArrayReview.class
public class SentenceToArray {
    public static void main(String[] args) {
        String sentence = "We Love Java";
        String [] resultArray = convertStringToArray(sentence);
        for(String word:resultArray){
            System.out.println(word);
        }
    }

    public static int findNumberOfWords(String sentence){
        int counter=0;
        for (int i=0; i<sentence.length(); i++){
            if(sentence.charAt(i)==' '){
                counter++;
            }
        }
        return counter;
    }

    public static String[] convertStringToArray(String sentence){
        sentence+=" ";
        int numWords = findNumberOfWords(sentence);      // for line 18
        String [] result = new String[numWords];
        String word = "";
        int index=0;

        for (int j=0; j<sentence.length(); j++){

            word+=sentence.charAt(j);
           if (sentence.charAt(j)==' '){
              result[index]=word;
              index++;
              word="";
           }
        }
        return result;
    }
}
