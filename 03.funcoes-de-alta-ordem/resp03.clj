(defn somador [oper]
  (fn [coll] 
   (if (empty? coll)
    0
    (+ (oper (first coll)) ((somador oper) (rest coll)))
   )
  )
)

(def soma-cubos (somador (fn [x] (* x x x))))
(def soma-dobros (somador (fn [x] (* 2 x))))
(def soma-triplos (somador (fn [x] (* 3 x))))
(def soma-pares (somador (fn [x] (if (even? x) x 0))))
(def soma (somador (fn [x] x)))
(def conta (somador (fn [_] 1)))

(assert (= 35 (soma-cubos [2 3])))
(assert (= 60 (soma-dobros [10 20])))
(assert (= 3 (soma-triplos [1 0] )))
(assert (= 20 (soma [5 5 5 5])))
(assert (= 5 (conta [2 2 2 2 2])))

(assert (= (soma-cubos [1 2 3 4]) 100))
(assert (= (soma-cubos [2 3 4 5]) 224))

(assert (= (soma-pares [1 2 3 4]) 6))
(assert (= (soma-pares [2 3 4 5]) 6))
(assert (= (soma-pares [1 2 3 4 5 6]) 12))
(assert (= (soma-pares [1 3 5]) 0))

(assert (= (soma-dobros [1 2 3 4]) 20))
(assert (= (soma-dobros [2 3 4 5]) 28))

(assert (= (soma-triplos [1 2 3 4]) 30))
(assert (= (soma-triplos [2 3 4 5]) 42))

(assert (= (soma [2 3 4 5]) 14))
(assert (= (conta [2 3 4 5]) 4))
