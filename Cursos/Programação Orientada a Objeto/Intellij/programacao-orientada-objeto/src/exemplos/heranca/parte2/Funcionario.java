package exemplos.heranca.parte2;

class Funcionario {

    public static void main(String[] args){

        Funcionario funcionario = new Funcionario();

        // UPCASTS - IMPLICITO
        Funcionario gerente = new Gerente();
        Funcionario vendedor = new Vendedor();
        Funcionario faxineiro = new Faxineiro();

        // DOWNCAST
        Vendedor vendedor_ = (Vendedor) new Funcionario(); //deve ser evitado pq dá erro

    }
}
