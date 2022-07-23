package br.com.dio.exercicios.loops;

import java.util.Scanner;

public class Ex4_Par_Impar {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        int quantidade = 0;
        int numero;
        int quantidadePares = 0;
        int quantidadeImpares = 0;

            System.out.println("Escolha um número, para formar a sequencia: ");
            quantidade = leitor.nextInt();

        for (int i = 1; i <= quantidade; i++){
            System.out.println("Digite um número: ");
            numero = leitor.nextInt();

            if (numero % 2 == 0){
                quantidadePares++;
            }else{
                quantidadeImpares++;
            }
        }
        System.out.println("quantidade de numeros pares: " + quantidadePares);
        System.out.println("quantidade de numeros impares: " + quantidadeImpares);
    }
}
