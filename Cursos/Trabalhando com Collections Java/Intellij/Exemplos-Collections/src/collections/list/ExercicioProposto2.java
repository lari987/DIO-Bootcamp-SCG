package collections.list;

import java.util.*;

public class ExercicioProposto2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        String resposta;
        int respostasPositivas = 0;
        List<String> respostas = new ArrayList<String>();

        System.out.println("\nPerguntas sobre Crime, Responda com S/N\n");
        System.out.println("1. Telefonou para a vítima?");
        resposta = leitor.next();
        respostas.add(resposta);
        System.out.println("2. Esteve no local do crime?");
        resposta = leitor.next();
        respostas.add(resposta);
        System.out.println("3. Mora perto da vítima?");
        resposta = leitor.next();
        respostas.add(resposta);
        System.out.println("4. Devia para a vítima?");
        resposta = leitor.next();
        respostas.add(resposta);
        System.out.println("5. Já trabalhou com a vítima?");
        resposta = leitor.next();
        respostas.add(resposta);

        for(int i = 0; i < 5; i++){
            if(respostas.get(i).equals("S")){
                respostasPositivas++;
            }
        }
        switch(respostasPositivas){
            case 2:
                System.out.println("Voce é suspeito!");
                break;
            case 3:
            case 4:
                System.out.println("Voce é cúmplice!");
                break;
            case 5:
                System.out.println("Voce é o ASSASSINO!");
                break;
                default:
                    System.out.println("Voce é INOCENTE!");
                    break;
        }
    }
}
