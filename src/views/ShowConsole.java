package views;

import models.Persona;

public class ShowConsole {

    public ShowConsole() {}

    // Mostrar arreglo de enteros
    public void printArray(int[] num) {
        System.out.print("Arreglo: [");
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i]);
            if (i < num.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    // Mostrar resultado de búsqueda de persona
    public void showPersonResult(Persona persona, String nombreBuscado) {
        if (persona != null) {
            System.out.println("Se encontró a " + persona.getNombre() + ", edad: " + persona.getEdad());
        } else {
            System.out.println("No se encontró a la persona con nombre: " + nombreBuscado);
        }
    }
}
