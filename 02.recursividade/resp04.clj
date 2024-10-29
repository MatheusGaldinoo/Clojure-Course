(defn conta []
  (loop [acc 0]
    (println acc)
    (recur (inc acc))
  )
)

(conta)

; O programa, ao invés de ir passando a tarefa para ser executada depois, ele executa e passa para o próximo. O que evita a necessidade de ter que alocar um dado na memória e, assim, não se explode a pilha. 
