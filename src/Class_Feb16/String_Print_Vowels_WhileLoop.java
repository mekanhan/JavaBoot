package Class_Feb16;

public class String_Print_Vowels_WhileLoop {
    public static void main(String[] args){
        String myStr = "Java is fun";


        int index=0;
        while(index<myStr.length()){
            if((myStr.charAt(index)=='u' || myStr.charAt(index)=='a' || myStr.charAt(index)=='i')){
                System.out.println(myStr.charAt(index));
            }

            index++;
        }

    }
}
