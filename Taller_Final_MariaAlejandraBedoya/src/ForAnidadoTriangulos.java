//7. Usando ciclos for anidados imprima un triangulo de asteriscos (*).

import java.util.Scanner;
// 7. Usando ciclos for anidados imprima un triangulo de asteriscos (*).
public class ForAnidadoTriangulos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el tamaño del triángulo (número de filas): ");
        int tamano = scanner.nextInt();
        scanner.close();


        for (int i = 1; i <= tamano; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}