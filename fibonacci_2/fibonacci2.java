public class fibonacci2 {
    public static void main(String[] args) { 
        final int n = 4;

        int lastDigit = getLastDigitOfFibonacci(n);

        System.out.println("El último dígito del número de Fibonacci en la posición " + n + " es: " + lastDigit);
    }

    public static int getLastDigitOfFibonacci(int n) {
        if (n <= 1) {
            return n;
        }

        int fib1 = 0;
        int fib2 = 1;
        int lastDigit = 0;

        for (int i = 2; i <= n; i++) {
            lastDigit = (fib1 + fib2) % 10;
            fib1 = fib2;
            fib2 = lastDigit;
        }

        return lastDigit;
    }
}