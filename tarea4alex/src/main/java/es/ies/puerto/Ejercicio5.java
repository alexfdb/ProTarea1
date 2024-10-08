package es.ies.puerto;
/**
 * @author alexfdb
 * @version 1.0.0
 * En un campo de batalla galáctico, se están midiendo las fuerzas de los Jedi 
 * (números pares) y los Sith (números impares). Escribe un programa que cuente 
 * cuántos Jedi y cuántos Sith hay en un array de fuerzas.
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        int[] fuerzas = {100, 45, 78, 13, 56, 91};
        int par = 0;
        int impar = 0;
        for (int i = 0; i < fuerzas.length; i++) {
            boolean calculaPar = ((fuerzas[i] % 2) == 0);
            if (calculaPar) {
                par += 1;
            } else {
                impar += 1;
            }
        }
        System.out.println("Jedi = " + par + ", Sith = " + impar);
    }
}