import controllers.MetodosBusqueda;
import models.Persona;
import views.ShowConsole;

public class Main {
    public static void main(String[] args) {
        ShowConsole show = new ShowConsole();
        MetodosBusqueda mb = new MetodosBusqueda(show);

        int valor = 8;
        int indice = mb.busquedaLineal(valor);
        if (indice != -1)
            System.out.println("El valor " + valor + " está en la posición " + indice);
        else
            System.out.println("El valor " + valor + " no se encontró.");

        Persona[] personas = new Persona[]{
            new Persona("Ana", 25),
            new Persona("Luis", 30),
            new Persona("Maria", 28),
            new Persona("Carlos", 35),
            new Persona("Sofia", 22),
            new Persona("Jorge", 27),
            new Persona("Lucia", 24)
        };

        String name = "Juan";
        Persona p1 = mb.search(personas, name);
        show.showPersonResult(p1, name);

        Persona p2 = mb.search(personas);
        show.showPersonResult(p2);

        String buscado = "Sofia";
        int valorASCII = 0;
        for (char c : buscado.toCharArray()) {
            valorASCII += (int) c;
        }
        Persona p3 = mb.search(personas, valorASCII);
        show.showPersonResult(p3, valorASCII);
    }
}
