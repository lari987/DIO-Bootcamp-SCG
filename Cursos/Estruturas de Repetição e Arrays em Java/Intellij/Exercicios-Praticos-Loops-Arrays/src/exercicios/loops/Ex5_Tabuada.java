package exercicios.loops;

import java.util.Scanner;

public class Ex5_Tabuada {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int numeroTabuada;
        int tabuada;

        System.out.println("Escolha um número, para formar a tabuada: ");
        numeroTabuada = leitor.nextInt();

        for (int i = 1; i <= 10; i++){

            tabuada = numeroTabuada * i;
            System.out.println(numeroTabuada + " x " + i + " = " + tabuada);
        }
    }
}