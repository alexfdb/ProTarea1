package es.ies.puerto;
/**
 * @author alexfdb
 * @version 1.0.0
 * Crea un programa que pida al usuario su peso (en kg) y su altura (en metros), 
 * y luego calcule su Índice de Masa Corporal (IMC).
 */
import java.util.Scanner;
public class Ejercicio10 {
    static Scanner escaner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Introduzca su peso en kg");
        float peso = escaner.nextFloat();
        System.out.println("Introduzca su altura en metros");
        float altura = escaner.nextFloat();
        float imc = (peso / (altura * altura));
        System.out.println("Su IMC es de " + imc + ".");
        escaner.close();
    }
}