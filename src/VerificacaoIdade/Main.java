package VerificacaoIdade;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner verificaIdade = new Scanner(System.in);
        System.out.println("Diigte sua idade: ");
        int num = verificaIdade.nextInt();
        if(num >= 18)
            System.out.println("Maior de idade");
        else
            System.out.println("Menor de idade");
    }
}
