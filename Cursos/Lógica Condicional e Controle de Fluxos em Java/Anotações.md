# O que são Operadores Relacionais?
## Conceituação 

>"São simbolos especiais quais são capazes de realizar comparações entre determinados operandos e, em seguida, retornar um resultado"

## Tipos:
- ### **similaridade:** igual, diferente;
- ### **tamanho:** maior, maior igual, menor, menor igual;

(_se usa " = " para fazer uma atribuição_)

(_não se usa operadores de tamanho para comparar_ STRINGS _ou_ BOOLEANOS)

tbm não da pra compara uma string com um char pq a diferença de um dado para outro é mt grande

# O que são Operadores Lógicos?
## Conceituação

>"São simbolos especiais quais são capazes de realizar comparações lógicas entre operandos lógicos ou expressões e, em seguida, retornar um resultado"

## Tipos
- Conjunção
- Disjunção
- Disjunção Exclusiva
- Negação

## Conjunção:
operação lógica que só é verdadeira quando ambos os operandos ou expressões envolvidas são verdade

### **simbologia:** &&      
### **terminologia:** and
<br>

| O-E | O-E | R |
| --- | --- | - |
|  V  |  V  | V |
| V   | F   | F |
| F   | V   | F |
| F   | F   | F |


## Disjunção:
operação que só é falsa quando ambos os operandos ou expressões envolvidas são falsas

### **simbologia:** ||     
### **terminologia:** or
<br>

| O-E | O-E | R |
| --- | --- | - |
|  V  |  V  | V |
| V   |F    | V | 
| F   | V   | V |                               
| F   | F   | F |


## Disjunção Exclusiva:
operação que só é verdadeira quando ambos os operandos ou expressões envolvidas são opostos

### **simbologia:** ^   
### **terminologia:** xor

<br>

| O-E | O-E | R |
| --- | --- | - |
|  V  |  V  | F |
| V   |F    | V | 
| F   | V   | V |                               
| F   | F   | F |


## Negação:
operação que inverte o valor lógico de um operando ou expressão

### **simbologia:** !    
### **terminologia:** inverção
<br>

| O-E | O-E | R |
| --- | --- | - |
|  V  |  F  | V |
| F   | V   | V | 

## Curiosidades
- ### **Operadores bitwise:** & e | 
(_vai mexer com bits de numeros inteiros_)

- ### **Operadores shift:** ~, >>, >>>, <<

## Boas Práticas
>### crie variaveis auxiliares para guardar resultados intermediarios:
<br>
(salarioMensal < mediaSalario) && (quantidadeDependentes >= mediaDependentes)
<br>
<br>

### **pode ser** 
<br>
(salarioBaixo) && (muitosDependentes)

<br>
Boolean (recebeAuxilio) = (salarioBaixo) && (muitosDependentes)

<br>

_pois facilita o entendimento do código_

# O que é Controle de Fluxo?

>"São estruturas que tem a capacidade de direcionar o fluxo de execução de código"

## Tipos:
- **Decisão:** if, if-else, if-else-if, if-else-if-else switch e operador ternário

(_estrutura que avalia uma condição booleana ou váriavel para direcionar o fluxo de execução_)

<table border=\"1\">
   <tr>
  <th align=\"right\">Tipo</th> 
  <th align=\"left\">Sintaxe</th>
   </tr>
   <tr>
<td align=\"right\">if</td>
<td align=\"left\">if (idade > 18) {<br>}</td>
    </tr>
    <tr>
<td align=\"right\">if-else</td>
<td align=\"left\">if (aprovado) {<br>} else {<br>}</td>
    </tr>
<tr>
<td align=\"right\">if-else-if-else</td>
<td align=\"left\">if (casado && temFilhos) {<br>} else if (casado && semFilhos) {<br>}
<br> else {<br>}</td>
</tr><tr><td align=\"right\">Operador Ternário</td><td align=\"left\">ligado? desligar : ligar;
<br> emMovimento ? freia : null;</td>
<tr>
<td align=\"right\">Switch</td>
<td align=\"left\">switch (olhos) {
    <br>
    case "AZUIS" : <br>
    break;
    <br>
    case "VERDES" :
    <br>
    break;
    <br>
    default :
    <br>
    break;
    <br>
    }</td>
</table>
<br>


- **Repetição:** for, while, do while
- **Interrupção:** break, continue e return 

## Boas Práticas

- Switchs é para valores exatos e if para expressões booleanas
- Evitar usar o default do switch para "cases genericos"
- Evitar o efeito "flecha" dos ifs
- Evitar muitos ifs aninhados
- Usar a boa prática da aula 2 para diminuir o tamanho do if (_criar variaveis intermediarias_) 

# Blocos, Tipos e Uso
## Conceituação

>"É um grupo de 0 ou mais códigos dos quais trabalham em conjunto para executar uma operação"

## Tipos
- LOCAIS: dentro de métodos;
- ESTÁTICOS: dentro de classes; (orientação ao objetos)
- INSTANCIA: dentro de classes;




