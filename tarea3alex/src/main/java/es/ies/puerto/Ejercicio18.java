package es.ies.puerto;
/**
 * @author alexfdb
 * @version 1.0.0
 * Si tienes más de 18 años, eres aceptado en la Resistencia. Si tienes menos 
 * de 18 pero eres hábil con armas, también eres aceptado. Si no, debes esperar.
 * Crea un programa que determine si puedes unirte a la Resistencia.
 */
import java.util.Scanner;
import java.util.Random;
public class Ejercicio18 {
    static Scanner escaner = new Scanner(System.in);
    static Random aleatorio = new Random();
    public static void main(String[] args) {
        System.out.println("Introduzca su edad");
        int edad = escaner.nextInt();
        int habilidad = aleatorio.nextInt(2);
        boolean habilArmas = (habilidad == 0);
        boolean mayorEdad = (edad>17);
        boolean menorHabil = (!mayorEdad && habilArmas);
        if (mayorEdad) {
            System.out.println("Puedes entrar en la resistencia");
        } else if (menorHabil) { 
            System.out.println("Puedes entrar en la resistencia por tu habilidad con las armas");
        } else {
            System.out.println("No puedes entrar en la resistencia");
        }
        escaner.close();
    }
}