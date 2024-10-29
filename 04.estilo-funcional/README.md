# Estilo de Programação Funcional

1. Crie o diretório `ligue4.v1`. Nele, escreva em um único
   arquivo, usando a linguagem Python, um pequeno programa que
   implemente o jogo conhecido por Ligue 4 (pesquise na Web para
   ver as regras, mas a grade do jogo deve ser de 6 linhas por 7
   colunas). Nesta versão, implemente sem se preocupar nada com o
   estilo de programação. Faça o que costumamos chamar de _cowboy
   programming_. O objetivo é produzir uma solução da forma mais
   rápida possível.

   > Detalhes do jogo. A interface deve ser no terminal mesmo,
   > com bastante simplicidade. Cada jogada deve ser lida
   > diretamente da interface com um `input()` simples. A cada
   > turno, o jogador é alternado. Cada jogador joga indicando o
   > número da coluna (de `1` a `7`) onde quer colocar uma ficha
   > (ou `d` para indicar desistência do jogo). Um jogo de Ligue
   > 4 acaba quando um dos jogadores ganha ou quando desiste.
   > Contudo, o seu jogo deve permitir uma nova rodada entre os
   > dois jogadores. A cada nova rodada, deve mostrar o placar
   > (vezes que cada um ganhou e número de empates) e deve
   > perguntar se desejam jogar de novo. A entrada nesse momento
   > deve ser `s` ou `n` (para _sim_ ou _não_).

2. Crie o diretório `ligue4.v2`. Para este diretório, você deve
   copiar a versão anterior do jogo, para iniciar a atividade.
   Esta atividade consiste em você reanalisar todo o jogo,
   reprojetando e/ou reescrevendo todas as funções para produzir
   um programa inteiro no melhor compromisso com o estilo
   funcional que você puder (é muito provável que você crie
   várias, mude outras, etc).

   > Lembre que pra isso, esperamos ver um quantidade muito maior
   > de funções puras do que de funções com efeito colateral.
   > Esperamos também que as funções sejam muito, muito menores e
   > focadas em uma única atividade. E, se você precisar de
   > funções que façam coisas mais complexas, que elas sejam
   > feitas pela composição de funções puras mais simples (de
   > preferência de funções puras que possam ser reutilizadas em
   > outros contextos). Também esperamos que você não use
   > mutabilidade. Se você cria estruturas de dados e as precisa
   > mudar, prefira criar cópias modificadas (para modificar
   > cópias, faça-o restringindo a mudança ao momento de
   > criação). Outra coisa que se espera é que seu programa
   > minimize (ou nem use) loops convencionais tais como o
   > `while` e o `for`, já que eles usam variáveis que precisam
   > ter seu valor atualizado (_comprehensions_, contudo, são
   > aceitáveis no estilo). Assim, considere usar: `map` ,
   > `filter`, `reduce`, `any`,  `all`,  e `next` (obs: pra usar
   > `reduce` em Python, você precisar colocar `from functools
   > import reduce` no início do script). IMPORTANTE: as mudanças
   > não devem mudar absolutamente nada da funcionalidade do seu
   > programa.

3. Crie o diretório `ligue4.v3`. Neste diretório, você deve criar
   mais uma versão do seu programa, funcionando da mesma forma,
   mas desta vez em Clojure.

   > Detalhe: uma vez que temos uma decomposição funcional pura
   > de um programa em uma linguagem é muito comum que a tradução
   > para outra linguagem seja muito fácil. Isso ocorre porque, em
   > princípio, deve ser possível traduzir função a função de
   > forma bastante independente. Tente fazer isso. Será uma boa
   > forma de testar o quão 
