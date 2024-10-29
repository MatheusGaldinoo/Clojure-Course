(defn ehBissexto [ano]
  (cond   
    (= 0 (mod ano 400)) (println "eh bissexto")
    (and (= 0 (mod ano 4)) (not= 0 (mod ano 100))) (println "eh bissexto")
    :else (println "nao eh")
  )
)

