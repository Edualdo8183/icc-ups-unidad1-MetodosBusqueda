package controllers;

import models.Persona;
import views.ShowConsole;

public class MetodosBusqueda {

    private int[] arreglo;
    private ShowConsole showConsole;

  
    public MetodosBusqueda(int[] arreglo, ShowConsole showConsole) {
        this.arreglo = arreglo;
        this.showConsole = showConsole;
        showConsole.printArray(arreglo);
    }

   
    public MetodosBusqueda(ShowConsole showConsole) {
        this.arreglo = new int[]{10, 11, -2, 5, 6, 8, 15, 22};
        this.showConsole = showConsole;
        showConsole.printArray(arreglo);
    }

    
    public int busquedaLineal(int valorBuscado) {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == valorBuscado) {
                return i;
            }
        }
        return -1;
    }

    
    public Persona search(Persona[] personas, String name) {
        for (Persona persona : personas) {
            if (persona.getName().equalsIgnoreCase(name)) {
                return persona;
            }
        }
        return null;
    }

  
    public Persona search(Persona[] personas) {
        for (Persona persona : personas) {
            if (persona.getAge() > 25 && persona.getAge() % 2 != 0) {
                return persona;
            }
        }
        return null;
    }

    
    public Persona search(Persona[] personas, int valorNombre) {
        for (Persona persona : personas) {
            int valor = calcularValorASCII(persona.getName());
            if (valor == valorNombre) {
                return persona;
            }
        }
        return null;
    }

 
    private int calcularValorASCII(String name) {
        int suma = 0;
        for (char c : name.toCharArray()) {
            suma += (int) c;
        }
        return suma;
    }
}
