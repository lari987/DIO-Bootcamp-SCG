# O que é o Maven?

- ferramenta para gerenciar build e dependencias de um projeto;
- primeira versão em julho de 2004, mantido pelo Apache Software Foundation

veio pra ajudar a empacotar os elementos contidos no projeto

- endereça como o software foi construido e suas dependencias atráves do POM (Project Object Model)
  - _existe um arquivo na raiz de todo projeto, que explica como a aplicação vai ser empacotada, se ela vai executar os testes, quais dependencias(frameworks, bibliotecas) existem naquela aplicação_
- facilita a compreensão do desenvolvedor
- fornecer informações de qualidade (executar os testes, existem pluggings que ajudam a verificar a qualidade do projeto)

gerar um template da internet com um padrão de um projeto java pré definido

## COMANDOS

1. compilar: **compile**
2. testar: **test** (executa as classes de teste)
3. empacotar: **package**
4. limpar diretorio de trabalho: **clean** (a pasta em questão desaparece)

o _MAVEN ARCHETYPE É UM TEMPLATE_ que possibilita a personalização e a configuração de como um projeto vai ser construido

- pesquisar na internet por "maven archetype list", para encontrar a opção que faz mais sentido para o seu cenario
- procurar pelas instruções de execução do comando _mvn archetype_

## POM

- POM - Project Object Model
- unidade undamental de trabalho do apache maven
- utiliza o formato XML, e esta na raiz do seu projeto
- detalha o projeto
- detalha tambem como construir o projeto
- Maven sempre procura pelo pom.xml para realizar sua execução

## O que aparece no ARQUIVO??

- nome do projeto 
- dependencias
- modulos
- configurações de build 
- detalhes do projeto (nome,descrição, licença, url)
- configurações de ambiente (repositorios, tracking, profiles)

para o projeto funcionar basta só detalhar o pom.xml

**INFO. OBRIGATÓRIA**

modelVersion
groupId
artifactId
version

super POM -> pom.xml

tudo aquilo que vc não declarou no seu xml ele busca no super pom


