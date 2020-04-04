package Class_Feb16;

public class String_Print_Vowels_ForLoop {
    public static void main(String[] args){
        String myStr = "Java is fun";

         //starts from 0; check whole length;   increment;
        for (int index=0; index<myStr.length(); index++){
            if (myStr.charAt(index)=='a' || myStr.charAt(index)=='i' || myStr.charAt(index)=='u'){
                System.out.println(myStr.charAt(index));
            }

        }

    }
}
