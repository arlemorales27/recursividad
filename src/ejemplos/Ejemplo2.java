package ejemplos;

public class Ejemplo2 {
    public static void main(String[] args) {
        System.out.println(potencia(2,4));
    }
    public static int potencia(int base, int exponente) {
        if (exponente == 0) return 1;
        else return base * potencia(base, exponente-1);
    }
}
