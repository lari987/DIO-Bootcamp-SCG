package exemplos.heranca.parte3;

class RodarAplicacao {

    public static void main(String[] args){

        ClasseMae[] classes = new ClasseMae[]{new ClasseFilha1(), new ClasseFilha2(), new ClasseMae()};

        //SEMPRE TERÁ COMO TIPO DE DADO A CLASSE MAE MAS A INSTANCIA DA CLASSE FILHA


        for (ClasseMae classe : classes) {
            classe.metodo1(); //metodo se comportou de acordo com o tipo de dado - sobrescrita com POLIMORFISMO
        }
        System.out.println(" ");

        for (ClasseMae classe : classes) {
            classe.metodo2(); //não houve polimorfismo só a classe mãe a a filha2 que tem o metodo 2
        }
        System.out.println(" ");

        ClasseFilha2 classeFilha2 = new ClasseFilha2(); //SOBRESCRITA
        classeFilha2.metodo2();
    }
}
