(defn printa [vezes palavra]
  (cond 
    (= vezes 1) (println palavra)
    (> vezes 1) (do 
                  (println palavra)
                  (printa (- vezes 1) palavra)
                )
  )
)

(def n (Integer/parseInt (read-line)))
(def p (read-line))

(printa n p)
