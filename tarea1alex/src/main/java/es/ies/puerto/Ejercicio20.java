package es.ies.puerto;
/**
 * @author alexfdb
 * @version 1.0.0
 * Crea un programa que intercambie los valores de dos variables enteras. Por 
 * ejemplo, si la variable a vale 5 y b vale 10, después del intercambio a 
 * debería valer 10 y b 5.
 */
public class Ejercicio20 {
    public static void main(String[] args) {
        byte valor1 = 5;
        byte valor2 = 10;
        System.out.println("El valor uno es " + valor1 + " y el valor dos es " + valor2 + ".");
        byte intercambioValores = valor1;
        valor1 = valor2;
        valor2 = intercambioValores;
        System.out.println("Tras el intercambio el valor uno es " + valor1 + " y el valor dos es " + valor2 + ".");
    }
}