package es.ies.puerto;
/**
 * @author alexfdb
 * @version 1.0.0
 * Cada día de la semana en tu nave espacial hay una actividad diferente. Los 
 * lunes entrenas combate, los miércoles pilotaje, y los viernes reparaciones. 
 * El resto de días descansas.
 * Crea un programa que pida el día de la semana y te diga cuál es la actividad 
 * programada.
 */
import java.util.Scanner;
public class Ejercicio3 {
    static Scanner escaner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Introduzca el dia de la semana");
        String diaSemana = escaner.nextLine();
        switch (diaSemana) {
            case "Martes" :
            case "Jueves" :
            case "Sabado" :
            case "Domingo" :
                System.out.println("Hoy toca descanso");
                break;
            case "Lunes" :
                System.out.println("Hoy toca combate");
                break;
            case "Miercoles" :
                System.out.println("Hoy toca pilotaje");
                break;
            case "Viernes" :
                System.out.println("Hoy toca reparaciones");
                break;
            default :
                System.out.println("El valor introducido no es valido");
        }
        escaner.close();
    }
}