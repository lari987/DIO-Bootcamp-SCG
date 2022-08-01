package br.com.dio.desafio;

import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args){
        Curso curso1 = new Curso(); //instanciando a classe
        curso1.setTitulo("Introdução á Programação e Pensamento Computacional");
        curso1.setDescricao("a dev aprenderá que o pensamento computacional influencia no desenvolvimento da lógica de programação");
        curso1.setCargaHoraria(5);

        Curso curso2 = new Curso(); //instanciando a classe
        curso2.setTitulo("Introdução ao Git e Github");
        curso2.setDescricao("a dev dará os seus primeiros passos na construção de um sistema de versionamento de código para determinado repositorio");
        curso2.setCargaHoraria(5);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Desenvolva seu pensamento computacional com orientação a objeto");
        mentoria.setDescricao("a dev terá como experiencia desenvolver sua lógica através do conceito de OO");
        mentoria.setData(LocalDate.now()); //data atribuida agora

        /*
        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);
        */


        //POLIMORFISMO - outras formas de instaciar uma classe que é abstrata
        //Conteudo conteudo = new Curso();
        //Conteudo conteudo1 = new Mentoria();

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Santander Code Girls");
        bootcamp.setDescricao("Sejam todas bem-vindas ao Santander Bootcamp 2022! Comece sua jornada na trilha de Java, assista as aulas, faça os desafios de códigos e projetos e conclua as atividades. Todas as graduadas receberão certificado e terão chance de ingressar no mercado de trabalho!");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devMaria = new Dev();
        devMaria.setNome("Maria Fernanda");
        devMaria.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos inicialmente: " + "\n" + devMaria.getConteudosInscritos() + "\n");
        devMaria.progredir();
        devMaria.progredir();
        System.out.println(" --------------------------------- Progresso de "+devMaria.getNome()+" --------------------------------");
        System.out.println("Conteudos inscritos de Camila: " + "\n" + devMaria.getConteudosInscritos() + "\n");
        System.out.println("Conteudos concluidos de Camila: " + "\n" + devMaria.getConteudosConcluidos() + "\n");
        System.out.println("XP acumulado: " + devMaria.calcularTotalXp() + "\n");

        Dev devJoao = new Dev();
        devJoao.setNome("João Augusto");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos inicialmente: " + "\n" + devJoao.getConteudosInscritos() + "\n");
        devJoao.progredir();
        System.out.println(" --------------------------------- Progresso de "+devJoao.getNome()+" --------------------------------");
        System.out.println("Conteudos inscritos: " + "\n" + devJoao.getConteudosInscritos() + "\n");
        System.out.println("Conteudos concluidos: " + "\n" + devJoao.getConteudosConcluidos() + "\n");
        System.out.println("XP acumulado: " + devJoao.calcularTotalXp());
    }
}
