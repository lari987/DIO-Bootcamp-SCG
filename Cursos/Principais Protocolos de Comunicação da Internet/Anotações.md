# Protocolo HTTP (HyperText Transfer Protocol)

- Definido pelos RFCs 1945 e 2116
- Protocolo de comunicação
- **Browser** -> implementa o cliente HTTP
- **Servidor** -> host objetos web 

- Cliente
Mnesagens - Request HTTP (Objetos web)

- Servidor
Mensagens - Response HTTP (Protocolo TCP)

Arquiteura cliente-servidor
so preciso me preocupar com oq eu requisitar
e o servidor se preocupa em responder oq foi requisitado

é Stateless

1991
HTTP 0.9

1997
HTTP 1.1 (mapeamento de um endereço pra outro)

2015
HTTP 2.0

> comunicação persistente, uma vez que a comunicação é estabelecida, elas sao encerradas a partir de uma ação de encerramento

> comunicação não persistente, ele recebe o que pediu e é automaticamente encerrado

Get: https://www.amazon.com.br
Host: amazon.com
Connection: close
User-agent: Mozilla/5.0

assim q o servidor recebe a mensagem ele vai procurar nos arquivos, diretorios ou banco de dados todos os dados necessarios para responder aquela requisição

POST é uma submissão de um conteudo para o servidor, e o servidor é obrigado a tratar aquele conteudo

Post: https://www.amazon.com.br/cadastro <br>
Host: amazon.com <br>
Connection: close <br>
User-agent: Mozilla/5.0 <br><br>

_EX: preenchimento de cadastro_ 
atualização do SGBD
<br>

Formatos de estruturação de dados

XML e JSON

objetivo: é a serialização dos dados, processo de transformação dos dados, para a comunicação;
xml permite adicionar metadados ao arquivo

JSON
lightweight (sintaxe mais leve/mais facil/legivel)

## O que é comum entre os dois?

- auto-descritivos
- hierarquicos
- independentes de linguagem de prog
- vasta utilização

## Diferenças

- XML usa tags, o JSON usa chave-valor
- o XML é mais complexo, já o JSON é mais sucinto e legivel

se vc estiver mexendo com um sistema legado ou metadados, é melhor utilizar XML;
se estiver mexendo com aplicações leves é melhor JSON;

comunicação de tres vias
SYN -> SYN ACK -> ACK

### Particularidades do HTTP 1.1

eu vou enviar uma requisição e enquanto não receber a resposta nenhuma outra requisição é feita

### Problemas

- HOL - Head of Line Blocking
- Repetição de dados
- FOCO: CSS/JS E GZIP

Os browsers permitiram que o cliente consiga FAZER ATE 6 REQUISIÇÕES HTTP SIMUNTANEAS

## Estrutura do HTTP Request

<br>

| REQUEST LINE | HEADER LINE |
   |---|---|
   | Get:/somedir/page.htmlHTTP/1.1 | Host: www.someschool.edu Connection: close  <br> User-agent: Mozilla/5.0  |

   <br>

   | Metodo HTTP | Versão | URL | Tipo de Conexão | Pref. do Cliente |
   |---|---|---|---| --- |
   | Get:/somedir/page.html | HTTP/1.1 | www.someschool.edu | Connection:close | Accept-language:fr |

_conexão CLOSE não persistente_

estamos buscando algum recurso usamos GET
90% dos casos

## Metodos Resquest 

| TIPO | DESCRIÇÃO |
| --- | --- |
| GET | solicita um recurso do servidor |
| HEAD| GET sem corpo de resposta |
| POST | submete uma entidade a um recurso |
| PUT| substituição parcial de recursos pelos dados da requisição |
| DELETE| remoção de um recurso |
| TRACE| chamada de loop-back a um determiando recurso (diagnostico de rede) |
| OPTION| retorna quais as opções de comunicação com recurso |   
| CONNECT| tunelamento identificado pelo recurso |
| PATCH| modificação parcial |

Metodos Seguros: GET, POST e OPTION (pois não acarretam em nehuma modificação) são metodos idempotentes (retornam sempre a msm coisa) mas nem todos esses são seguros
<br>

### 200 OK: request bem sucedida e objeto enviado
### 301 Moved Permanently: objeto realocado nova URL no campo Location
### 400 Bad Request: servidor não entendeu a mesnagem
### 404 Not Found: o documento solicitado é inexistente
### 505 HTTP Version Not Supported: versão do protocolo não suportada pelo servidor

## Status Code

- Information response (100 - 199)
- Successful response (200 - 299)
- Redirection response (300 - 399)
- Client error response (400 - 499)
- Server error response (500 - 599)

LOCK ----------------->
<br>
<------------- PROPFIND
<br>
<-------------------GET
<br>
PUT------------------->
<br>
UNLOCK---------------->

O protocolo HTTP é STATELESS e Cliente/Servidor
pensando na utilização de banda

## O que são Cookies?

Pequenos pedaços ou blocos de dados criados e utilizados pelo servidor para persistir dados no dispositivo do cliente

_serve para rastrear inf do cliente_

os cookies estão dentro do header file

cookies de sessão a partir q a sessão encerra eles tbm somem

ex de cookie persistente, quando se mantem o seu _login ativo_, _informações de website_ e _carrinho de ecommerce_

