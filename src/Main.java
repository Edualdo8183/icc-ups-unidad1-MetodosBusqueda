

import controllers.MetodosBusqueda;
import views.ShowConsole;

public class Main {
    public static void main(String[] args) {
        ShowConsole show = new ShowConsole();
        MetodosBusqueda mb = new MetodosBusqueda(show);

        int valor = 8;
        int indice = mb.busquedaLineal(valor);

        if (indice != -1) {
            System.out.println("El valor " + valor + " está en la posición " + indice);
        } else {
            System.out.println("El valor " + valor + " no se encontró.");
        }
    }
}
