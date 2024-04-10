//8. Usando ciclo for anidado imprima un cuadrado de asteriscos(*).

//8. Usando ciclo for anidado imprima un cuadrado de asteriscos(*).

import java.util.Scanner;

public class ForAnidadoCuadrados {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el tamaño del cuadrado (número de filas y columnas): ");
        int tamano = scanner.nextInt();
        scanner.close();

        for (int i = 1; i <= tamano; i++) {
            for (int j = 1; j <= tamano; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

