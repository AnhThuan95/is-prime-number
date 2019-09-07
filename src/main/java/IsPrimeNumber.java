public class IsPrimeNumber {
    public static void main(String[] args) {
        int limit = 100;
        System.out.println("These are Prime number less than " + limit + ": ");
        for (int i = 0; i <= limit ; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean isPrime(int number) {
        boolean result = true;
        if (number < 2) {
            result = false;
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    result = false;
                    break;
                }
            }
        }
        return result;
    }
}
