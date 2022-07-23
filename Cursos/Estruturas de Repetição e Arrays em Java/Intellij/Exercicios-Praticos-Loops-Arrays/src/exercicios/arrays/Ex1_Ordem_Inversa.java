package exercicios.arrays;

public class Ex1_Ordem_Inversa {
    public static void main(String[] args){

        int[] vetor = {-5, -6, 15, 50, 8, 4};

        for (int i = 5; i >= 0; i--){
            System.out.print(vetor[i] + " ");
        }
    }
}