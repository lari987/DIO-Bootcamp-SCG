package br.com.dio.exercicios.arrays;

import java.util.Scanner;

public class Ex2_Consoantes {
    public static void main(String[] args){

        String[] caracteres = new String[6];
        int quantidadeConsoantes = 0;
        Scanner leitor = new Scanner(System.in);

        for (int i = 0; i < 6; i++){
            System.out.println("Digite uma letra: ");
            caracteres[i] = leitor.next();

            if (
                    caracteres[i].equals("a") ||
                    caracteres[i].equals("e") ||
                    caracteres[i].equals("i") ||
                    caracteres[i].equals("o") ||
                    caracteres[i].equals("u")){
               quantidadeConsoantes++;
            }
        }
        System.out.print("vetor = ");
        for (String caracter : caracteres) { //for each
            System.out.print(caracter + " ");
        }

        System.out.println("\nquantidade de consoantes: " + (6 - quantidadeConsoantes));
    }
}
