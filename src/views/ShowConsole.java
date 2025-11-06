package views;

public class ShowConsole {

    public ShowConsole() {
        
    }

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
}


