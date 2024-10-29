(defn fahr-celsius [temps]
  (map (fn [f] (/ (- f 32) 1.8)) temps))

(assert (= (fahr-celsius [32]) [0.0]))
(assert (= (fahr-celsius [212]) [100.0]))
