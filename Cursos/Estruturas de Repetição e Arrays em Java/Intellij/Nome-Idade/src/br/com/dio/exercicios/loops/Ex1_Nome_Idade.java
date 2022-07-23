package br.com.dio.exercicios.loops;

import java.util.Scanner;

public class Ex1_Nome_Idade {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        String nome;
        int idade;

        while(true){
            System.out.println("Nome: ");
            nome = leitor.next();
            if(nome.equals("0")) break;

            System.out.println("Idade: ");
            idade = leitor.nextInt();
        }
        System.out.println("O programa termina aqui...");
    }
}
