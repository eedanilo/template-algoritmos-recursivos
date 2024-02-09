# Identificação

* Nome: 
* Email (@ccc): 
* Matrícula: 

# Roteiro: Algoritmos Recursivos

## O template

> Não altere o arquivo pom.xml

> O código java estará (ou você terá que colocar) no diretório **/src/main/java/**

> Os testes estarão (ou você terá que incluir) no diretório **/src/test/java/**

> Seu código é tão bom quanto seus testes. Eu vou executar meus testes quando você submeter.

> Não mude nenhuma assinatura de método, nome de classe ou localização dos arquivos. Mas você pode/deve criar outros métodos e classes, desde que passem nos testes.

> Compilando: `mvn compile` na raiz do projeto.

> Executando os testes: `mvn test` na raiz do projeto.


## Introdução

Depois deste roteiro você será capaz de implementar alguns algoritmos recursivos clássicos e comparar o tempo de execução das versões recursivas e iterativas.

**O exemplo.** Vamos trabalhar com a busca binária, que vimos na aula teórica.  Veja em `/src/main/java` que eu já implementei a versão iterativa deste algoritmo e já preparei um `main` para logar a execução com os dados.

Neste roteiro nós vamos gerar um arquivo com arrays de diferentes tamanhos, executar algoritmos que operam sobre esses arrays e medir o tempo de execução para então fazermos a análise.

Agora é com vocês!

## A tarefa. 

### Implementação e testes

Comece gerando o arquivo que vai conter arrays de diferentes tamanhos. No diretório `scripts`, execute:

> python gera-arrays.py > ../data/input-arrays.data

Veja no diretório `data` que o arquivo `input-arrays.data` contém arrays de tamanhos 1000, 10000, 100000 e 1000000, que vamos usar para ver o desempenho dos nossos algoritmos buscando elementos neles. 

Agora execute a classe `Main` passando como entrada esses arrays. No diretório `src/main/java`, execute:

> java Main < ../../../data/input-arrays.data

Agora, **implemente a versão recursiva da busca binária**. Modifique o código para logar o tempo de execução da sua implementação também e redirecione a saída para um arquivos chamado `execution.data`, que deve conter os dados da versão recursiva e da versão iterativa.

> java Main < ../../../data/input-arrays.data > ../../../data/execution.data

Confira se o arquivo `execution.data` dentro do diretório `data` foi gerado corretamente.

Ah...confira (sempre!) se você passa nos testes: `mvn test`.

### Análise

Não vamos plotar gráfico dessa vez. Analise os dados presentes no arquivo `execution.data`.

Perguntas importantes:
  * No código, eu executei, para cada entrada, 30 rodadas e peguei a mediana do tempo de execução para representar o mesmo. Por que eu fiz isso?
    
  > INSIRA SUA RESPOSTA AQUI

  * Analise os dados de tempo de execução do algoritmo iterativo. O que você percebe sobre a relação entre o aumento da entrada e o aumento do tempo de execução?

  > INSIRA SUA RESPOSTA AQUI
    
  * Analise os dados de tempo de execução do algoritmo recursivo. O que você percebe sobre a relação entre o aumento da entrada e o aumento do tempo de execução?
   
  > INSIRA SUA RESPOSTA AQUI
  
  * Na teoria, os algoritmos tem a mesma eficiência assintótica?
   
   > INSIRA SUA RESPOSTA AQUI
  
  * Na prática, qual é mais veloz? Por que você acha que isso acontece?
   
   > INSIRA SUA RESPOSTA AQUI
  
  * Na teoria, qual a classe de complexidade dos dois algoritmos? O que isso significa?

   > INSIRA SUA RESPOSTA AQUI

  * Esses são algoritmos eficientes de busca? Por que?
   
   > INSIRA SUA RESPOSTA AQUI

## Mais estudo

Implemente as seguintes questões (com recursividade) no tst-eda:
* Busca Linear Recursiva
* Fibonacci
* Encontra primeiro negativo
* Encontra quebra recursivo

## Entregando o lab

> Passo 0. Modifique o arquivo README. Coloque seu nome, email @ccc e matrícula nos lugares indicados. Se você não fizer isso, não considero que sua prova foi assinada e, portanto, não vou corrigir. Não mude a formatação da linha. Apenas inclua seus dados.

> Passo 1. Certifique-se **NO TERMINAL** de que sua solução compila e passa nos testes. Isso deve ser feito com os comandos do mvn (compile e test).

> Passo 2. Certifique-se de que você respondeu as perguntas teóricas onde foi indicado aqui no README.

> Passo 3. Submeta as suas modificações para o repositório

  * `git pull`
  * `git commit -m "entregando o lab de algoritmos recursivos"`
  * `git push origin main`
