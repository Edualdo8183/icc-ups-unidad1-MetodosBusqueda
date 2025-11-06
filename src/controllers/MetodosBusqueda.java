package controllers; //Error raro, falla en la computadora

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

    public int busquedaLinealWhile(int value){
        while()
        return -1;
    }
}



