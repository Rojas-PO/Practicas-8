public class fibonacci3 {
    public static void main(String[] args) {
        
        final int n = 199;
        final int m = 1040;

        int result = fibonacciModulo(n, m);

        System.out.println("F(" + n + ") mod " + m + " es: " + result);
    }

    public static int fibonacciModulo(int n, int m) {
        if (n <= 1) {
            return n % m;
        }

        int fib1 = 0;
        int fib2 = 1;
        int fibonacciMod = 0;

        for (int i = 2; i <= n; i++) {
            fibonacciMod = (fib1 + fib2) % m;
            fib1 = fib2;
            fib2 = fibonacciMod;
        }

        return fibonacciMod;
    }
}