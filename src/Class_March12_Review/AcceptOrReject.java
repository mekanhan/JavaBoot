package Class_March12_Review;

public class AcceptOrReject {

    public static void main(String[] args) {
        String ourSentence="It is Time To review java";
        CountCapitals(ourSentence);
    }
    public static void CountCapitals (String sentence){
        int count=0;
        for (int i=0; i<sentence.length(); i++){

            if (sentence.charAt(i)>='A' && sentence.charAt(i)<='Z'){    //'A'=65, 'Z'=92
                //  count++; // only if void not used
            }
        }
                //return count; // only if void not used
        if (count>4){
            System.out.println("accepted " + count);
        }
        else {
            System.out.println("rejected because capitals less than 5");
        }
        System.out.println("Total amount of capital letters " + count);

    }
}
