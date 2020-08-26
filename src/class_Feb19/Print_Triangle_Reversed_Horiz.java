package class_Feb19;

public class Print_Triangle_Reversed_Horiz {
    public static void main(String[] args){

        for(int i=1; i<10; i++){

            for(int j=i; j<10; j++){        //if in j=1 then triangle looking this ( >> ) way
                                            //if in j=i then triangle looking this ( << ) way
                System.out.print("\t");
            }
            for (int n=10; n>10-i; n--){
                System.out.print("*   ");
            }
            System.out.println();
        }
    }

}
