//12. Imprima los múltiplos de 3 usando un ciclo for.
public class ForMultiplosDeTres {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }
}
