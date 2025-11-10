import controllers.MetodosBusqueda;
import views.ShowConsole;
import models.Persona;

public class Main {
    public static void main(String[] args) {
        ShowConsole show = new ShowConsole();
        MetodosBusqueda mb = new MetodosBusqueda(show);

        // --- Búsqueda numérica ---
        int valor = 8;
        int indice = mb.busquedaLineal(valor);

        if (indice != -1) {
            System.out.println("El valor " + valor + " está en la posición " + indice);
        } else {
            System.out.println("El valor " + valor + " no se encontró.");
        }

        // --- Búsqueda de persona ---
        Persona[] personas = new Persona[] {
            new Persona("Ana", 25),
            new Persona("Luis", 30),
            new Persona("Maria", 28),
            new Persona("Carlos", 35),
            new Persona("Sofia", 22),
            new Persona("Jorge", 27),
            new Persona("Lucia", 24),
        };

        String name = "Juan";
        Persona resultado = mb.searchPersonByName(personas, name);
        show.showPersonResult(resultado, name);
    }
}
