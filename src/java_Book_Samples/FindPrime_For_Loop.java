package java_Book_Samples;

// Test for primes.
class FindPrime_For_Loop {
    public static void main(String args[]) {
        int num;
        boolean isPrime = true;
        num = 37;
        for (int i = 2; i <= num / i; i++) {
            if ((num % i) == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) System.out.println("Prime");
        else System.out.println("Not Prime");
    }
}