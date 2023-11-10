package ejemplos;
public class Ejemplo1 {
    public static void main(String[] args) {
        System.out.println(factorial(4));
    }
    public static int factorial(int n) {
        if (n == 1) {
            return 1; // condición de salida
        }
        else {
            return n * factorial(n-1); // llamada recursiva
        }
    }
}
