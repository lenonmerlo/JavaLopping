public class PrimeNumberChallenge {
    public static void main(String[] args) {

        int primeCount = 0;
        int maxPrimes = 3;

        for (int i = 10; i <= 1000; i++) {
            if (isPrime(i)) {
                System.out.println("Prime number founded: " + i);
                primeCount++;

                if (primeCount == maxPrimes) {
                    break;
                }
            }
        }
    }

    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
