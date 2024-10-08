package es.ies.puerto;
/**
 * @autor alexfdb
 * @version 1.0.0
 * En un duelo de magos en Hogwarts, Harry necesita al menos 5 pociones de mana 
 * para tener suficiente energía. Si tiene menos de 5 pociones, debe imprimir 
 * "Pocas pociones, recarga antes del duelo". Si tiene 5 o más, debe imprimir 
 * "Suficiente mana para el duelo".
 */
import java.util.Scanner;
public class Ejercicio3 {
    static Scanner escaner = new Scanner(System.in);
    public static void main(String[] args) { 
        System.out.println("Introduzca la cantidad de pociones que tiene Harry");
        int pociones = escaner.nextInt();
        boolean pocionesInsuficientes = (pociones < 5);
        if (pocionesInsuficientes) {
            System.out.println("Pocas pociones, recarga antes del duelo");
        } else {
            System.out.println("Suficiente mana para el duelo");
        }
        escaner.close();
    }
}