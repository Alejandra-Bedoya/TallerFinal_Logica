//4. Ciclo while para sumar los números del 1 al 10
public class SumaWhile {
    public static void main(String[] args) {
        int numero = 1;
        int suma = 0;

        while (numero <= 10) {
            suma += numero;
            numero++;
        }

        System.out.println("La suma de los números del 1 al 10 es: " + suma);
    }
}

