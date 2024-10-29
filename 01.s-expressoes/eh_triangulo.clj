(defn ehTriangulo [a b c]
  (cond
    (or (<= (+ a b) c)
        (<= (+ a c) b)
        (<= (+ b c) a)) (println "nao eh")
    :else (println "eh") 
  )
)
