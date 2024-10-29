# Lista 1

1. Explique o que você entende por s-expressões?

2. Escreva cinco exemplos de s-expressões atômicas. Não use
   nenhum exemplo dos fornecidos nos slides. Também não use
   exemplos de colegas. Todos os átomos devem ser de tipos
   de dados diferentes.

3. O que é uma forma no contexto de Lisp e Clojure? Qual sua
   relação com s-expressões?

4. Escreva três exemplos de s-expressões não atômicas que não
   sejam formas e três outras que sejam formas (em Clojure).

5. O que são símbolos em Lisp/Clojure? Dê exemplos de símbolos.
   Explore a linguagem por experimentação no REPL e descubra
   outros simbolos operacionais semelhantes aos de outras
   linguagens que você tenha estudado que sejam válidos em
   Clojure. Escreva uma expressão usando cada um desses símbolos
   que você descobrir.

6. Escreva uma sequência de s-expressões que representem a
   avaliação da s-expressão `(* (+ 2 5 7) (- 8 (inc 3)) 5)`,
   passo a passo, até que seja reduzida à s-expressão atômica
   equivalente. Se precisar leia a seção sobre semântica de
   Clojure nos slides.
 
7. O que são _formas especiais_ e como elas diferem das demais
   formas? Por que `def` em uma s-expressão como `(def a
   123)` é uma forma especial e não uma simples aplicação de
   função? Por que `fn` precisa ser definida como uma forma
   especial? Por que `if` precisa ser definida como forma
   especial?

8. Analise o programa abaixo. Considerando as definições nas
   primeiras três linhas, escreva a sequência passo a passo de
   avaliação da última s-expressão, até que seja irredutível (ou
   seja, até que a computação pare). Inclua até as substituições
   das funções.

```clojure
(defn dobro [n] (* 2 n))
(defn triplo [n] (* 3 n))
(defn vezes_12 [n] (dobro (dobro (triplo n))))

(vezes_12 10)
```

9. No REPL, com a forma especial `fn`, crie uma função anônima
   (ou lambda) que receba três argumentos (`a`, `b` e `c`) que
   representam os três coeficientes inteiros de uma equação de 2o grau e que retorne o valor do determinante (o _delta_) da
   equação. Com a forma especial `def`, defina o símbolo `eq2delta` e associe-o à função anônima. Em seguida, defina a
   mesma função usando apenas a forma especial `defn`.

10. No REPL, experimente as formas especiais `if` e `cond`.  Com
    elas, escreva a função `raizes` que retorne um vetor
    contendo as duas raízes da equação.

11. As formas especiais `print` e `println` nos permitem
    imprimir dados na saída (às vezes, você precisará usar
    também a forma especial `flush` para esvaziar o buffer de
    saída e garantir que o dado seja impresso no momento
    apropriado. Estude essas formas especiais e escreva o famoso
    _Hello, World!_ em Clojure, no arquivo `hello.clj`.

12. As formas especiais `read` e `read-line` permitem ler dados
    da entrada. E a função `Integer/parseInt` permite converter
    uma string em um valor inteiro. Com base nas formas
    especiais de entrada e saída e nas definições que você mesmo
    criou anteriormente, crie um pequeno programa no arquivo
    `eq2.clj` que leia os coeficientes `a`, `b` e `c` de uma
    equação de segundo grau da entrada e que imprima suas
    raízes. Se a equação não tiver raízes, imprima a mensagem
    `sem raízes` na saída.
