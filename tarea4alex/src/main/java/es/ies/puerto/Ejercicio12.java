package es.ies.puerto;
/**
 * @author alexfdb
 * @version 1.0.0
 * Un mago tiene una lista de hechizos en su libro mágico, pero quiere saber cuántos hechizos de ataque y 
 * cuántos de defensa tiene. Los hechizos de ataque son aquellos cuyo nombre contiene la palabra "Fuego", 
 * mientras que los de defensa contienen "Escudo". Escribe un programa que cuente los hechizos de ataque y 
 * de defensa.
 */
public class Ejercicio12 {
    public static void main(String[] args) {
        String[] hechizos = {"Fuego Ardiente", "Escudo Protector", "Rayo de Fuego", "Escudo Mágico", "Flecha Helada"};
            int ataque = 0;
            int defensa = 0;
            for (int i = 0; i < hechizos.length; i++) {
                boolean buscarFuego = (hechizos[i].contains("Fuego"));
                boolean buscarEscudo = (hechizos[i].contains("Escudo"));
                if(buscarFuego) {
                    ataque += 1;
                } else if (buscarEscudo) {
                    defensa += 1;
                }
            }
        System.out.println("Hechizos de ataque = " + ataque + ", Hechizos de defensa = " + defensa);
    }
}