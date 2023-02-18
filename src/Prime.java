import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Prime {
    public static List<Integer> getPrimesLinear(int n) {
        List<Integer> primes = new ArrayList<>();
        if (n > 1) {
            for (int i = 2; i <= n; i++) {
                int greatestPossibleDivisor = (int) Math.floor(Math.sqrt(i));

                boolean isPrime = true;
                if (i == 2){
                    isPrime = true;
                } else if (i % 2 == 0) {
                    isPrime = false;
                } else {
                    for (int divisor = 3; divisor <= greatestPossibleDivisor; divisor += 2) {
                        if (i % divisor == 0){
                            isPrime = false;
                            break;
                        }
                    }
                }

                if (isPrime){
                    primes.add(i);
                }
            }
            return primes;
        }
        return null;
    }

    public static List<Integer> getPrimesRecursive(int n) {
        List<Integer> primes = new ArrayList<>();

        if (n > 1) {
            for (int i = 2; i <= n; i++) {
                if (isPrime(i)) {
                    primes.add(i);
                }
            }
            return primes;
        }
        return null;
    }

    public static boolean isPrime(int i) {
        int greatestPossibleDivisor = (int) Math.floor(Math.sqrt(i));

        boolean isPrime = true;
        if (i == 2){
            isPrime = true;
        } else if (i % 2 == 0) {
            isPrime = false;
        } else {
            for (int divisor = 3; divisor <= greatestPossibleDivisor; divisor += 2) {
                if (i % divisor == 0){
                    isPrime = false;
                    break;
                }
            }
        }
        return isPrime;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(getPrimesLinear(n));
        System.out.println(getPrimesRecursive(n));
        scanner.close();
    }
}
