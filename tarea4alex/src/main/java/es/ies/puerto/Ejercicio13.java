package es.ies.puerto;
/**
 * @author alexfdb
 * @version 1.0.0
 * Dos equipos de superhéroes han decidido fusionarse para enfrentar una amenaza mayor. Escribe un programa 
 * que combine ambos equipos en un solo array, sin que se repita ningún nombre.
 */
public class Ejercicio13 {
    public static void main(String[] args) {
        String[] equipo1 = {"Ironman", "Thor", "Hulk"};
        String[] equipo2 = {"Capitán América", "Thor", "Hawkeye"};
        int tamanio = (equipo1.length + equipo2.length);
        String[] equipo1y2 = new String[tamanio];
        for (int i = 0; i < equipo1.length; i++) {
            if (!equipo1[i].equals("Thor")){
            equipo1y2[i] = equipo1[i];
            }
        }
        for (int i = 0; i < equipo2.length; i++) {
            equipo1y2[i + equipo1.length] = equipo2[i];
        }
        for (int i = 0; i < equipo1y2.length; i++) {
            System.out.println(equipo1y2[i]);
        }
    }
}