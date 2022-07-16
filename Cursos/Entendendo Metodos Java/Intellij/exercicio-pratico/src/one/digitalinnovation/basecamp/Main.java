package one.digitalinnovation.basecamp;

public class Main {
    public static void main(String[] args){

        //calculadora
        System.out.println("Exercicio Calculadora:");
        Calculadora.soma(3,6);
        Calculadora.subtracao(9, 1.8);
        Calculadora.multiplicacao(7, 8);
        Calculadora.divisao(5, 2.5);
        //Mensagem
        System.out.println("Exercicio Mensagem de Saudação:");
        Mensagem.obterMensagem(9);
        Mensagem.obterMensagem(17);
        Mensagem.obterMensagem(22);
        System.out.println("Exercicio Emprestimo:");
        //Emprestimo
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, 5);
    }
}
