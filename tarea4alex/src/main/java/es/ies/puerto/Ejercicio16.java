package es.ies.puerto;
/**
 * @author alexfdb
 * @version 1.0.0
 * El equipo de científicos del Área 51 ha registrado una lista de criaturas hostiles, y tu misión es 
 * eliminar una criatura específica del registro. Escribe un programa que elimine la criatura que ya ha sido 
 * contenida.
 */
public class Ejercicio16 {
    public static void main(String[] args) {
        String[] criaturas = {"Alien", "Monstruo del Pantano", "Demonio", "Serpiente Gigante"};
        for (int i = 0; i < criaturas.length; i++) {
            boolean criaturaAEliminar = (criaturas[i].equals("Demonio"));
            if (!criaturaAEliminar) {
                System.out.println(criaturas[i]);
            }
        }
    }
}