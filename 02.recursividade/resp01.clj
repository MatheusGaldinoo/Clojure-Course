(defn msg-rec [palavra]
  (println palavra)
  (msg-rec palavra)
)

(msg-rec (read-line))

; O que acontece é que a pilha estoura, ultrapassa o limite da pilha de execução do java por se tratar de uma infinitude de comandos
