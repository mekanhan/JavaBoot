package class_March8;

public class RemoveSpaces_INCOMPLETE {

    public static void main(String[] args) {

        // removeSpacesVoid("It is a perfect day to study Java" );
        System.out.println();

    }

    /* public static String removeSpacesVoid(String sentence){

        for (int i=0; i<sentence.length(); i++){
            if (sentence.charAt(i)!=' '){
                System.out.println(sentence.charAt(i));
            }

        }
        return ;
    }

     */
    public static String RemoveSpaces(String sentence){
        String result="";
        for (int i=0; i<sentence.length(); i++){
            if (sentence.charAt(i) != ' ')
                result+=sentence.charAt(i);
            else {
                result+='-';
            }
        }
        return result;
    }
}
