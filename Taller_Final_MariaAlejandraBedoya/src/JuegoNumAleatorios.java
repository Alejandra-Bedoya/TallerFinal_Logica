//16. Cree un juego de numero aleatorios usando un ciclo while en el que cada vez que salga un cero se pierda una vida y cada vez que salga un numero diferente a cero se sume un punto. El juego termina cuando el total de vidas sea cero. Inicialice vidas = 5.

import java.util.Random;
import java.util.Scanner;

public class JuegoNumAleatorios {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int vidas = 5;
        int puntos = 0;
        boolean juegoEnCurso = true;

        System.out.println("¡Bienvenido al juego de números aleatorios!");

        while (juegoEnCurso) {
            // Generar un número aleatorio entre 0 y 9
            int numeroAleatorio = random.nextInt(10);

            if (numeroAleatorio == 0) {
                // Si sale un cero, pierde una vida
                vidas--;
                System.out.println("¡Salió un 0! Pierdes una vida. Vidas restantes: " + vidas);
            } else {
                // Si sale un número diferente de cero, suma un punto
                puntos++;
                System.out.println("¡Salió " + numeroAleatorio + "! Sumas 1 punto. Puntos totales: " + puntos);
            }

            // Verificar si el juego ha terminado
            if (vidas == 0) {
                System.out.println("¡Game Over! Te quedaste sin vidas.");
                juegoEnCurso = false;
            } else {
                System.out.println("Presiona Enter para continuar o 'S' para salir...");
                String input = scanner.nextLine().trim().toLowerCase();

                if (input.equals("S")) {
                    juegoEnCurso = false;
                }
            }
        }

        scanner.close();
        System.out.println("Gracias por jugar. Tu puntaje final fue: " + puntos);
    }
}

