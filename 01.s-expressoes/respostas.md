1. São listas de átomos ou de outras s-expressões. Átomos, por sua vez, podem ser equivalentes aos tipos primitvos de outras linguagens ou símbolos (funções, variáveis e operadores).

2. "Matheus", true, 2.71828, 18, >.

3. São expressões que podem ser executadas sem erro.

4. ("CLJ" 5 - "LISP")
   (123111147 123111080 123110976)
   ()

   (> 10 9)
   (def nome "Matheus")
   (+ (- 100 100) (/ 200 2))

5. São nomes de variáveis, funções e operadores lógicos ou matemáticos.

6. (* (+ 2 5 7) (- 8 (inc 3)) 5)
   (* (+ 2 5 7) (- 8 4) 5)
   (* 14 (- 8 4) 5)
   (* 14 4 5)
   280

7. Entre as especiais estão: def (atribui um valor a um símbolo), fn (cria uma função), defn (fusão dos dois anteriores, define uma função ligando um nome a uma determinada sequencia de operações) e if (controla o fluxo do código, pois, quando se é usado, não se deseja que seja executado tudo).

8. (vezes_12 10)
   (dobro (dobro (triplo 10)))
   (dobro (dobro (* 3 10)))
   (dobro (dobro 30))
   (dobro (* 2 30))
   (dobro 60)
   (* 2 60)
   120

