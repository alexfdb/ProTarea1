package es.ies.puerto;
/**
 * @author alexfdb
 * @version 1.0.0
 * Dos equipos de héroes han recolectado botines durante una misión conjunta. 
 * Escribe un programa que combine ambos inventarios de botines en uno solo.
 */
public class Ejercicio8 {
    public static void main(String[] args) {
        String[] botinEquipo1 = {"Espada mágica", "Escudo resistente"};
        String[] botinEquipo2 = {"Anillo de poder", "Armadura encantada"};
        String[] botinCombinado = new String[botinEquipo1.length + botinEquipo2.length];
        for (int i = 0; i < botinEquipo1.length; i++) {
            botinCombinado[i] = botinEquipo1[i]; 
        }
        for (int i = 0; i < botinEquipo2.length; i++) {
            botinCombinado[i + botinEquipo1.length] = botinEquipo2[i];
        }
        for (int i = 0; i < botinCombinado.length; i++) {
            System.out.println(botinCombinado[i]);
        }
    }
}