package es.ies.puerto;
/**
 * @author alexfdb
 * @version 1.0.0
 * Se han registrado los puntajes de las casas de Hogwarts en el Torneo de Magia. Cada casa recibe una 
 * medalla (Oro, Plata o Bronce) según su puntuación. Escribe un programa que cuente cuántas medallas de 
 * cada tipo ha ganado una casa.
 */
public class Ejercicio14 {
    public static void main(String[] args) {
        String[] medallas = {"Oro", "Plata", "Bronce", "Oro", "Oro", "Plata"};
        int oro = 0;
        int plata = 0;
        int bronce = 0;
        for (int i = 0; i < medallas.length; i++) {
            switch (medallas[i]) {
                case "Oro" :
                    oro ++;
                    break;
                case "Plata" :
                    plata ++;
                    break;
                case "Bronce" :
                    bronce ++;
                    break;
            }
        }
        System.out.println("Oro = " + oro + ", PLata = " + plata + ", Bronce = " + bronce);
    }
}