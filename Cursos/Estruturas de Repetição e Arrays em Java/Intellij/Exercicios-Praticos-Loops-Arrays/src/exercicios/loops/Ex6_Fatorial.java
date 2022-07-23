package exercicios.loops;

import java.util.Scanner;

public class Ex6_Fatorial {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int numero;
        System.out.println("Escolha um número, para fazer o fatorial: ");
        numero = leitor.nextInt();
        int fatorial = numero;

        for (int i = fatorial-1; i >= 1; i--){

            fatorial = fatorial * i;

        }
        System.out.println(numero+"! = " + fatorial);
    }
}
