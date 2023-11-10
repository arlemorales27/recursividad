package ejemplos;

public class Ejemplo4 {
    public static void main(String[] args) {
        System.out.println(invertir("Hey! como estan!"));
    }
    public static String invertir(String cadena) {
        if (cadena.length() == 1) return cadena;
        else return invertir(cadena.substring(1)) + cadena.charAt(0);
    }
}
