package exercicios.arrays;

import java.util.Random;

public class Ex3_Numeros_Aleatorios {
    public static void main(String[] args) {

        Random gerador = new Random();
        int[] numerosAleatorios = new int[20];

        for(int i = 0; i < 20; i++){
            int numero = gerador.nextInt(100);
            numerosAleatorios[i] = numero;
        }
        System.out.print("vetor = ");
        for (int numeroAleatorio : numerosAleatorios) {
            System.out.print(numeroAleatorio + " ");
        }
    }
}

