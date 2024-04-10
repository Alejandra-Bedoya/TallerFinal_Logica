//13. Imprima los múltiplos de 3 usando un ciclo while.
public class WhileMultiplosDeTres {
    public static void main(String[] args) {
        int numero = 1;

        while (numero <= 100) {
            if (numero % 3 == 0) {
                System.out.println(numero);
            }
            numero++;
        }
    }
}
