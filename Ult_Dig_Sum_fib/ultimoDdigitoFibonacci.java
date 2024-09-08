public class ultimoDdigitoFibonacci {
    public static void main(String[] args) {
        final int n = 3;

        int ultimoDigito = ultimoDigitoSumaFibonacci(n);


        System.out.println("El último dígito de la suma de los primeros " + n + " números de Fibonacci es: " + ultimoDigito);
    }

    public static int ultimoDigitoSumaFibonacci(int n) {

        int fibNPlus2 = fibonacci(n + 2);
        
        int sumaUltimoDigito = (fibNPlus2 - 1) % 10;
        
        if (sumaUltimoDigito < 0) {
            sumaUltimoDigito += 10;
        }

        return sumaUltimoDigito;
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