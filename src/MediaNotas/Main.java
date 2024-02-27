package MediaNotas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner mediaNotas = new Scanner(System.in);

        System.out.print("Digite o número de alunos: ");
        int numeroDeAlunos = mediaNotas.nextInt();

        double[] notas = new double[numeroDeAlunos];

        for (int i = 0; i < numeroDeAlunos; i++) {
            System.out.print("Digite a nota do aluno " + (i + 1) + ": ");
            notas[i] = mediaNotas.nextDouble();
        }

        double somaNotas = 0;
        for (double nota : notas) {
            somaNotas += nota;
        }
        double media = somaNotas / numeroDeAlunos;
        System.out.println("A média das notas é: " + media);
        mediaNotas.close();
    }
}
