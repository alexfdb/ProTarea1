package es.ies.puerto;
/**
 * @autor alexfdb
 * @version 1.0.0
 * Batman necesita saber si tiene suficiente combustible para su Batmóvil. 
 * El Batmóvil puede recorrer hasta 500 km con su tanque lleno. Si la distancia 
 * es mayor a 500 km, debe imprimir "¡Combustible insuficiente, alerta a Alfred!". 
 * Si la distancia es menor o igual a 500 km, imprime "Combustible suficiente para la misión".
 */
import java.util.Scanner;
public class Ejercicio2 {
    static Scanner escaner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Introduzca la distancia que debe recorrer el batmovil");
        float distancia = escaner.nextFloat();
        boolean muchaDistancia = (distancia > 500);
        if (muchaDistancia) {
            System.out.println("¡Combustible insuficiente, alerta a Alfred!");
        } else {
            System.out.println("Combustible suficiente para la misión");
        }
        escaner.close();
    }
}