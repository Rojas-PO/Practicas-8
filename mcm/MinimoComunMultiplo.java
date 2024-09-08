public class MinimoComunMultiplo {
    public static void main(String[] args) {
        
        final int a = 6;
        final int b = 8;

        int mcm = calcularMCM(a, b);
       
        System.out.println("El mínimo común múltiplo de " + a + " y " + b + " es: " + mcm);
    }

    public static int calcularMCM(int a, int b) {
        return (a * b) / calcularMCD(a, b);
    }

    
    public static int calcularMCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}