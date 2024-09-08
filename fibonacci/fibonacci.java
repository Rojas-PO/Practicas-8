public class fibonacci {
    public static void main(String[] args) {
        // Definir una constante para el valor de n
        final int n = 10;

        // Llamar al método para obtener el número de Fibonacci en la posición n
        int fibonacciNumber = fibonacci(n);

        // Mostrar el resultado
        System.out.println("El número de Fibonacci en la posición " + n + " es: " + fibonacciNumber);
    }

    // Método para calcular el número de Fibonacci en la posición n
    public static int fibonacci(int n) {
        // Si n es 0 o 1, retornar n directamente
        if (n <= 1) {
            return n;
        }

        // Inicializar los dos primeros números de Fibonacci
        int fib1 = 0; // F(0)
        int fib2 = 1; // F(1)
        int fibonacci = 0; // Variable para almacenar el número de Fibonacci actual

        // Calcular el número de Fibonacci en la posición n de forma iterativa
        for (int i = 2; i <= n; i++) {
            fibonacci = fib1 + fib2; // Sumar los dos números anteriores
            fib1 = fib2; // Actualizar fib1 al valor de fib2
            fib2 = fibonacci; // Actualizar fib2 al valor del número de Fibonacci actual
        }
        return fibonacci;
    }
}