package exemplos.heranca.parte3;

class ClasseFilha2 extends ClasseMae{

    @Override //o override serve para sobrescrever
    void metodo1(){
        System.out.println("Metodo 1 da classe filha 2");
    }
    @Override
    void metodo2(){
        System.out.println("Metodo 2 da classe filha 2");
    }

}
