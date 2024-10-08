package es.ies.puerto;
/**
 * @author alexfdb
 * @version 1.0.0
 * Thanos ha recolectado gemas del infinito, pero quiere saber cuántas tiene de cada tipo. Escribe un programa que 
 * cuente cuántas gemas de "Poder", "Tiempo" y "Espacio" ha recolectado.
 */
public class Ejercicio20 {
    public static void main(String[] args) {
        String[] gemas = {"Poder", "Tiempo", "Espacio", "Tiempo", "Poder", "Poder"};
        int poder = 0;
        int tiempo = 0;
        int espacio = 0;
        for (int i = 0; i < gemas.length; i++) {
            switch (gemas[i]) {
                case "Poder" :
                    poder++;
                    break;
                case "Tiempo" :
                    tiempo++;
                    break;
                case "Espacio" :
                    espacio++;
                    break;
            }
        }
        System.out.println("Poder = " + poder + ", Tiempo = " + tiempo + ", Espacio = " + espacio);
    }
}