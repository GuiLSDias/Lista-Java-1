package VerificacaoNumeros;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner verificaNumeros = new Scanner(System.in);
        System.out.println("Digite o primeiro numero:");
        int num1 = verificaNumeros.nextInt();
        System.out.println("Digite o segundo nuemro:");
        int num2 = verificaNumeros.nextInt();
        System.out.println("Digite o terceiro numero:");
        int num3 = verificaNumeros.nextInt();

        int maiorNumero = num1;
        if (num2 > maiorNumero) {
            maiorNumero = num2;
        }
        if (num3 > maiorNumero) {
            maiorNumero = num3;
        }

        System.out.println("\nO maior número é " + maiorNumero);

        verificarNumero(num1, "primeiro");
        verificarNumero(num2, "segundo");
        verificarNumero(num3, "terceiro");
    }
    private static void verificarNumero(int numero, String ordem) {
        if (numero > 0) {
            System.out.println("O " + ordem + " número é positivo");
        } else if (numero < 0) {
            System.out.println("O " + ordem + " número é negativo");
        } else {
            System.out.println("O " + ordem + " número é igual a zero");
        }
    }
}

