package Class_Feb26;

public class RandomPassword_lower_case {
    public static void main(String[] args) {
        //97-122 ASCII
        LetterMethod();
    }
    public static void LetterMethod() {
        for (int i = 0; i <= 5; i++) {
            int one = 97 + (int) (Math.random() * 26);
            System.out.print((char) one);
        }
    }

}
