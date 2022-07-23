package br.com.dio.exercicios.loops;

import java.util.Scanner;

public class Ex2_Nota {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        double nota;
        System.out.println("Digite uma nota: ");
        nota = leitor.nextDouble();

        while(nota < 0 | nota > 10){
            System.out.println("Nota invalida! Digite novamente: ");
            nota = leitor.nextDouble();
        }
        System.out.println("Nota aceita!");
    }
}
