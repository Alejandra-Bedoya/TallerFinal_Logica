//3. Usando for anidado imprima las tablas de multiplicar del 1 al 10.
//Organice de manera que se visualice en una sola línea cada tabla.
public class TablasDeMuliplicar {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(i + " x " + j + " = " + (i * j) + "\t");
            }
            System.out.println();
        }
    }
}

