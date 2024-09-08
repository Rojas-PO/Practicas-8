public class UltimoDigito_fib_Cuadrado {
    public static void main(String[] args) {
        
        final int n = 77;

        int ultimoDigito = ultimoDigitoSumaCuadradosFibonacci(n);

        System.out.println("El último dígito de la suma de los cuadrados de los primeros " + n + " números de Fibonacci es: " + ultimoDigito);
    }

    public static int ultimoDigitoSumaCuadradosFibonacci(int n) {
        int fibN = fibonacci(n);
        int fibNPlus1 = fibonacci(n + 1);

        int sumaCuadradosUltimoDigito = (fibN * fibNPlus1) % 10;

        return sumaCuadradosUltimoDigito;
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }

        int fib1 = 0;
        int fib2 = 1;
        int fibonacci = 0;

        for (int i = 2; i <= n; i++) {
            fibonacci = (fib1 + fib2) % 10;
            fib1 = fib2;
            fib2 = fibonacci;
        }

        return fibonacci;
    }
}