//11. Usando for anidado imprima una triángulo con los numero del 1 al 10 .

public class ForTrianguloNum {
    public static void main(String[] args) {
        int numero = 1;
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(numero + " ");
                numero++;
                if (numero > 10)
                    break;
            }
            System.out.println();
            if (numero > 10)
                break;
        }
    }
}