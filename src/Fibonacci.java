import java.util.Scanner;
class Fibonacci {
    public static Integer getFibonacciLinear(int n) {
        if (n >= 0) {
            int n1 = 0;
            int n2 = 1;

            int x = n != 1 ? 0 : 1;

            for (int i = 1; i < n; i++){
                x = n1 + n2;
                n1 = n2;
                n2 = x;
            }
            return x;
        }
        return null;
    }

    public static Integer getFibonacciRecursive(int n){
        if (n >= 0){
            if (n <= 1){
                return n;
            }else{
                return getFibonacciRecursive(n - 1) + getFibonacciRecursive(n - 2);
            }
        }
        return null;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(getFibonacciLinear(n));
        System.out.println(getFibonacciRecursive(n));
        scanner.close();
    }
}
