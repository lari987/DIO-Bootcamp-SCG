package exercicios.loops;

import java.util.Scanner;

public class Ex3_Maior_Media {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        int numero;
        int maior = 0;
        int soma = 0;
        int media = 0;

        for (int i = 1; i <= 5; i++){
            System.out.println("Digite um número: ");
            numero = leitor.nextInt();

            soma = soma + numero;

            if (numero > maior){
                maior = numero;
            }

        }
        media = soma/5;
        System.out.println("maior = " + maior);
        System.out.println("media = " + media);
    }
}
