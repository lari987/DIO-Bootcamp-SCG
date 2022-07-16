package one.digitalinnovation.basecamp;

public class Calculadora {
    public static void soma(double n1, double n2){
        double resultado = n1 + n2;
        System.out.println(n1 + " + " + n2 + " = " + resultado);
    }
    public static void subtracao(double n1, double n2){
        double resultado = n1 - n2;
        System.out.println(n1 + " - " + n2 + " = " + resultado);
    }
    public static void multiplicacao(double n1, double n2){
        double resultado = n1 * n2;
        System.out.println(n1 + " x " + n2 + " = " + resultado);
    }
    public static void divisao(double n1, double n2){
        double resultado = n1 / n2;
        System.out.println(n1 + " / " + n2 + " = " + resultado);
    }
}
