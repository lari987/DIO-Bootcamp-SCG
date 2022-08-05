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
- unidade fundamental de trabalho do apache maven
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

## O que são repositórios?

- São locais onde podemos encontrar plugins e bibliotecas que o Maven prove

- Dois tipos: Local e Remoto

## Repositório remoto

- é o local central utilizado pelo Maven para buscar os artefatos 

- Configurado automaticamente pelo super POM para utilizar o Maven Central

podemos tambem mudar a config global do apache maven instalado para utilizar um repositório remoto, apartir do arquivo setting.xml

## Repositório local

- é o repositorio na maquina utilizado pelo Maven para buscar os artefatos.
- estratégia de caching -> **evitar que todas as nossas execuções tenham que fazer uma busca externa**
- localizações
- Windowns: %USERPROFILE%\.m2\repository
- Linux: $HOME/.m2/repository

quando não tem repositorio local, ele baixa pro local para futuras consultas

## Adicionar Dependencias

vai no arquivo pom.xml > tag dependecies > especificando o groupId/artifactId e version

- groupId: é como se fosse o id da organização. Segue as regras de nomes de pacotes Java.

- artifactId: Nome do projeto em si

- version: número da versão que será utilizada 

mvn install -> publica localmente o seu componente  (se torna uma dependecia passivel de uso)

para vc reutilizar o seu componente em outro projeto, basta ir no pom.xml e adcionar em dependencies 

## Tipos de dependencias

- Direta: dependencias declaradas no pom.xml
- Transitiva: dependencias obrigatórias das dependencias declaradas no pom.xml

ex: o componente componente adicionou cm dependencia o hibernate e quando adicionou esse componente para outro projeto o gson veio junto 

_para lidar com o problema da transitividade, o Maven prove escopos para limitar isso. Existem 6 tipos de escopos que podemos utilizar_

o classpath é a referencia que a aplicação tem para aquele momento de execução, o maven acaba dividindo isso em RUNTIME, TEST e COMPILE

## Escopo compile

- escopo default
- disponivel em todos os classpaths
- é transitivo

Escopo default escopo padrão que vai ser considerado que a nossa dependencia não tenha o escopo

## Escopo provided

- indica que a dependencia será fornecida em tempo de execução por uma implementação na JDK ou via container 
_Exemplos:_ servlet API, Java EE APIs
- a dependencia com esse escopo é adicionado no classpath usado para compilação (compile) e teste (test) mas não em runtime;
- não é transitiva

## Escopo runtime

- indica que a dependencia é necessária para execução e não para compilação
- Maven inclui no classpath dos escopos de runtime e test

escopo usado só na hora de executar a aplicação

## Escopo test

- disponivel somente para compilação e execução de testes 
- não é transitivo

## Escopo system

- similar ao escopo provided exceto por ser necessario prover o JAR explicitamente
- a dependencia com esse escopo é adicionado no classpath usado para compilação (compile) e teste (test) mas não em runtime
- não é transitiva

utiliza uma localização no sistema para apontar 

## Escopo import

- este escopo é disponivel apenas com uma dependencia do tipo POM e com tag <dependencyManagement>
- indica um processo de reutilizar dependencias de um projeto

## Dependencias Opcionais

- utilizando quando uma dependencia não é necessaria para os projetos que irão reutilizar seu componente

## Exclusions

- utilizado quando o componente que voce usa compartilha uma biblioteca que voce já tem ou não quer ter disponivel (_quando vc não usa o optional e quer excluir determinada dependencia em seu componente_)

MAVEN ME APRESENTA O CLASSPATH DO COMPILE

## Maven Build Lifecycle

- é um conceito de ciclo de vida de construção
- conceito e os comandos da ferramenta
- composto por 3 ciclos de vida
- cada ciclo possui fases (maven phases)
- cada fase possui objetivos

## DEFAULT 

- principal ciclo
- responsavel pelo deploy local
- composto por 23 fases/**comandos** (validate, compile, test-compile, test, integration-test, package, install (publicar o componente localmente) e deploy)

## CLEAN

- ciclo intermediario (preparado para uma publicação)
- responsavel pela limpeza do projeto
- possui 3 fases (pre-clean, clean, post-clean)

## Site Lifecicle

- ciclo final
- responsavel pela criação do site de documentação do projeto
- composto por 4 fases (pre-site, site, post-site, site-deploy)

## Porjetos multi-módulos

times que estão distribuidos em 4 projetos (core, service, webapp e controller) cada um desses proejtos tem um pipeline, repositorio separados
gerenciar esses projetos da trabalhos

existe o projeto agregador e os componentes internos que são chamados de SUB-MODULOS

## O que são Plugins?

- a maioria das funcionalidades são providas por plugins 
- estilo arquitetural para extensibilidade (criar seu proprio plugin) -> _costumizar a execução_
- escrito prioritariamente em Java e disponibilizados comumente como JARs

- _toda arquitetura utilizada por tras do maven utiliza plugins_

- _esse tipo de arquiteura é muito comum em IDEs_

## Plugins mais utilizados

- eclipse (integração com a IDE eclipse)
- jacoco (cobertura de codigo)
- ear (enpacotamento no formato EAR)
- war (enpacotamento)
- compile
- clean
- chekstyle (verificar se o codigo esta no estilo que voce config)
- javadoc

"goal-name" -> é a tarefa que aquele plugin vai ter

o config do plugin sempre é feita pela TAG BUILD




