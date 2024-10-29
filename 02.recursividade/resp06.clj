(defn conta [n]
    (doseq [i (range 1 (inc n))]
      (println i)
    )
)

(conta (read))
