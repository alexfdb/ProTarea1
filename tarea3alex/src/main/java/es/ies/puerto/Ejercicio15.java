package es.ies.puerto;
/**
 * @author alexfdb
 * @version 1.0.0
 * Link encuentra tres objetos en una mazmorra: una llave, una bomba y un arco. 
 * Si tiene la llave, puede abrir la puerta. Si tiene la bomba, puede destruir la 
 * puerta. Si tiene el arco, puede atacar a los enemigos desde lejos.
 * Escribe un programa que determine qué puede hacer Link según el objeto que tenga.
 */
import java.util.Random;
public class Ejercicio15 {
    static Random aleatorio = new Random();
    public static void main(String[] args) {
        int objetoAleatorio = aleatorio.nextInt(3);
        boolean llave = (objetoAleatorio == 0);
        boolean bomba = (objetoAleatorio == 1);
        boolean arco = (objetoAleatorio == 2);
        if (llave) {
            System.out.println("Puede abrir una puerta");
        } else if (bomba) {
            System.out.println("Puede destruir una puerta");
        } else if (arco) {
            System.out.println("Puede atacar a distancia");
        }
    }
}