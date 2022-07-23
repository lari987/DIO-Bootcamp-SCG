package exercicios.arrays;

import java.util.Random;

public class Ex4_Array_Multidimensional {
    public static void main(String[] args) {

        Random gerador = new Random();
        int[][] M = new int[4][4];

        for(int linha = 0; linha < 4; linha++){
            for(int coluna = 0; coluna < 4; coluna++){
                int numero = gerador.nextInt(9);
                M[linha][coluna] = numero;
            }
        }

        for(int linha = 0; linha < 4; linha++){
            for(int coluna = 0; coluna < 4; coluna++){

                System.out.print(M[linha][coluna] + " ");
            }
            System.out.println();
        }
    }
}
