package br.com.dio.desafio.dominio;

/*
criou a classe CONTEUDO para deixar o codigo mais enxuto, não tendo repetições, atraves da herança
*/


public abstract class Conteudo { //ao deixar a classe abstrata vc não consegue instanciar o conteudo
    protected static final double XP_PADRAO = 10; //permite que as classes conteudo e mentoria tenham acesso

    private String titulo;
    private String descricao;

    public abstract double calcularXp();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
