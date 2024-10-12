package es.ies.puerto;
/**
 * @author alexfdb
 * @version 1.0.0
 * Eres un guerrero de nivel 5. Si obtienes más de 50 puntos de experiencia, 
 * subes a nivel 6. Si no, te quedas en nivel 5.
 * Escribe un programa que reciba los puntos de experiencia y determine si 
 * subes de nivel o no.
 */
import java.util.Random;
public class Ejercicio2 {
    static Random aleatorio = new Random();
    public static void main(String[] args) {
        byte nivel = 5;
        int experiencia = aleatorio.nextInt(100);
        boolean subeNivel = (experiencia>50);
        if (subeNivel) {
            nivel += 1; 
        }
        System.out.println("La experiencia obtenida es " + experiencia + " por lo tanto su nivel es " + nivel + ".");
    }
}