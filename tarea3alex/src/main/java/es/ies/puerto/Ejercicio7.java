package es.ies.puerto;
/**
 * @author alexfdb
 * @version 1.0.0
 * Frodo está viajando a Mordor. Si la distancia es mayor a 1000 kilómetros, 
 * necesitará descansar. Si es menor, podrá continuar.
 * Escribe un programa que reciba la distancia a Mordor y diga si Frodo necesita 
 * descansar o no.
 */
import java.util.Scanner;
public class Ejercicio7 {
    static Scanner escaner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Introduzca la distancia que tiene que recorrer Frodo");
        float distanciaFrodo = escaner.nextFloat();
        boolean distanciaDescansar = (distanciaFrodo>1000);
        if (distanciaDescansar) {
            System.out.println("Frodo necesitara descansar");
        } else {
            System.out.println("Frodo podra continuar");
        }
        escaner.close();
    }
}