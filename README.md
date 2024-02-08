# Identificação

* Nome: 
* Email (@ccc): 
* Matrícula: 

# Roteiro: Algoritmos Recursivos

## Introdução

Depois deste roteiro você será capaz de implementar alguns algoritmos recursivos clássicos e comparar o tempo de execução das versões recursivas e iterativas.

**O exemplo.** Vamos trabalhar com a busca binária, que vimos na aula teórica.  Veja em `/src/main/java` que eu já implementei a versão iterativa deste algoritmo e já preparei um `main` para logar a execução com os dados
necessários para plotar os gráficos. 

Agora é com vocês!

## A tarefa. 

### Implementação e testes

Comece gerando o arquivo que vai conter arrays de diferentes tamanhos. No diretório `scripts`, execute:

> python gera-arrays.py > ../data/input-arrays.data

Veja que o arquivo `../data/input-arrays.data` contém arrays de diversos tamanhos que vamos usar para ver o desempenho dos nossos algoritmos buscando elementos neles.

Agora execute a classe `Main` passando como entrada esses Arrays. No diretório `src/main/java`, execute:

> java Main < ../../../data/input-arrays.data

Agora, **implemente a versão recursiva da busca binária**. Modifique o código para logar o tempo de execução da sua implementação também e redirecione a saída para um arquivos chamado `execution.data`, que deve conter os dados da versão recursiva e da versão iterativa.

> java Main < ../../../data/input-arrays.data > ../../../data/execution.data

Confira se o arquivo `../../../data/execution.data` foi gerado corretamente.

### Análise

Plote o gráfico e analise os dados. No diretório scripts, execute o comando: `R < plot.R --vanilla ../data/execution.data`

Perguntas importantes:

  * Na prática, qual é mais veloz? Por que você acha isso?
  * Na teoria, qual a classe de complexidade dos dois algoritmos? O que isso significa?
  * Trata-se de algoritmos eficientes de busca? Por que?

### Mais estudo

Implemente as seguintes questões (com recursividade) no tst-eda:
* Busca Linear Recursiva
* Fibonacci
* Encontra primeiro negativo
* Encontra quebra recursivo

### O template

> Não altere o arquivo pom.xml

> O código java estará (ou você terá que colocar) no diretório **/src/main/java/**

> Os testes estarão (ou você terá que incluir) no diretório **/src/test/java/**

> Seu código é tão bom quanto seus testes. Eu vou executar meus testes quando você submeter.

> Não mude nenhuma assinatura de método, nome de classe ou localização dos arquivos. 


## Trabalhando com o código

Executar os comandos abaixo no diretório raiz do seu projeto (onde está o arquivo pom.xml).

> Compilando: `mvn compile`

> Executando os testes: `mvn test`

## Entregando o lab

> Passo 0. Modifique o arquivo README. Coloque seu nome, email @ccc e matrícula nos lugares indicados. Se você não fizer isso, não considero que sua prova foi assinada e, portanto, não vou corrigir. Não mude a formatação da linha. Apenas inclua seus dados.

> Passo 1. Certifique-se **NO TERMINAL** de que sua solução compila e passa nos testes. Isso deve ser feito com os comandos do mvn (compile e test).

> Passo 2. Submeta as suas modificações para o repositório

  * `git pull`
  * `git commit -m "entregando o lab de algoritmos recursivos"`
  * `git push origin main`
