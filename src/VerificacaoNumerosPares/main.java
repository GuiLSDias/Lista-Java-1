package VerificacaoNumerosPares;

public class main {
    public static void main(String[] args) {

        for (int numero = 1; numero <= 100; numero++) {
            if (numero % 2 == 0) {
                System.out.println(numero);
            }
        }
    }
}