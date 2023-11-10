package ejemplos;

public class Ejemplo6 {
    public static void main(String[] args) {
        System.out.println(sumaDigitos(50214));
    }
    public static int sumaDigitos(int n) {
        if (n == 0) return 0;
        else return n % 10 + sumaDigitos(n / 10);
    }
}