os cookies podem buscar inf de vc, eles entraram para a LGPD pedindo seu concentimento

 um web cache tbm é chamadado de proxy server

 cliente (notebook)
 servidor (proxy server)
 cliente (proxy server) - se nao tiver oq ta procurando requisita para o servidor de http 

 ### Vantagens

 - redução do tempo de resposta
 - redução do trafego

 ## HTTP 2.0

 eu irei estabelecer uma conexao principal entre o cliente e o servidor
 enviar as requisiçoes de maneira independente

 (stream) -> multiplexação de canais

 priorização de recursos pelo peso 

 1.1
 Header
 Playload

 2.0
 Streaming ID header
 Streaming ID data

 PUSH
 o cliente ta solicitando uma parte da pag, e o servidor responde enviando tudo relacionada a aquela pagina 

 - não é habilitado por default
 - se o cliente n tiver suporte do push vai dar RUIM

 ## O que o cliente suporta?

 - unica conexao persistente
 - compressão de header
 - server push
 - HTTPs por padrao TLS
 - negociação no handshake (decide se usa ou não) 

 ## Contras

 - se fizer aluma conf incorreta no push vai dar prob
 - se vc tiver usando o Mixe 1.1 e 2.0
   - lentidão
   - load balancer - http 1.1

## Tipos de Servidores/Sistemas

- APACHE HTTP SERVER PROJECT
- NGINX
- XAMPP

## APACHE

- datado de 1995
- contribuição c/www
- opensource e free
- comunidade: _Apache Software Foundation_

### Caracteristicas

- modular, dinamico e carregavel
- processamento multiplo de request
- altamente escalavel + 10.000 conexões simultaneas
- lida com arquivos estáticos, index, auto-indexing e negociação de conteudo
TLS/SSL via OpenSSL ou wolfSSL
- servidores vituais com endereços baseados em IP ou nome
- compatibilidade com IPV6
- suporte á versão 2.0 do HTTP
- Proxy reverso, websocket...

_macivamente utilizando em linux_

## XAMPP

Pacote/ ambiente
- utiliza o apache server, Maria DB, tem suporte para interpretadores script - PHP/Perl 
- diversos modulos (OpenSSL, phpMyAdmin, MediaWki, Joomla, Wordpress)

_mais usado para teste e desenvolvimento_
SEM/ ACESSO A INTERNET

## NGINX

Servidor / 2004

- web server
- proxy reverso
- load balancer
- mail proxy
- http cache

apache 35% e NGINX 33% de utilização

wireshark faz o gerenciamento e diagnostico de rede -> usado pelo pessoal de rede

## Criptografia por Chave

- ASSIMETRICA
  - chave privada e publica
  - cifra de césar
- SIMETRICA
  - chave unica privada
  - conhecimento prévio da chave, como tranferir a chave?
  - TIPOS:
   - cifra de fluxo (sequencia de bits pseudo-aleatorio)
   - cifra de bloco (utilizada pelos protocolos SSL, PGP, Ipsec) permutação/bloco a bloco

   k = 3; 2^3 = 8! = 40.320  

  ## Criptografia por chave

  _Funcionamento:_ substituição da letra pela k-ésima do alfabeto rotatividade do alfabeto

## O que é certificar uma chave?

IP sec, SSL e TSL

duas pessoas para ser o bob, só descubro quem é o bob pela chave 

## Qual o papel da entidade certificadora?

- verificação de identidade
- emissão de certificados

## Padrões de autoridades certificadoras

- IETF
- RFC 1422

## Protocolo SSL

protocolo de segurança que funciona por cima do TCP

- confiabilidade
- integridade
- autenticidade
  
## Handshake

TCP starts -> TCP response -> TCP confirmation

verificação de Autenticidade

SSL Hello -> certification

envio da master secret key

Verificação da autenticidade por certificados digitais Porta 443

### LGPD protege:
- dados de identificação dos usuarios
- dados sensiveis (religião, etnia)
- define o tratamento dos dados
- livre conssentimento
- direitos do titular das informações
- sações aos que descumprirem as regras

### Quem deve seguir a lei???

- empresas que precisam manter umBD
- funcionarios e usuarios

### web applications

conexão principal e chamadas http

Qual é o problema de usar o http para apps web browser

1. conexões subjacentes
2. alto overhead
3. mapeamento vis script

### Qual seria a solução?

uma conexão bidirecional (websocket)
EX: twitter, aplicações em tempo real, games, trello, yahoo finance...

a API do websocket roda encapsulado no http

filtragem, proxy e autenticação aproveitadas pelo websocket

### websocket opera em duas fases:
handshake de 2 vias
SYN  ->  SYN ACK
utiliza cookies

Data Transfer
"o protocolo fornece comunicação cliente/servidor executando um codigo não confiavel em um ambiente controlado para o host que escolheu essa comunicação" 

### Web socket connection

envia uma mensagem com uma sequencia de encerramento para o servidor, e o servidor envia uma confirmação

Filosofia do WebSocket

1. origin-base secury model
2. endereçamento e protocolo (acaba se aproveitando do endereçamento do http para criar os endereçamentos)
3. camadas -> enquadramento on top TCP
4. encerramento do handshake

### Outras caracteristicas 

- campos sec-... no edition
- independente do tcp
- interpretação do http server
- porta 443

o cliente manda uma msg para o DNS, qual é o IP que esta associado a esse dominio, apartir dai o cliente ja consegue iniciar uma comunicação com o servidor apache e enviar requisições

o SOCKET é uma conexao via camada de transporte, onde ha uma identificação ip e porta com a conexao da camada superior

se os objetos web estão em cache vou entrar em contato com o proxy e ele vai me enviar oq eu pedi

varios clientes espalhados, o load balancer pode fazer uma DISTRIBUIÇÃO DE CARGAS com os servidores http disponiveis, outra caracterisitica é a MULTIPLEXAÇÃO 

> nesse curso foi falando sobre comunicação sincrona
