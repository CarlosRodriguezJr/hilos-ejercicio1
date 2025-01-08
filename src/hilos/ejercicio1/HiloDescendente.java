
package hilos.ejercicio1;

/**
 *
 * @author carlo
 */
public class HiloDescendente extends Thread {
    @Override
    public void run() {
        for (int i = 100000; i >= 1; i--) {
            System.out.println("Descendente: " + i);
        }
    }
}
