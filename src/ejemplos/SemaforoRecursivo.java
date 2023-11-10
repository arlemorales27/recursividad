package ejemplos;
import java.util.concurrent.TimeUnit;

public class SemaforoRecursivo {
    public static void main(String[] args) {
        simularSemaforo(0);
    }

    public static void simularSemaforo(int contador) {
        switch(contador % 3) {
            case 0:
                System.out.println("Rojo");
                break;
            case 1:
                System.out.println("Amarillo");
                break;
            case 2:
                System.out.println("Verde");
                break;
        }

        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        simularSemaforo(contador + 1);
    }

}
