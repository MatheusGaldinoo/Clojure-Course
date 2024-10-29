(defn soma-quadrados-de-pares [seq]
  (reduce + (map (fn [x] (* x x)) (filter even? seq))))

(assert (= (soma-quadrados-de-pares [1 2 3 4 5 6]) 56))
(assert (= (soma-quadrados-de-pares [2 4 6]) 56))
(assert (= (soma-quadrados-de-pares [0 2 4]) 20))

