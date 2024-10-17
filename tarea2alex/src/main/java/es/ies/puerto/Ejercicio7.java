package es.ies.puerto;
/**
 * @author alexfdb
 * @version 1.0.0
 * Crea un programa que pida al usuario las horas trabajadas y el salario por 
 * hora, y luego calcule su salario semanal.
 */
import java.util.Scanner;
public class Ejercicio7 {
    static Scanner escaner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Introduzca las horas que trabaja a la semana");
        float horasSemana = escaner.nextFloat();
        System.out.println("Introduzca el salario que gana a la hora");
        float salarioHora = escaner.nextFloat();
        float salarioSemana = (horasSemana * salarioHora);
        System.out.println("Cobrará " + salarioSemana + " $ a la semana.");
        escaner.close();
    }
}