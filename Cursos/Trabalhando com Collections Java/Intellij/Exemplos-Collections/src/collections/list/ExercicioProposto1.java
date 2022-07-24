package collections.list;

import java.util.*;


public class ExercicioProposto1 {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        double temperatura;
        double soma = 0;
        List<Double> temperaturas = new ArrayList<Double>();

        for(int i = 0; i < 6; i++){
            System.out.println("Digite a temperatura: ");
            temperatura = leitor.nextDouble();
            temperaturas.add(temperatura);
            soma += temperaturas.get(i);
        }

        double media = soma/temperaturas.size();
        System.out.printf("\nMedia:%.1f ",media);

        System.out.println("\nTemperaturas maiores que a media: ");

        for(int i = 0; i < 6; i++){
            if(temperaturas.get(i) > media){
                switch(i){
                        case 0:
                         System.out.println("1 - Janeiro, temp: " + temperaturas.get(i));
                          break;
                        case 1:
                         System.out.println("2 - Fevereiro, temp: " + temperaturas.get(i));
                          break;
                        case 2:
                         System.out.println("3 - Março, temp: " + temperaturas.get(i));
                          break;
                        case 3:
                         System.out.println("4 - Abril, temp: " + temperaturas.get(i));
                          break;
                        case 4:
                         System.out.println("5 - Maio, temp: " + temperaturas.get(i));
                          break;
                        case 5:
                         System.out.println("6 - Junho, temp: " + temperaturas.get(i));
                          break;
                    default:
                         System.out.println("Mes inválido");
                          break;

                }
            }
        }
    }
}
