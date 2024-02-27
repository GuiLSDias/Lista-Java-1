package TabuadaInterativa;

import java.util.Scanner;

public class Main {
    public static void  main(String[] args){
        Scanner tabuadaNumeros = new Scanner(System.in);

        System.out.println("Digite um numero:");
        int num = tabuadaNumeros.nextInt();

        int i = 1;
        while(i<=10){
            int result = num *i;
            System.out.println(num + "*" + i +"="+ result);
            i++;
        }
        tabuadaNumeros.close();
    }
}
