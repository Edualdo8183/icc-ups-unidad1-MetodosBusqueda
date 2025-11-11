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
        
    }


   
    public void showPersonResult(Persona persona, String nombreBuscado) {
        if (persona != null) {
            System.out.println("Se encontró a " + persona.getName() + ", edad: " + persona.getAge());
        } else {
            System.out.println("No se encontró a la persona con nombre: " + nombreBuscado);
        }
    }

   
    public void showPersonResult(Persona persona) {
        if (persona != null) {
            System.out.println("Persona con edad impar y >25: " + persona);
        } else {
            System.out.println("No se encontró ninguna persona con edad impar y mayor a 25 años.");
        }
    }

    
    public void showPersonResult(Persona persona, int valorNombre) {
        if (persona != null) {
            System.out.println("Persona cuyo nombre tiene valor ASCII = " + valorNombre + ": " + persona);
        } else {
            System.out.println("No se encontró ninguna persona con valor ASCII = " + valorNombre);
        }
    }
}
