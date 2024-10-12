package es.ies.puerto;
/**
 * @author alexfdb
 * @version 1.0.0
 * Si tienes un arma de fuego y munición, puedes luchar contra los zombies. 
 * Si tienes un arma cuerpo a cuerpo, puedes defenderte. Si no tienes armas, debes huir.
 * Escribe un programa que determine qué hacer según el tipo de arma y si tienes munición.
 */
import java.util.Random;
public class Ejercicio16 {
    static Random aleatorio = new Random();
    public static void main(String[] args) {
        int objetoAleatorio = aleatorio.nextInt(4);
        boolean fusil = (objetoAleatorio == 0);
        boolean fusilMunicion = (objetoAleatorio ==  1);
        boolean machete = (objetoAleatorio == 2);
        if (fusil) {
            System.out.println("Tienes un fusil");
        } else if (fusilMunicion) {
            System.out.println("Tienes un fusil con municion");
        } else if (machete) {
            System.out.println("Tienes un machete");
        } else {
            System.out.println("No tienes nada");
        }
    }
}