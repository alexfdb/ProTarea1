package es.ies.puerto;

/**
 * @author alexfdb
 * @version 1.0.0
 * Pruebas de las clases
 */
public class Main {
    public static void main(String[] args) {
        pruebaPersona();
        pruebaCoche();
        preubaRectangulo();
        pruebaBanco();
        pruebasEmpleado();
    }

    //Pruebas de la clase Persona
    public static void pruebaPersona() {
        Persona persona1 = new Persona("Juan", 30);
        Persona persona2 = new Persona("Maria", 25);

        System.out.println(persona1);
        System.out.println(persona2);

        persona2.setEdad(26);
        System.out.println("Edad actualizada de "+ persona2.getNombre() + ": " + persona2.getEdad());
    }

    //Pruebas de la clase Coche
    public static void pruebaCoche() {
        Coche coche1 = new Coche("Toyota", "Corolla", 2022);
        Coche coche2 = new Coche("Ford", "Mustang", 1886);

        System.out.println(coche1);
        System.out.println(coche2);
    }

    //Pruebas de la clase Rectngulo
    public static void preubaRectangulo(){
        Rectangulo rectangulo1 = new Rectangulo(5, 10);
        Rectangulo rectangulo2 = new Rectangulo(4, 7);

        System.out.println(rectangulo1);
        System.out.println("El area del rectangulo1 es: " + rectangulo1.calcularArea());
        System.out.println(rectangulo2);
        System.out.println("El perímetro del rectangulo2 es: " + rectangulo2.calcularPerimetro());
    }

    //Pruebas de la clase Banco
    public static void pruebaBanco(){
        Banco cuenta1 = new Banco(1000);

        cuenta1.depositar(500);
        cuenta1.retirar(200);

        System.out.println(cuenta1);
    }

    //Pruebas de la clase Empleado
    public static void pruebasEmpleado() {
        Empleado empleado1 = new Empleado("Ana", "Gerente", 5000);
        Empleado empleado2 = new Empleado("Carlos", "Ingeniero", 3000);

        System.out.println(empleado1);
        System.out.println(empleado2);
    }
}