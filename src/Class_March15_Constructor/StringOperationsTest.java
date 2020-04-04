package Class_March15_Constructor;

public class StringOperationsTest {
    public static void main(String [] args){
        StringOperations myStr = new StringOperations("Java is super fun");
        System.out.println(myStr.returnReversed());
        System.out.println(myStr.returnCapitalized());
    }
}
