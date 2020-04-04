package Class_Feb26;

public class PasswordLettersNumbers {
    public static void main(String[] args){
        int count=0;
        do{
            generatePass();
            System.out.println();
            count++;
        }while(count<5);

    }
    public static void generatePass(){
        //to generate random 3 letters
        for (int i=0; i<3; i++){
            System.out.print((char)(int)(Math.random()*26+97));
        }
        //to generate random 3 digit number
        for (int i=0; i<3; i++){
            System.out.print((int)(Math.random()*10));
        }
    }

}
