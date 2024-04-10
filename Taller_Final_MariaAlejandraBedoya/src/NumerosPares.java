//9. Usando while imprima los numeros pares del 0 al 100.

public class NumerosPares {
    public static void main(String[] args) {
        int numero = 0;


        while (numero <= 100) {
            if (numero % 2 == 0) {
                System.out.println(numero);
            }
            numero++;
        }
    }
}

