package controllers;

import models.Persona;
import views.ShowConsole;

public class MetodosBusqueda {

    private int[] arreglo;
    private ShowConsole showConsole;

    // Constructor que recibe un arreglo
    public MetodosBusqueda(int[] arreglo, ShowConsole showConsole) {
        this.arreglo = arreglo;
        this.showConsole = showConsole;
        showConsole.printArray(arreglo);
    }

    // Constructor con arreglo por defecto
    public MetodosBusqueda(ShowConsole showConsole) {
        this.arreglo = new int[]{10, 11, -2, 5, 6, 8, 15, 22};
        this.showConsole = showConsole;
        showConsole.printArray(arreglo);
    }

    // Búsqueda lineal simple
    public int busquedaLineal(int valorBuscado) {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == valorBuscado) {
                return i;
            }
        }
        return -1;
    }

    // Ejemplo de búsqueda usando while
    public int busquedaLinealWhile(int valorBuscado) {
        int i = 0;
        while (i < arreglo.length) {
            if (arreglo[i] == valorBuscado) {
                return i;
            }
            i++;
        }
        return -1;
    }

    // Buscar persona por nombre
    public Persona searchPersonByName(Persona[] personas, String name) {
        for (Persona persona : personas) {
            if (persona.getNombre().equalsIgnoreCase(name)) {
                return persona;
            }
        }
        return null;
    }
}
