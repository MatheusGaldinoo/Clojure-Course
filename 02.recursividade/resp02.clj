(defn conta-rec [n]
  (println n)
  (conta-rec (inc n))  
)

(defn conta []
  (conta-rec 0)  
)

(conta)

; Para poder passar o parâmetro
