//5. Usando un ciclo for imprima la suma de los numeros del 1 al 10.
public class SumaFor {
    public static void main(String[] args) {
        int suma = 0;

        for (int numero = 1; numero <= 10; numero++) {
            suma += numero;
        }

        System.out.println("La suma de los números del 1 al 10 es: " + suma);
    }
}