package es.ies.puerto;
/**
 * @author alexfdb
 * @version 1.0.0
 * Los héroes han bebido una poción mágica que multiplica su poder de ataque. Escribe 
 * un programa que multiplique cada valor de ataque en el array por un valor escalar 
 * (el poder de la poción).
 */
public class Ejercicio11 {
    public static void main(String[] args) {
        int[] poderesDeAtaque = {50, 70, 100};
        int pocion = 2;
        int[] multiplicacion = new int[poderesDeAtaque.length];
        for (int i = 0; i < poderesDeAtaque.length; i++) {
            multiplicacion[i] = (poderesDeAtaque[i] * pocion);
            System.out.print(multiplicacion[i] + " ");
        }
    }
}