(defn ehTriangulo [a b c]
  (and (> (+ a b) c)
       (> (+ a c) b)
       (> (+ b c) a))
)

(defn tipo [l1 l2 l3]
  (if (not (ehTriangulo l1 l2 l3))
    nil
    (cond 
      (and (= l1 l2) (= l1 l3)) :equilatero
      (and (not= l1 l2) (not= l1 l3) (not= l2 l3)) :escaleno
      :else :isosceles
    )   
  ) 
)
