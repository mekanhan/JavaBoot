package Java_Book_Samples;

// Demonstrate the do-while loop.
class DoWhile {
    public static void main(String args[]) {
        int n = 10;
        do {
            System.out.println("tick " + n);
        } while(--n > 0);
    }
}