(defn raizes [a b c]
  (let [
        delta (- (* b b) (* 4 a c)) 
        raiz (fn [operador]
               (/ (operador (- b) (Math/pow delta 0.5)) (* 2 a))
               )
    ]
    (cond 
      (< delta 0) (println "sem raízes")
      (= delta 0) (println (raiz +))
      (> delta 0) (println (raiz +) "e" (raiz -))
    )
  )  
)

(def a (Integer/parseInt (read-line)))
(def b (Integer/parseInt (read-line)))
(def c (Integer/parseInt (read-line)))

(raizes a b c)
