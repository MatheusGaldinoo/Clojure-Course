(require '[clojure.string :as str])

(defn ini-vogais [palavras]
  (let [vogais #{\a \e \i \o \u}]
    (filter (fn [palavra]
              (vogais (first (str/lower-case palavra))))
            palavras)))

(assert (= (ini-vogais ["banana" "kiwi" "abacate"]) '("abacate")))
(assert (= (ini-vogais []) '()))

